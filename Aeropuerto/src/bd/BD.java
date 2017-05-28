package bd;

import proxy.BDInterface;
import vuelos.Vuelo;

public class BD implements BDInterface{

	@Override
	public void persistVuelo(Vuelo vuelo) {
		System.out.println("Supongamos que ya se guardo el vuelo... supongamos, porque no hay ni madres de JPA xD");
	}

}
