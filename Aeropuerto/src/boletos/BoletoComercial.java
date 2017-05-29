package boletos;

import boletos.Boleto.Builder;
import constantes.PrioridadAbordaje;

public class BoletoComercial extends Boleto{

	
	
	public static class Builder extends Boleto.Builder{
		
		private PrioridadAbordaje prioridadAbordaje;
		
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

}
