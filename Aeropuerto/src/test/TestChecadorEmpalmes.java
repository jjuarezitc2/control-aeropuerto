package test;

import java.util.Date;

import aeropuertos.Aeropuerto;
import aeropuertos.BJuarez;
import aeropuertos.MEscobedo;
import aviones.Avion;
import aviones.Boeing747;
import constantes.Periodicidad;
import modelo.EmpalmesChecker;
import vuelos.Vuelo;
import vuelos.VueloCarga;

public class TestChecadorEmpalmes {
	public static void main(String[] args){
		Avion boeing = new Boeing747();
		Aeropuerto bJuarez = new BJuarez();
		Aeropuerto mEscobedo = new MEscobedo();
		Object capacidad = new Object();
		Date fecha = new Date();
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
