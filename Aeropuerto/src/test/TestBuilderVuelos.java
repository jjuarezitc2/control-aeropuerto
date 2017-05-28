package test;

import java.util.Date;

import aeropuertos.*;
import aviones.*;
import vuelos.*;

public class TestBuilderVuelos {
	public static void main(String[] args){
		Avion boeing = new Boeing747();
		Aeropuerto bJuarez = new BJuarez();
		Aeropuerto mEscobedo = new MEscobedo();
		Object capacidad = new Object();
		Date fecha = new Date();
		
		Vuelo vueloCarga = new VueloCarga.Builder().avion(boeing)
												   .aeropuertoOrigen(bJuarez)
												   .aeropuertoDestino(mEscobedo)
												   .capacidad(capacidad)
												   .fecha(fecha)
												   .build();
		
		System.out.println(vueloCarga);
	}
}
