package test;

import java.util.Calendar;

import constantes.Aerolineas;
import factory_method_recuperador_datos.FactoryRecuperadorDatos;
import factory_method_recuperador_datos.RecuperadorDatosCreacionVueloComercial;
import factory_method_recuperador_datos.DatosCreacionVueloComercial;
import vuelos.Vuelo;
import vuelos.VueloComercial;
import factory_method_recuperador_datos.InformacionVentana;

public class TestRecuperadorDatos {
	
	public static void main(String [] args){
	
	FactoryRecuperadorDatos recuperadorDatos = new RecuperadorDatosCreacionVueloComercial();
	InformacionVentana informacionVentana = recuperadorDatos.factoryMethod("XM004", "SEMANAL", "VER", "PAZ", "AEROMEXICO", "30", "5", "2017", "20", "40", "180", "8000");
	
	Vuelo vueloComercial = new VueloComercial.Builder().claveVuelo("00001")
			   .avion(((DatosCreacionVueloComercial)informacionVentana).getAvion())
			   .aeropuertoOrigen(((DatosCreacionVueloComercial)informacionVentana).getAeropuertoOrigen())
			   .aeropuertoDestino(((DatosCreacionVueloComercial)informacionVentana).getAeropuertoDestino())
			   .fecha(((DatosCreacionVueloComercial)informacionVentana).getFechaSalida().get(Calendar.DAY_OF_MONTH),
					   ((DatosCreacionVueloComercial)informacionVentana).getFechaSalida().get(Calendar.MONTH),
					   ((DatosCreacionVueloComercial)informacionVentana).getFechaSalida().get(Calendar.YEAR))
			   .horaSalida(((DatosCreacionVueloComercial)informacionVentana).getFechaSalida().get(Calendar.HOUR_OF_DAY),
					   ((DatosCreacionVueloComercial)informacionVentana).getFechaSalida().get(Calendar.MINUTE))
			   .periodicidad(((DatosCreacionVueloComercial)informacionVentana).getPeriodicidad())
			   .costoBase(((DatosCreacionVueloComercial)informacionVentana).getCostoBase())
			   .aerolinea(((DatosCreacionVueloComercial)informacionVentana).getAerolinea())
			   .build();
	
	System.out.println(vueloComercial);
	}
}
