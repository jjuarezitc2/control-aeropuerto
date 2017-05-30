package test;

import java.util.Date;

import aeropuertos.*;
import aviones.*;
import bd.BD;
import constantes.Aerolineas;
import constantes.Periodicidad;
import dummy_stuff.BDSimulador;
import vuelos.*;

public class TestBuilderVuelos {
	public static void main(String[] args){
		BD db = new BD();
		Avion boeing = BD.aviones.get(0);
		Aeropuerto bJuarez = BD.aeropuertos.get(2);
		Aeropuerto mEscobedo = BD.aeropuertos.get(5);
		int capacidad = boeing.getCapacidadPrimera()+boeing.getCapacidadTurista();
		//Date fecha = new Date();
		Periodicidad periodicidad = Periodicidad.DIARIA;
		
		Vuelo vueloCarga = new VueloCarga.Builder().claveVuelo("00001")
												   .avion(boeing)
												   .aeropuertoOrigen(bJuarez)
												   .aeropuertoDestino(mEscobedo)
												   .fecha(2017,4,12)
												   .periodicidad(periodicidad)
												   .costoBase(5_200)
												   .duracion(160)
												   .horaSalida(9, 45)
												   .aerolinea(Aerolineas.AEROMEXICO)
												   .build();
		
		System.out.println(vueloCarga);
		//System.out.println(boeing);
	}
}
 