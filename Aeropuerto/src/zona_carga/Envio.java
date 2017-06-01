package zona_carga;

import vuelos.Vuelo;

public class Envio {
	
	private String remitente;
	private String destinatario;
	private int carga;
	private Vuelo vuelo;
	private boolean vueloCompleto;
	
	public String getRemitente() {
		return remitente;
	}
	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	public boolean isVueloCompleto() {
		return vueloCompleto;
	}
	public void setVueloCompleto(boolean vueloCompleto) {
		this.vueloCompleto = vueloCompleto;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}
	
}