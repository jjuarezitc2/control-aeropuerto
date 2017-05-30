package aeropuertos;

import java.util.ArrayList;

import pistas.Pista;

public class BJuarez extends Aeropuerto{
	
	public BJuarez(ArrayList<Pista> listaPistas){
		super(listaPistas);
		this.nombre = "Aeropuerto Internacional Benito Juarez";
		this.ciudad = "Ciudad de Mexico";
	}
}
 