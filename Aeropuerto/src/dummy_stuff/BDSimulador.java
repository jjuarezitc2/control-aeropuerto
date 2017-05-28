package dummy_stuff;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import aeropuertos.Aeropuerto;
import aeropuertos.BJuarez;
import aeropuertos.MEscobedo;
import aviones.Avion;
import aviones.Boeing747;
import constantes.Periodicidad;
import vuelos.Vuelo;
import vuelos.VueloCarga;

public class BDSimulador {
	public static List<Vuelo> getAllVuelos(Aeropuerto aeropuerto){
		List<Vuelo> lista = new ArrayList<Vuelo>();
		
		//
		Avion boeing = new Boeing747();
		Aeropuerto bJuarez = new BJuarez();
		Aeropuerto mEscobedo = new MEscobedo();
		Object capacidad = new Object();
		
		// un vuelo específicamente el día 01 del mes 01 del año 2017
		Date fecha = new Date(117,01,01);
		Periodicidad periodicidad = Periodicidad.DIARIA;
		
		Vuelo vueloCarga = new VueloCarga.Builder().avion(boeing)
												   .aeropuertoOrigen(bJuarez)
												   .aeropuertoDestino(mEscobedo)
												   .capacidad(capacidad)
												   .fecha(fecha)
												   .periodicidad(periodicidad)
												   .build();
		
		Vuelo vueloCarga2 = new VueloCarga.Builder().avion(boeing)
				   .aeropuertoOrigen(mEscobedo)
				   .aeropuertoDestino(bJuarez)
				   .capacidad(capacidad)
				   .fecha(fecha)
				   .periodicidad(periodicidad)
				   .build();
		
		lista.add(vueloCarga);
		lista.add(vueloCarga2);
		return lista;
	}
}
