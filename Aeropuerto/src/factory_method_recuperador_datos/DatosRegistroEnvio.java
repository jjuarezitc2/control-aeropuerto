package factory_method_recuperador_datos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import aeropuertos.Aeropuerto;
import aviones.Avion;
import bd.BD;
import constantes.Aerolineas;
import constantes.Periodicidad;
import vuelos.Vuelo;

public class DatosRegistroEnvio implements InformacionVentana {
	private String remitente;
	private String destinatario;
	private int carga;
	private Vuelo vuelo;
	private boolean vueloCompleto;
	private String[] args;
	
	public DatosRegistroEnvio(String ... args){
		this.args = args;
		/*
		System.out.println("ARGS[0]" + args[0]);
		System.out.println("ARGS[1]" + args[1]);
		System.out.println("ARGS[2]" + args[2]);
		System.out.println("ARGS[3]" + args[3]);
		System.out.println("ARGS[4]" + args[4]);
		System.out.println("ARGS[5]" + args[5]);
		System.out.println("ARGS[6]" + args[6]);
		System.out.println("ARGS[7]" + args[7]);
		System.out.println("ARGS[8]" + args[8]);
		System.out.println("ARGS[9]" + args[9]);
		System.out.println("ARGS[10]" + args[10]);
		System.out.println("ARGS[11]" + args[11]);*/
		this.convertirDatos();
	}

	
	//	SETTERS
	public void setRemitente(String remitente) { this.remitente = remitente; }
	public void setDestinatario(String destinatario) { this.destinatario = destinatario; }
	public void setCarga(int carga) { this.carga = carga; }
	public void setDestino(Vuelo destino) { this.vuelo = destino; }
	public void setVueloCompleto(boolean vueloCompleto) { this.vueloCompleto = vueloCompleto; }
	public void setArgs(String[] args) { this.args = args; }
	
	//	GETTERS
	public String getRemitente() { return remitente; }
	public String getDestinatario() { return destinatario; }
	public int getCarga() {	return carga; }
	public Vuelo getDestino() { return vuelo; }
	public boolean isVueloCompleto() { return vueloCompleto; }
	public String[] getArgs() { return args; }
	
	@Override
	public void convertirDatos() {
		this.setRemitente(this.args[1]);
		this.setDestinatario(this.args[2]);
		this.setCarga(Integer.parseInt(this.args[3]));
		this.setDestino(BD.recuperaVueloPorClaveVuelo(this.args[4]));
		this.setVueloCompleto(Boolean.parseBoolean(this.args[5]));
	}


	@Override
	public InformacionVentana obtenerDatos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
