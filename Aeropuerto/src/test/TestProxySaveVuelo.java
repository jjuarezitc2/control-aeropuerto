package test;

import java.util.Date;

import aeropuertos.Aeropuerto;

import aviones.Avion;
import bd.BD;
import constantes.Periodicidad;
import dummy_stuff.BDSimulador;
import proxy.*;
import vuelos.Vuelo;
import vuelos.VueloCarga;

public class TestProxySaveVuelo {
	public static void main(String[] args){
		//
		BDInterface bd = new ProxyBD();
		
		//
		Avion boeing = BD.aviones.get(3);
		Aeropuerto bJuarez = BD.aeropuertos.get(2);
		Aeropuerto mEscobedo = BD.aeropuertos.get(5);
		int capacidad = 100;
		//Date fecha = new Date(117,01,01);
		Periodicidad periodicidad = Periodicidad.DIARIA;
		
		Vuelo vueloCarga = new VueloCarga.Builder().avion(boeing)
												   .aeropuertoOrigen(bJuarez)
												   .aeropuertoDestino(mEscobedo)
												  // .capacidad(capacidad)
												   .fecha(2017,4,12)
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
 