package test;

import java.util.Date;

import aeropuertos.Aeropuerto;

import aviones.Avion;
import bd.BD;
import constantes.Periodicidad;
import dummy_stuff.BDSimulador;
import modelo.EmpalmesChecker;
import vuelos.Vuelo;
import vuelos.VueloCarga;

public class TestChecadorEmpalmes {
	public static void main(String[] args){
		Avion boeing = BD.aviones.get(3);
		Aeropuerto bJuarez = BD.aeropuertos.get(2);
		Aeropuerto mEscobedo = BD.aeropuertos.get(5);
		int capacidad = 100;
		Date fecha = new Date();
		Date fecha2 = new Date();
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
		
		System.out.println(EmpalmesChecker.seEmpalman(vueloCarga, vueloCarga2));
	}
}
 