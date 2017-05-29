package aviones;



public class AvionPrivado extends Avion{
	
	public static class Builder extends Avion.Builder{
	
		@Override
		public Avion build() {
			this.tipo("Privado");
			return new AvionPrivado(this);
		}

	}
	
	public AvionPrivado(Builder builder) {		
		super(builder);		
	}

	
}
