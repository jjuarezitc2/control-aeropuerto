package aeropuertos;

public abstract class Aeropuerto {
	
	protected String nombre;
	protected String ciudad;
	
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
}
 