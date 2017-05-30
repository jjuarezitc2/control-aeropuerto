package aeropuertos;



public class AeropuertoNacional extends Aeropuerto{
	
	public static class Builder extends Aeropuerto.Builder{

		@Override
		public Aeropuerto build() {
			this.clasificacion("Nacional");
			return new AeropuertoNacional(this);
		}


	}
		
	public AeropuertoNacional(Builder builder) {
		super(builder);
	}

}
