package vuelos;

public class VueloCarga extends Vuelo{
	
	public static class Builder extends Vuelo.Builder{

		@Override
		public Vuelo build() {
			return new VueloCarga(this);
		}	
	}
	
	public VueloCarga(Builder builder) {
		super(builder);
	}
} 