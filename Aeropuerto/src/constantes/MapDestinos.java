package constantes;

import java.util.HashMap;
import java.util.Map;
//IMPLEMENTADO SINGLETON
public class MapDestinos {
		
	
    private Map<IATA, Ciudad> mapDestinos;
    //private IATA codIATA;
    //private Ciudad ciudad;  
    public static MapDestinos destinos;
    
    private MapDestinos(){}
    
    //Método para recuperar el Singleton
    public static MapDestinos getDestinos() {
        if (destinos == null){
        	destinos = new MapDestinos();
        	destinos.initializeMapping();
        }        
        return destinos;
    }
           
    public Ciudad getDescriptionByCode(IATA iataCode) {
        /*if (mapDestinos == null) {
            initializeMapping();
        }*/
        if (mapDestinos.containsKey(iataCode)) {
            return mapDestinos.get(iataCode);
        }
        return null;
    }

    private Map<IATA, Ciudad> initializeMapping() {
    	mapDestinos = new HashMap<>();    	
    		for(int i=0; i<IATA.values().length; i++){
    			mapDestinos.put(IATA.values()[i], Ciudad.values()[i]);
    		}    	
        return mapDestinos;
    }
    
    
}
