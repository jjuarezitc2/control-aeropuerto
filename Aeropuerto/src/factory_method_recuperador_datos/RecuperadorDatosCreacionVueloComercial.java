package factory_method_recuperador_datos;

public class RecuperadorDatosCreacionVueloComercial implements FactoryRecuperadorDatos {

	@Override
	public InformacionVentana factoryMethod(String... args) {
		return new DatosCreacionVueloComercial(args);
	}

}
