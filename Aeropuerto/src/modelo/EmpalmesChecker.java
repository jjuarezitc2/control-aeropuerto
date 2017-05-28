package modelo;

import java.util.ArrayList;
import java.util.Date;

import aeropuertos.Aeropuerto;
import vuelos.Vuelo;

/*
 * Clase utilería encargada de checar si dos vuelos se
 * empalman o no.
 * */
public class EmpalmesChecker {
	public static boolean seEmpalman(Vuelo v1, Vuelo v2){
		
		//
		Aeropuerto aeropuerto1 = v1.getAeropuertoOrigen();
		Aeropuerto aeropuerto2 = v2.getAeropuertoOrigen();
		
		//
		Date fecha1 = v1.getFecha();
		Date fecha2 = v2.getFecha();
		
		//
		if(aeropuerto1.getClass().equals( aeropuerto2.getClass())){
			if(fecha1.compareTo(fecha2) == 0){
				return true;
			}
		}else{
			return false;
		}
		return false;
	}

	public static boolean seEmpalman(Vuelo vuelo, ArrayList<Vuelo> vuelosEnBD) {
		for(int i = 0; i < vuelosEnBD.size(); i++){
			Vuelo vueloEnBD = vuelosEnBD.get(i);
			if(seEmpalman(vuelo, vueloEnBD)){
				return true;
			}
		}
		return false;
	}
}
 