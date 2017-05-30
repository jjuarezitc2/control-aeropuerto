package aeropuertos;


import java.util.List;
import constantes.IATA;
import pistas.Pista;
import torre_control.TorreControl;


public abstract class Aeropuerto {
	
	private String clave;
	private String nombre;	
	private IATA codeIATA;
	private String clasificacion;
	private List<Pista> listaPistas;	
	private TorreControl torreControl;
	
	public static abstract class Builder{
		private String clave;
		private String nombre;
		private IATA codeIATA;
		private String clasificacion;
		private List<Pista> pistas;	
		private TorreControl torreControl;
		
		public Builder() {}
		
		public Builder clave(String clave){
			this.clave = clave;
			return this;
		}
		
		public Builder nombre(String nombre){
			this.nombre = nombre;
			return this;
		}
		
		public Builder iata(IATA codeIATA){
			this.codeIATA = codeIATA;
			return this;
		}
		
		public Builder clasificacion(String clasificacion){
			this.clasificacion = clasificacion;
			return this;
		}
		
		public Builder  pistas( List<Pista> pistas){
			this.pistas = pistas;
			return this;
		}
			
		public Builder torreControl(TorreControl torreControl){
			this.torreControl = torreControl;
			return this;
		}
			
		public abstract Aeropuerto build();
		
	}
	
	
	public Aeropuerto(Builder builder){
		this.clave = builder.clave;
		this.nombre = builder.nombre;		
		this.codeIATA = builder.codeIATA;
		this.clasificacion = builder.clasificacion;
		this.listaPistas = builder.pistas;
		this.torreControl = builder.torreControl;
		
	}


	public String getClave() {
		return clave;
	}


	public String getNombre() {
		return nombre;
	}


	public IATA getCodeIATA() {
		return codeIATA;
	}

	
	public String getClasificacion() {
		return clasificacion;
	}


	public List<Pista> getListaPistas() {
		return listaPistas;
	}


	public TorreControl getTorreControl() {
		return torreControl;
	}
	
	
	
}
 