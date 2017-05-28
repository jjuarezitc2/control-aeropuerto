package vuelos;

import java.util.Date;

import aeropuertos.Aeropuerto;
import aviones.Avion;

public abstract class Vuelo {
	@SuppressWarnings("unused")
	private Avion avion;
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	@SuppressWarnings("unused")
	private Object capacidad;
	private Date fecha;
	
	public static abstract class Builder{
		private Avion avion;
		private Aeropuerto aeropuertoOrigen;
		private Aeropuerto aeropuertoDestino;
		private Object capacidad;
		private Date fecha;
		
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
		
		public abstract Vuelo build();
	}
	
	public Vuelo(Builder builder){
		this.avion = builder.avion;
		this.aeropuertoOrigen = builder.aeropuertoOrigen;
		this.aeropuertoDestino = builder.aeropuertoDestino;
		this.capacidad = builder.capacidad;
		this.fecha = builder.fecha;
	}
	
	public String toString(){
		return "Origen: " + this.aeropuertoOrigen 
				+ "\nDestino: " + this.aeropuertoDestino 
				+ "\nFecha: " + this.fecha;
	}
}