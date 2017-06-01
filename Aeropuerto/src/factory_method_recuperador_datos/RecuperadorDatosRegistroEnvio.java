package factory_method_recuperador_datos;

public class RecuperadorDatosRegistroEnvio implements FactoryRecuperadorDatos {

	@Override
	public InformacionVentana factoryMethod(String... args) {
		return new DatosRegistroEnvio(args);
	}

}
