package vuelos;

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
	@SuppressWarnings("unused")
	private Avion avion;
	@SuppressWarnings("unused")
	private Object capacidad;
	@SuppressWarnings("unused")
	private Periodicidad periodicidad;
	
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	private Date fecha;
	
	
	public static abstract class Builder{
		private Avion avion;
		private Aeropuerto aeropuertoOrigen;
		private Aeropuerto aeropuertoDestino;
		private Object capacidad;
		private Date fecha;
		private Periodicidad periodicidad;
		
		public Builder() {}
		
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
		
		public Builder capacidad(Object capacidad){
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
		
		public abstract Vuelo build();
	}
	
	public Vuelo(Builder builder){
		this.avion = builder.avion;
		this.aeropuertoOrigen = builder.aeropuertoOrigen;
		this.aeropuertoDestino = builder.aeropuertoDestino;
		this.capacidad = builder.capacidad;
		this.fecha = builder.fecha;
		this.periodicidad = builder.periodicidad;
	}
	
	public Aeropuerto getAeropuertoOrigen(){
		return this.aeropuertoOrigen;
	}
	
	public Date getFecha(){
		return this.fecha;
	}
	
	public String toString(){
		return "Origen: " + this.aeropuertoOrigen 
				+ "\nDestino: " + this.aeropuertoDestino 
				+ "\nFecha: " + this.fecha;
	}
} 