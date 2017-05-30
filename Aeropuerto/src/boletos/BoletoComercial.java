package boletos;

import java.util.Calendar;

import boletos.Boleto.Builder;
import constantes.PrioridadAbordaje;

public class BoletoComercial extends Boleto{

	
	
	public static class Builder extends Boleto.Builder{
		
		
		
		@Override
		public Boleto build() {
			this.costo();
			return new BoletoComercial(this);
		}
		
		
		public boletos.Boleto.Builder costo() {
			
			this.costo = (this.prioridadAbordaje.equals(PrioridadAbordaje.PRIMERA_CLASE)) ?  (this.getVuelo().getCostoBase()*1.50) : (this.getVuelo().getCostoBase()*1.20);
			return null;
		}
		
		

	}
		
	public BoletoComercial(Builder builder) {
		super(builder);
	}

	@Override
	public String toString() {
		return "Clave boleto: " + this.getClave() + 
				"\nNombre: " + this.getNombre() + " " + this.getApPaterno() + 
				"\nPrioridad: " + this.getPrioridadAbordaje() + 
				"\nOrigen: " + this.getVuelo().getAeropuertoOrigen().getCodeIATA() + 
				"\nDestino: " + this.getVuelo().getAeropuertoDestino().getCodeIATA() + 
				"\nCosto: $" + this.getCosto() + 
				"\nFecha salida: " + this.getVuelo().getFechaSalida().get(Calendar.DAY_OF_MONTH) + " de " + this.getVuelo().getFechaSalida().get(Calendar.MONTH) + " de " + this.getVuelo().getFechaSalida().get(Calendar.YEAR) + 
				"\nHora salida: " + this.getVuelo().getFechaSalida().get(Calendar.HOUR_OF_DAY) + " : " + this.getVuelo().getFechaSalida().get(Calendar.MINUTE) + 
				"\nAerolinea : " + this.getVuelo().getAerolinea();
	}
	
	

}
