package aviones;

import java.text.SimpleDateFormat;
import java.util.Date;

import vuelos.Vuelo;
import vuelos.Vuelo.Builder;

public abstract class Avion {
	
	private String clave;
	private String modelo;
	private String tipo;
	private int capacidadPrimera;
	private int capacidadTurista;
	private int capacidadMaxima;
	private double altura;
	private double longitud;
	private double envergadura;
	private int pistaLargo;
	private int pistaAncho;	
	
	
	
	public static abstract class Builder{
		private String clave;
		private String modelo;
		protected String tipo;
		private int capacidadPrimera;
		private int capacidadTurista;
		private int capacidadMaxima;
		private double altura;
		private double longitud;
		private double envergadura;		
		private int pistaLargo;
		private int pistaAncho;
		
		public Builder() {}
		
		public Builder clave(String clave){
			this.clave = clave;
			return this;
		}
		
		public Builder modelo(String modelo){
			this.modelo = modelo;
			return this;
		}
		
		public Builder tipo(String tipo){
			this.tipo = tipo;
			return this;
		}
			
		public Builder capacidadMaxima(int capacidadMaxima){
			this.capacidadMaxima = capacidadMaxima;
			return this;
		}
		
		public Builder capacidadPrimera(int capacidadPrimera){
			this.capacidadPrimera = capacidadPrimera;
			return this;
		}
		
		public Builder capacidadTurista(int capacidadTurista){
			this.capacidadTurista = capacidadTurista;
			return this;
		}
		
		public Builder altura(double altura){
			this.altura = altura;
			return this;
		}
		
		public Builder longitud(double longitud){
			this.longitud = longitud;
			return this;
		}
		
		public Builder envergadura(double envergadura){
			this.envergadura = envergadura;
			return this;
		}
		
		public Builder pistaLargo(int pistaLargo){
			this.pistaLargo = pistaLargo;
			return this;
		}
		
		public Builder pistaAncho(int pistaAncho){
			this.pistaAncho = pistaAncho;
			return this;
		}
		
		public abstract Avion build();
		
		
	}


	public Avion(Builder builder){		
		this.clave = builder.clave;
		this.modelo = builder.modelo;
		this.tipo = builder.tipo;
		this.capacidadPrimera = builder.capacidadPrimera;
		this.capacidadTurista = builder.capacidadTurista;	
		this.capacidadMaxima = builder.capacidadMaxima;
		this.altura = builder.altura;
		this.longitud = builder.longitud;
		this.envergadura = builder.envergadura;
		this.pistaLargo = builder.pistaLargo;
		this.pistaAncho = builder.pistaAncho;
	}


	public String getClave() {
		return this.clave;
	}


	public String getModelo() {
		return this.modelo;
	}


	public String getTipo() {
		return this.tipo;
	}

	public int getCapacidadMaxima() {
		return this.capacidadMaxima;
	}
	
	public int getCapacidadPrimera() {
		return this.capacidadPrimera;
	}

	public int getCapacidadTurista() {
		return this.capacidadTurista;
	}

	public double getAltura() {
		return this.altura;
	}


	public double getLongitud() {
		return this.longitud;
	}


	public double getEnvergadura() {
		return this.envergadura;
	}


	public int getPistaLargo() {
		return this.pistaLargo;
	}


	public int getPistaAncho() {
		return this.pistaAncho;
	}
	
	public String toString(){
		return "Clave: " + this.clave 
				+ "\nModelo: " + this.modelo 
				+ "\nTipo: " + this.tipo;
	}
	
}
 