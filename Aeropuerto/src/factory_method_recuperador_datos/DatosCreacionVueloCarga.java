package factory_method_recuperador_datos;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

import aeropuertos.Aeropuerto;
import aviones.Avion;
import bd.BD;
import constantes.Aerolineas;
import constantes.Periodicidad;

public class DatosCreacionVueloCarga implements InformacionVentana {

	public boolean informacionVerificada;
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
	private String[] args;
	
	public DatosCreacionVueloCarga(String ... args){
		this.args = args;
		fechaSalida.set(Calendar.DAY_OF_YEAR,0);fechaSalida.set(Calendar.MONTH,0);fechaSalida.set(Calendar.DAY_OF_MONTH, 0);
		fechaSalida.set(Calendar.HOUR_OF_DAY, 0); fechaSalida.set(Calendar.MINUTE, 0);fechaSalida.set(Calendar.SECOND, 0);fechaSalida.set(Calendar.MILLISECOND, 0);
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
	public void setClaveVuelo(String claveVuelo) { 	this.claveVuelo = claveVuelo; }
	public void setAvion(Avion avion) { this.avion = avion; }
	public void setPeriodicidad(Periodicidad periodicidad) { this.periodicidad = periodicidad; }
	public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) { 	this.aeropuertoOrigen = aeropuertoOrigen;}
	public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) { this.aeropuertoDestino = aeropuertoDestino; }
	public void setFechaSalida(int dia, int mes, int anio) { this.fechaSalida.set(anio, mes, dia);}
	public void setHoraSalida(int hora, int minuto){ this.fechaSalida.set(Calendar.HOUR_OF_DAY, hora);this.fechaSalida.set(Calendar.MINUTE, minuto);}
	public void setCostoBase(double costoBase) { this.costoBase = costoBase; }
	public void setDuracion(long duracion) { this.duracion = duracion; } 
	public void setAerolinea(Aerolineas aerolinea) { this.aerolinea = aerolinea; } 
	
	//	GETTERS
	public String getClaveVuelo() { return claveVuelo; }
	public Avion getAvion() { return avion; } 
	public Periodicidad getPeriodicidad() { return periodicidad; } 
	public Aeropuerto getAeropuertoOrigen() { return aeropuertoOrigen; } 
	public Aeropuerto getAeropuertoDestino() { return aeropuertoDestino; } 
	public Calendar getFechaSalida() { return fechaSalida; } 
	public double getCostoBase() { return costoBase; } 
	public long getDuracion() { return duracion; } 
	public Aerolineas getAerolinea() { return aerolinea; }


	@Override
	public void convertirDatos() {
		this.setAvion(BD.recuperarAvion(this.args[0]));		
		this.setPeriodicidad(BD.stringToPeriodicidad(this.args[1]));
		this.setAeropuertoOrigen(BD.recuperaAeropuertoPorIATA(this.args[2]));
		this.setAeropuertoDestino(BD.recuperaAeropuertoPorIATA(this.args[3]));
		this.setAerolinea(BD.stringToAerolinea(this.args[4]));
		this.setFechaSalida(Integer.parseInt(this.args[5]), Integer.parseInt(this.args[6]), Integer.parseInt(this.args[7]));
		this.setHoraSalida(Integer.parseInt(this.args[8]), Integer.parseInt(this.args[9]));
		this.setDuracion(Long.parseLong(this.args[10]));
		this.setCostoBase(Double.parseDouble(this.args[11]));
	}


	@Override
	public InformacionVentana obtenerDatos() {		
		return this;
	} 
}
