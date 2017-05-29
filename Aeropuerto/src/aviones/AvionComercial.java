package aviones;



public class AvionComercial extends Avion {
	
	public static class Builder extends Avion.Builder{

	@Override
	public Avion build() {
		this.tipo("Comercial");
		return new AvionComercial(this);
	}


	}
	
	public AvionComercial(Builder builder) {
		super(builder);
	}

}
