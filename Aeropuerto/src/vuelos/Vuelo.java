package vuelos;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import aeropuertos.Aeropuerto;
import aviones.Avion;
import constantes.Aerolineas;
import constantes.Periodicidad;


/*
 * TODO: definir el tipo que tendrá la variable "capacidad".
 * Por el momento fue definida como Object. Es necesario hacer
 * la definición y ajuste correspondiente. ¿Será un primitivo o
 * definiremos una nueva clase?
 * */
public abstract class Vuelo {
	private String claveVuelo;
	private Avion avion;

	private Periodicidad periodicidad;	
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	private Calendar fechaSalida  = new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
	private double costoBase;
	private long duracion;
	Calendar fechaLlegadaReal;
	private Aerolineas aerolinea; 
	
	public static abstract class Builder{
		private String claveVuelo;
		private Avion avion;
		private Aeropuerto aeropuertoOrigen;
		private Aeropuerto aeropuertoDestino;
	//	private int capacidad;
		private Calendar fechaSalida  = new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
		private Periodicidad periodicidad;
		private double costoBase;
		private long duracion;
		private Aerolineas aerolinea; 
		
		
		public Builder() {
			fechaSalida.set(Calendar.DAY_OF_YEAR,0);fechaSalida.set(Calendar.MONTH,0);fechaSalida.set(Calendar.DAY_OF_MONTH, 0);
			fechaSalida.set(Calendar.HOUR_OF_DAY, 0); fechaSalida.set(Calendar.MINUTE, 0);fechaSalida.set(Calendar.SECOND, 0);fechaSalida.set(Calendar.MILLISECOND, 0);		
		}
		
		public Builder claveVuelo(String claveVluelo){
			//PENDIENTE REFINRLA CREACION DE CLAVES DE VUELOS
			//this.claveVuelo = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
			this.claveVuelo = claveVluelo;
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
		
				
		public Builder fecha(int dia, int mes, int anio){			
			this.fechaSalida.set(anio, mes, dia);
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
		
		public Builder duracion(long duracion){
			this.duracion = duracion;
			return this;
		}
		
		public Builder horaSalida(int hora, int minuto){
			this.fechaSalida.set(Calendar.HOUR_OF_DAY, hora);
			this.fechaSalida.set(Calendar.MINUTE, minuto);
			return this;
		}
		
		public Builder aerolinea(Aerolineas aerolinea){
			this.aerolinea = aerolinea;
			return this;
		}
		
		public abstract Vuelo build();
	}
	
	public Vuelo(Builder builder){
		this.claveVuelo = builder.claveVuelo;
		this.avion = builder.avion;
		this.aeropuertoOrigen = builder.aeropuertoOrigen;
		this.aeropuertoDestino = builder.aeropuertoDestino;		
		this.fechaSalida = builder.fechaSalida;
		this.periodicidad = builder.periodicidad;
		this.costoBase = builder.costoBase;
		this.duracion = builder.duracion;	
		this.aerolinea = builder.aerolinea;
		
	}
	
	public Aeropuerto getAeropuertoOrigen(){
		return this.aeropuertoOrigen;
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

	public Aerolineas getAerolinea() {
		return aerolinea;
	}

	public Periodicidad getPeriodicidad() {
		return periodicidad;
	}

	public Aeropuerto getAeropuertoDestino() {
		return aeropuertoDestino;
	}
	
	public long getDuracion() {
		return duracion;
	}

	public Calendar getFechaSalida() {
		return fechaSalida;
	}

	public String toString(){
		return "Clave vuelo: " + this.claveVuelo
				+ "\nOrigen: " + this.aeropuertoOrigen.getCodeIATA() 
				+ "\nDestino: " + this.aeropuertoDestino .getCodeIATA()
				+ "\nFecha: " + this.fechaSalida.getTime();
				
	}
} 