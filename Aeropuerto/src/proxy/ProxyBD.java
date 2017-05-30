package proxy;

import java.util.ArrayList;

import aeropuertos.*;
import bd.BD;
import dummy_stuff.BDSimulador;
import modelo.EmpalmesChecker;
import vuelos.Vuelo;

public class ProxyBD implements BDInterface{
	
	private BD bd;
	
	public ProxyBD(){
		this.bd = new BD();
	}

	@Override
	public void persistVuelo(Vuelo vuelo) throws Exception {
		
		// TODO: hacer aquí la conexión a la bd... de momento solo es simulada
		ArrayList<Vuelo> vuelosEnBD = (ArrayList<Vuelo>) BDSimulador.getAllVuelos(BD.aeropuertos.get(2));
		
		if(! EmpalmesChecker.seEmpalman(vuelo, vuelosEnBD)){
			this.bd.persistVuelo(vuelo);
		}else{
			throw new Exception("No se puede guardar el vuelo porque se empalma.");
		}
	}
	


}
 