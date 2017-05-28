package proxy;

import vuelos.Vuelo;

public interface BDInterface {
	public void persistVuelo(Vuelo vuelo) throws Exception;
}
