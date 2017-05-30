package aeropuertos;

import java.util.ArrayList;

import pistas.Pista;

public class MEscobedo extends Aeropuerto{
	public MEscobedo(ArrayList<Pista> listaPistas){
		super(listaPistas);
		this.nombre = "Aeropuerto Internacional Mariano Escobedo";
		this.ciudad = "Monterrey";
	}
}
 