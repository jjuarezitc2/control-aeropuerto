package vuelos;

public class VueloComercial extends Vuelo{
	
	public static class Builder extends Vuelo.Builder{

		@Override
		public Vuelo build() {
			return new VueloComercial(this);
		}	
	}
	
	public VueloComercial(Builder builder) {
		super(builder);
	}
}