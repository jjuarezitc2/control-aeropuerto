package vuelos;

public class VueloPrivado extends Vuelo{
	
	public static class Builder extends Vuelo.Builder{

		@Override
		public Vuelo build() {
			return new VueloPrivado(this);
		}	
	}
	
	public VueloPrivado(Builder builder) {
		super(builder);
	}
}
 