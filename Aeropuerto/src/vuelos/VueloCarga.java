package vuelos;

public class VueloCarga extends Vuelo{
	
	private int capacidadTotal;
	private int capacidadOcupada;
	private boolean privado;
	
	public boolean isPrivado() {
		return privado;
	}

	public void setPrivado(boolean privado) {
		this.privado = privado;
	}

	public static class Builder extends Vuelo.Builder{
		
		private int capacidadTotal;
		private int capacidadOcupada;
		
		public Builder capacidadTotal(int capacidad){
			this.capacidadTotal = capacidad;
			return this;
		}
		
		public Builder capacidadOcupada(int capacidad){
			this.capacidadOcupada = capacidad;
			return this;
		}

		@Override
	public Vuelo build() {
			return new VueloCarga(this);
		}	
	}
	
	public int getCapacidadTotal(){
		return capacidadTotal;
	}
	
	public int getCapacidadOcupada(){
		return capacidadOcupada;
	}
	
	public void incrementaCapacidadOcupada(int nuevaCarga){
		capacidadOcupada = capacidadOcupada - nuevaCarga;
	}
	
	public VueloCarga(Builder builder) {
		super(builder);
		this.capacidadTotal = builder.capacidadTotal;
		this.capacidadOcupada = builder.capacidadOcupada;
	}
} 