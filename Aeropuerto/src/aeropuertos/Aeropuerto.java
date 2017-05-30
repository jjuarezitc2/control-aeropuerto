package aeropuertos;

import java.util.ArrayList;
import java.util.List;

import pistas.Pista;
import torre_control.TorreControl;

public abstract class Aeropuerto {
	
	protected String nombre;
	protected String ciudad;
	protected List<Pista> listaPistas;
	protected TorreControl torreControl;
	
	
	public Aeropuerto(ArrayList<Pista> listaPistas){
		this.listaPistas = listaPistas;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCiudad() {
		return ciudad;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	
	public String toString(){
		return this.nombre;
	}
	
	public List<Pista> getListaPistas(){
		return this.listaPistas;
	}
	
	public TorreControl getTorreControl(){
		return this.torreControl;
	}
}
 