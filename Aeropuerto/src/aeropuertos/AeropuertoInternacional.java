package aeropuertos;



public class AeropuertoInternacional extends Aeropuerto{
	
	public static class Builder extends Aeropuerto.Builder{

		@Override
		public Aeropuerto build() {
			this.clasificacion("Internacional");
			return new AeropuertoInternacional(this);
		}


	}
		
	public AeropuertoInternacional(Builder builder) {
		super(builder);
	}
	

}
