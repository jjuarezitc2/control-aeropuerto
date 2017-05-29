package test;

import constantes.IATA;
import constantes.MapDestinos;

public class Test {
	public static void main(String[] args){
		System.out.println("ola k ase");
		System.out.println("foo");
		System.out.println(MapDestinos.getDestinos().getDescriptionByCode(IATA.MEX));
	}
}
 