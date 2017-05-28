package test;

import java.util.Date;

import aeropuertos.Aeropuerto;
import aeropuertos.BJuarez;
import aeropuertos.MEscobedo;
import aviones.Avion;
import aviones.Boeing747;
import constantes.Periodicidad;
import proxy.*;
import vuelos.Vuelo;
import vuelos.VueloCarga;

public class TestProxySaveVuelo {
	public static void main(String[] args){
		//
		BDInterface bd = new ProxyBD();
		
		//
		Avion boeing = new Boeing747();
		Aeropuerto bJuarez = new BJuarez();
		Aeropuerto mEscobedo = new MEscobedo();
		Object capacidad = new Object();
		Date fecha = new Date(117,01,01);
		Periodicidad periodicidad = Periodicidad.DIARIA;
		
		Vuelo vueloCarga = new VueloCarga.Builder().avion(boeing)
												   .aeropuertoOrigen(bJuarez)
												   .aeropuertoDestino(mEscobedo)
												   .capacidad(capacidad)
												   .fecha(fecha)
												   .periodicidad(periodicidad)
												   .build();
		
		//
		try {
			bd.persistVuelo(vueloCarga);
		} catch (Exception e) {
			System.out.println("Error: " + e.getMessage());
			e.printStackTrace();
		}
	}
}