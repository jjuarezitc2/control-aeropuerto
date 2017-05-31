package test;

import factory_method_recuperador_datos.FactoryRecuperadorDatos;
import factory_method_recuperador_datos.RecuperadorDatosCreacionVueloComercial;
import factory_method_recuperador_datos.InformacionVentana;

public class TestRecuperadorDatos {
	
	public static void main(String [] args){
	
	FactoryRecuperadorDatos recuperadorDatos = new RecuperadorDatosCreacionVueloComercial();
	InformacionVentana informacionVentana = recuperadorDatos.factoryMethod("XM004", "SEMANAL", "VER", "MEX", "AEROMEXICO", "30", "5", "2017", "20", "40", "180", "8000");
	}
}
