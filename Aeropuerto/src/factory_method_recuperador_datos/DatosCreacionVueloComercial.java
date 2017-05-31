package factory_method_recuperador_datos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import aeropuertos.Aeropuerto;
import aviones.Avion;
import constantes.Aerolineas;
import constantes.Periodicidad;

public class DatosCreacionVueloComercial implements InformacionVentana {

	private String claveVuelo;
	private Avion avion;
	private Periodicidad periodicidad;	
	private Aeropuerto aeropuertoOrigen;
	private Aeropuerto aeropuertoDestino;
	private Calendar fechaSalida  = new GregorianCalendar(TimeZone.getTimeZone("America/Mexico_City"));
	private double costoBase;
	private long duracion;
	Calendar fechaLlegadaReal;
	private Aerolineas aerolinea; 
	
	
	public DatosCreacionVueloComercial(String ... args){
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);
		System.out.println(args[4]);
		System.out.println(args[5]);
		System.out.println(args[6]);
		System.out.println(args[7]);
		System.out.println(args[8]);
		System.out.println(args[9]);
		System.out.println(args[10]);
		System.out.println(args[11]);
	}
	
}
