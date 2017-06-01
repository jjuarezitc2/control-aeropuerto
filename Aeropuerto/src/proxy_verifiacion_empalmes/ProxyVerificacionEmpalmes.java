package proxy_verifiacion_empalmes;

import java.util.Calendar;

import bd.BD;
import factory_method_recuperador_datos.*;
import vuelos.Vuelo;


public class ProxyVerificacionEmpalmes implements InformacionVentana{

	private boolean informacionVerificada;
	private InformacionVentana objetoRealInformacion;
	private Calendar tempFech1;
	private Calendar tempFech2;
	private Calendar fechEvaluar;
	
	public ProxyVerificacionEmpalmes(InformacionVentana objetoRealInformacion){

			this.objetoRealInformacion = (DatosCreacionVueloComercial)objetoRealInformacion;		
			
	}
	
	@Override
	public InformacionVentana obtenerDatos() {
		
		if(objetoRealInformacion.getClass().getSimpleName().equals("DatosCreacionVueloComercial")){
			if(verificacionEmpalmes(((DatosCreacionVueloComercial)objetoRealInformacion).getFechaSalida()))	{
				return null;
			}		
		}
		if(objetoRealInformacion.getClass().getSimpleName().equals("DatosCreacionVueloCarga")){
			if(verificacionEmpalmes(((DatosCreacionVueloCarga)objetoRealInformacion).getFechaSalida()))	{
				return null;
			}		
		}
		if(objetoRealInformacion.getClass().getSimpleName().equals("DatosCreacionVueloPrivado")){
			if(verificacionEmpalmes(((DatosCreacionVueloPrivado)objetoRealInformacion).getFechaSalida()))	{
				return null;
			}		
		}

		return objetoRealInformacion;
	}
		

	
	public boolean verificacionEmpalmes(Calendar fecha){			 
		for(Vuelo v : BD.getVuelos()){
			if(v.getFechaSalida().equals(fecha))
				return true;
		}		
		return false;
	}

	@Override
	public void convertirDatos() {}
	
	
}
