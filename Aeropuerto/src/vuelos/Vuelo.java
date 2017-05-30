package vuelos;

import java.text.SimpleDateFormat;
import java.util.Date;

import aeropuertos.Aeropuerto;
import aviones.Avion;
import constantes.Periodicidad;


/*
 * TODO: definir el tipo que tendrá la variable "capacidad".
 * Por el momento fue definida como Object. Es necesario hacer
 * la definición y ajuste correspondiente. ¿Será un primitivo o
 * definiremos una nueva clase?
 * */
public abstract class Vuelo {
	private String claveVuelo;
	@SuppressWarnings("unused")
	private Avion avion;
	@SuppressWarnings("unused")
	private int capacidad;
	@SuppressWarnings("unused")
	private Periodicidad periodicidad;	
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	private Date fecha;
	//Costo base del vuelo
	private double costoBase;
	
	
	public static abstract class Builder{
		private String claveVuelo;
		private Avion avion;
		private Aeropuerto aeropuertoOrigen;
		private Aeropuerto aeropuertoDestino;
		private int capacidad;
		private Date fecha;
		private Periodicidad periodicidad;
		private double costoBase;
		
		public Builder() {
			
		}
		
		public Builder claveVuelo(){
			this.claveVuelo = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			return this;
		}
		
		public Builder avion(Avion avion){
			this.avion = avion;
			return this;
		}
		
		public Builder aeropuertoOrigen(Aeropuerto aeropuertoOrigen){
			this.aeropuertoOrigen = aeropuertoOrigen;
			return this;
		}
		
		public Builder aeropuertoDestino(Aeropuerto aeropuertoDestino){
			this.aeropuertoDestino = aeropuertoDestino;
			return this;
		}
		
		public Builder capacidad(int capacidad){
			this.capacidad = capacidad;
			return this;
		}
		
		public Builder fecha(Date fecha){
			this.fecha = fecha;
			return this;
		}
		
		public Builder periodicidad(Periodicidad periodicidad){
			this.periodicidad = periodicidad;
			return this;
		}
		
		public Builder costoBase(double costoBase){
			this.costoBase = costoBase;
			return this;
		}
		
		public abstract Vuelo build();
	}
	
	public Vuelo(Builder builder){
		this.claveVuelo = builder.claveVuelo;
		this.avion = builder.avion;
		this.aeropuertoOrigen = builder.aeropuertoOrigen;
		this.aeropuertoDestino = builder.aeropuertoDestino;
		this.capacidad = builder.capacidad;
		this.fecha = builder.fecha;
		this.periodicidad = builder.periodicidad;
		this.costoBase = builder.costoBase;
	}
	
	public Aeropuerto getAeropuertoOrigen(){
		return this.aeropuertoOrigen;
	}
	
	public Date getFecha(){
		return this.fecha;
	}
	
	public double getCostoBase(){
		return this.costoBase;
	}
	
	
	
	public String getClaveVuelo() {
		return claveVuelo;
	}

	public Avion getAvion() {
		return avion;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public Periodicidad getPeriodicidad() {
		return periodicidad;
	}

	public Aeropuerto getAeropuertoDestino() {
		return aeropuertoDestino;
	}

	public String toString(){
		return "Clave vuelo: " + this.claveVuelo
				+ "\nOrigen: " + this.aeropuertoOrigen 
				+ "\nDestino: " + this.aeropuertoDestino 
				+ "\nFecha: " + this.fecha;
	}
} 