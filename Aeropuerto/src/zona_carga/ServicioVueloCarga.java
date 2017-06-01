package zona_carga;

import java.util.ArrayList;
import java.util.List;

import aeropuertos.Aeropuerto;
import vuelos.Vuelo;
import vuelos.VueloCarga;
import bd.BD;

public class ServicioVueloCarga {

	public List<Vuelo> getVueloCompartido(int carga, Aeropuerto destino) {

		List<Vuelo> listaVuelos = new ArrayList<Vuelo>();

		for (Vuelo v : BD.vuelos) {
			if (v instanceof VueloCarga) {
				if (destino.getNombre().equals(v.getAeropuertoDestino().getNombre())) {
					int capacidadRestante = ((VueloCarga) v).getCapacidadTotal()
							- ((VueloCarga) v).getCapacidadOcupada();
					if (carga <= capacidadRestante) {
						listaVuelos.add(v);
					}
				}
			}
		}
		return listaVuelos;
	}

	public List<Vuelo> getVueloPrivado(int carga, Aeropuerto destino) {
		List<Vuelo> listaVuelos = new ArrayList<Vuelo>();

		for (Vuelo v : BD.vuelos) {
			if (v instanceof VueloCarga) {
				if (destino.getNombre().equals(v.getAeropuertoDestino().getNombre())) {
					if(((VueloCarga) v).getCapacidadTotal() >= carga && ((VueloCarga) v).getCapacidadOcupada() == 0){
						listaVuelos.add(v);
					}
				}
			}
		}
		return listaVuelos;
	}
	
	public void registraEnvio(Envio envio){
		BD.addEnvio(envio);
		if(envio.isVueloCompleto()){
			compraVueloCompleto(envio.getVuelo());
		}else{
			decrementaCarga(envio.getVuelo(), envio.getCarga());
		}
	}
	
	private void compraVueloCompleto(Vuelo vuelo){
		for(int i = 0; i < BD.vuelos.size(); i++){
			if(vuelo.getClaveVuelo().equals(BD.vuelos.get(i).getClaveVuelo())){
				((VueloCarga)BD.vuelos.get(i)).setPrivado(true);
			}
		}
	}
	
	private void decrementaCarga(Vuelo vuelo, int carga){
		for(int i = 0; i < BD.vuelos.size(); i++){
			if(vuelo.getClaveVuelo().equals(BD.vuelos.get(i).getClaveVuelo())){
				((VueloCarga)BD.vuelos.get(i)).incrementaCapacidadOcupada(carga);;
			}
		}
	}
	
	public static void main(String[] args){
		ServicioVueloCarga servicio = new ServicioVueloCarga();
		
		List<Vuelo> lista = servicio.getVueloCompartido(9900, BD.aeropuertos.get(1));
		
		for(Vuelo v : lista){
			System.out.println("-> " + v);
		}
	}
}
