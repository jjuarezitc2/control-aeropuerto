package aviones;


public class AvionCarga extends Avion{
	
	public static class Builder extends Avion.Builder{

	@Override
	public Avion build() {
		this.tipo("Carga");
		return new AvionCarga(this);
	}

	}
	
	public AvionCarga(Builder builder) {
		super(builder);
	}

}
