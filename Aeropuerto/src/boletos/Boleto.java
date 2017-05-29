package boletos;

import java.util.ArrayList;
import java.util.List;
import constantes.PrioridadAbordaje;
import vuelos.Vuelo;
import vuelos.Vuelo.Builder;

public abstract class Boleto {
	
	
	private String clave;
	private String nombre;
	private String apPaterno;	
	private PrioridadAbordaje prioridadAbordaje; 		
	private Vuelo vuelo;
	private double costo;
	
	public static abstract class Builder{
		private String clave;
		private String nombre;
		private String apPaterno;	
		private PrioridadAbordaje prioridadAbordaje; 		
		private Vuelo vuelo;
		protected double costo;
		
		public Builder() {}
		
		public Builder clave(String clave){
			this.clave = clave;
			return this;
		}
		
		public Builder nombre(String nombre){
			this.nombre = nombre;
			return this;
		}
		
		public Builder apPaterno(String apPaterno){
			this.apPaterno = apPaterno;
			return this;
		}
		
		public Builder prioridadAbordaje(PrioridadAbordaje prioridadAbordaje){
			this.prioridadAbordaje = prioridadAbordaje;
			return this;
		}
			
		public Builder vuelo(Vuelo vuelo){
			this.vuelo = vuelo;
			return this;
		}
		
		//public abstract Builder costo();
			//this.costo = (this.prioridadAbordaje.equals(PrioridadAbordaje.PRIMERA_CLASE)) ?  (this.vuelo.getCostoBase()*1.50) : (this.vuelo.getCostoBase()*1.20);
			
		//}			
		
		public abstract Boleto build();
		
		public Vuelo getVuelo(){
			return this.vuelo;
		}
		
	}
	

	public Boleto(Builder builder){
		this.clave = builder.clave;
		this.nombre = builder.nombre;
		this.apPaterno = builder.apPaterno;
		this.prioridadAbordaje = builder.prioridadAbordaje;
		this.vuelo = builder.vuelo;
		this.costo = builder.costo;
		
	}
	
	public Vuelo getVuelo(){
		return this.vuelo;
	}

	
	
	
	
}
