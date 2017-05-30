package bd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import aeropuertos.Aeropuerto;
import aeropuertos.AeropuertoInternacional;
import aeropuertos.AeropuertoNacional;
import aviones.Avion;
import aviones.AvionCarga;
import aviones.AvionComercial;
import aviones.AvionPrivado;
import constantes.Aerolineas;
import constantes.IATA;
import constantes.Periodicidad;
import pistas.Pista;
import proxy.BDInterface;
import torre_control.TorreControl;
import vuelos.Vuelo;
import vuelos.VueloCarga;
import vuelos.VueloComercial;

public class BD implements BDInterface{
	
	//Representación temporal de aviones
	public static List<Avion> aviones = new ArrayList<>();
	public static List<Aeropuerto> aeropuertos = new ArrayList<>();
	public static List<Vuelo> vuelos = new ArrayList<>();

	static{		
		try {
			crearAviones();
			crearAeropuertos();
			crearVuelos();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	private static void crearAviones() throws Exception{
		
		aviones.add(new AvionPrivado.Builder().clave("XM001").modelo("King Air 200").capacidadPrimera(6).altura(4.5).longitud(13.3).envergadura(16.6).pistaLargo(1_000).pistaAncho(30).build());
		aviones.add(new AvionPrivado.Builder().clave("XM002").modelo("Embraer Legacy").capacidadPrimera(13).altura(6.7).longitud(26).envergadura(21).pistaLargo(1_900).pistaAncho(45).build() );
		aviones.add(new AvionComercial.Builder().clave("XM003").modelo("Boeing B777-200").capacidadPrimera(39).capacidadTurista(300).altura(18.5).longitud(63.7).envergadura(60.9).pistaLargo(2_000).pistaAncho(45).build() );
		aviones.add(new AvionComercial.Builder().clave("XM004").modelo("Airbus A320").capacidadPrimera(20).capacidadTurista(160).altura(11.8).longitud(37.6).envergadura(34.1).pistaLargo(2_000).pistaAncho(45).build() );
		aviones.add(new AvionCarga.Builder().clave("XM005").modelo("Beechcraft King Air 90").capacidadMaxima(25).altura(4.3).longitud(10.8).envergadura(10.1).pistaLargo(1_500).pistaAncho(30).build() );
		aviones.add(new AvionCarga.Builder().clave("XM006").modelo("Lockheed L100-Hercules").capacidadMaxima(17_831).altura(11.6).longitud(34.5).envergadura(40.4).pistaLargo(3_600).pistaAncho(45).build() );
	
	}
	
	private static void crearAeropuertos() throws Exception{
		
		aeropuertos.add(new AeropuertoInternacional.Builder() .clave("MMVR").nombre("Aeropuerto Internacional de Veracruz").iata(IATA.VER).pistas(Arrays.asList(new Pista("Pista1"), new Pista("Pista2"))).torreControl(new TorreControl()).build());
		aeropuertos.add(new AeropuertoNacional.Builder() .clave("MMPA").nombre("Aeropuerto Nacional de Poza Rica").iata(IATA.PAZ).pistas(Arrays.asList(new Pista("Pista1"))).torreControl(new TorreControl()).build());
		aeropuertos.add(new AeropuertoNacional.Builder() .clave("MMMT").nombre("Aeropuerto Nacional de Minatitlán").iata(IATA.MTT).pistas(Arrays.asList(new Pista("Pista1"))).torreControl(new TorreControl()).build());
		aeropuertos.add(new AeropuertoInternacional.Builder() .clave("MMVA").nombre("Aeropuerto Internacional de Villahermosa").iata(IATA.VSA).pistas(Arrays.asList(new Pista("Pista1"))).torreControl(new TorreControl()).build());
		aeropuertos.add(new AeropuertoInternacional.Builder() .clave("MMPQ").nombre("Aeropuerto Internacional de Palenque").iata(IATA.PQM).pistas(Arrays.asList(new Pista("Pista1"))).torreControl(new TorreControl()).build());
		aeropuertos.add(new AeropuertoInternacional.Builder() .clave("MMSC").nombre("Aeropuerto Internacional de San Cristóbal").iata(IATA.SZT).pistas(Arrays.asList(new Pista("Pista1"))).torreControl(new TorreControl()).build());
	
	}
	
	private static void crearVuelos() throws Exception{
		vuelos.add(new VueloComercial.Builder().claveVuelo("00001").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(30, 5, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00002").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(31, 5, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00003").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(1, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00004").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(2, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00005").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(3, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00006").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(4, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00007").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(5, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00008").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(6, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00009").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(7, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00010").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(8, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00011").avion(aviones.get(2)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(3)).fecha(9, 6, 2017).horaSalida(15, 30).periodicidad(Periodicidad.DIARIA).costoBase(5_200).aerolinea(Aerolineas.AEROMAR).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00012").avion(aviones.get(3)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(4)).fecha(30, 5, 2017).horaSalida(9, 15).periodicidad(Periodicidad.SEMANAL).costoBase(10_200).aerolinea(Aerolineas.INTERJET).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00013").avion(aviones.get(3)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(4)).fecha(6, 6, 2017).horaSalida(9, 15).periodicidad(Periodicidad.SEMANAL).costoBase(10_200).aerolinea(Aerolineas.INTERJET).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00014").avion(aviones.get(3)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(4)).fecha(13, 5, 2017).horaSalida(9, 15).periodicidad(Periodicidad.SEMANAL).costoBase(10_200).aerolinea(Aerolineas.INTERJET).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00015").avion(aviones.get(3)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(4)).fecha(20, 5, 2017).horaSalida(9, 15).periodicidad(Periodicidad.SEMANAL).costoBase(10_200).aerolinea(Aerolineas.INTERJET).build());
		vuelos.add(new VueloComercial.Builder().claveVuelo("00016").avion(aviones.get(3)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(4)).fecha(27, 5, 2017).horaSalida(9, 15).periodicidad(Periodicidad.SEMANAL).costoBase(10_200).aerolinea(Aerolineas.INTERJET).build());
		vuelos.add(new VueloCarga.Builder().claveVuelo("00017").avion(aviones.get(1)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(1)).fecha(30, 5, 2017).horaSalida(5, 30).periodicidad(Periodicidad.DIARIA).costoBase(30_000).aerolinea(Aerolineas.AEROMEXICO).build());
		vuelos.add(new VueloCarga.Builder().claveVuelo("00018").avion(aviones.get(1)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(1)).fecha(1, 6, 2017).horaSalida(5, 30).periodicidad(Periodicidad.DIARIA).costoBase(30_000).aerolinea(Aerolineas.AEROMEXICO).build());
		vuelos.add(new VueloCarga.Builder().claveVuelo("00019").avion(aviones.get(1)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(1)).fecha(2, 6, 2017).horaSalida(5, 30).periodicidad(Periodicidad.DIARIA).costoBase(30_000).aerolinea(Aerolineas.AEROMEXICO).build());
		vuelos.add(new VueloCarga.Builder().claveVuelo("00020").avion(aviones.get(1)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(1)).fecha(3, 6, 2017).horaSalida(5, 30).periodicidad(Periodicidad.DIARIA).costoBase(30_000).aerolinea(Aerolineas.AEROMEXICO).build());
		vuelos.add(new VueloCarga.Builder().claveVuelo("00021").avion(aviones.get(1)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(1)).fecha(4, 6, 2017).horaSalida(5, 30).periodicidad(Periodicidad.DIARIA).costoBase(30_000).aerolinea(Aerolineas.AEROMEXICO).build());
		vuelos.add(new VueloCarga.Builder().claveVuelo("00022").avion(aviones.get(1)).aeropuertoOrigen(aeropuertos.get(0)).aeropuertoDestino(aeropuertos.get(1)).fecha(5, 6, 2017).horaSalida(5, 30).periodicidad(Periodicidad.DIARIA).costoBase(30_000).aerolinea(Aerolineas.AEROMEXICO).build());
		
	}
	


	@Override
	public void persistVuelo(Vuelo vuelo) {
		System.out.println("Supongamos que ya se guardo el vuelo... supongamos, porque no hay ni madres de JPA xD");
	}

}
 