package test;

import java.util.Date;

import aeropuertos.Aeropuerto;

import aviones.Avion;
import bd.BD;
import boletos.Boleto;
import boletos.BoletoComercial;
import constantes.Aerolineas;
import constantes.Periodicidad;
import constantes.PrioridadAbordaje;
import vuelos.Vuelo;
import vuelos.VueloCarga;
import vuelos.VueloComercial;

public class TestBoleto {

	public static void main(String[] args) {
		BD db = new BD();
		Avion boeing = BD.aviones.get(3);//Avion comercial
		Aeropuerto bJuarez = BD.aeropuertos.get(2);
		Aeropuerto mEscobedo = BD.aeropuertos.get(5);
		int capacidad = boeing.getCapacidadPrimera()+boeing.getCapacidadTurista();
		//Date fecha = new Date();
		Periodicidad periodicidad = Periodicidad.DIARIA;
		
		Vuelo vueloComercial = new VueloComercial.Builder().claveVuelo("00001")
												   .avion(boeing)
												   .aeropuertoOrigen(bJuarez)
												   .aeropuertoDestino(mEscobedo)
												   //.capacidad(capacidad)
												   .fecha(30, 5, 2017)
												   .horaSalida(15, 30)
												   .periodicidad(periodicidad)
												   .costoBase(5_200)
												   .aerolinea(Aerolineas.AEROMAR)
												   .build();
		
		//System.out.println(boeing);
		//System.out.println(vueloComercial);
		
		Boleto boleto = new BoletoComercial.Builder().clave("000001")
														.nombre("Selene")
														.apPaterno("Estévez")
														.prioridadAbordaje(PrioridadAbordaje.CLASE_TURISTA)
														.vuelo(vueloComercial)																																										
														.build();
		
		
		System.out.println(boleto);
		
		
		
		
		} 

	}


