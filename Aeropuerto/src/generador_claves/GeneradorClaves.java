package generador_claves;

import bd.BD;
import vuelos.Vuelo;

public class GeneradorClaves {
	public static String generaClave(Vuelo vuelo){
		String origen = vuelo.getAeropuertoOrigen().getClave();
		String destino = vuelo.getAeropuertoDestino().getClave();
		String unixTime = ((System.currentTimeMillis() / 1000L) - 2000000) + "";
		return origen + destino + unixTime;
	}
}
