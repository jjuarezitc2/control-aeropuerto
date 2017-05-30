package boletos;


import constantes.PrioridadAbordaje;

public class BoletoPrivado extends Boleto {
	
	private PrioridadAbordaje prioridadAbordaje;
	
	public static class Builder extends Boleto.Builder{

		private PrioridadAbordaje prioridadAbordaje;
		
		@Override
		public Boleto build() {
			this.prioridadAbordaje(PrioridadAbordaje.PRIMERA_CLASE);
			return new BoletoPrivado(this);
		}
						
		public Builder prioridadAbordaje(PrioridadAbordaje prioridadAbordaje){
			this.prioridadAbordaje = prioridadAbordaje;
			return this;
		}

	}
		
	public BoletoPrivado(Builder builder) {
		super(builder);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}
}
