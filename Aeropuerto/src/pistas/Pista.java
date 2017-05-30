package pistas;

import aeropuertos.*;

/** 
 * 
 */
public class Pista {
	
	/*
	 * Identificador único para una pista en específico.
	 * ejemplo 'P1'. Este valor debería ser irrepetible
	 * en las pistas contenidas dentro de un aeropuerto
	 * en específico. Es decir, solo habrá una pista 'P1'
	 * en el aeropuerto Mariano Escobedo.
	 */
	private String codigo;
	private Aeropuerto aeropuerto;
	private boolean disponible;
	
	public Pista(String codigo){
		this.codigo = codigo;
	}
	
	public Pista(String codigo, Aeropuerto aeropuerto){
		this.codigo = codigo;
		this.aeropuerto = aeropuerto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}
	public void setDisponible(boolean disponible){
		this.disponible = disponible;
	}
	public boolean isDisponible(){
		return this.disponible;
	}
	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
	
	
}
 