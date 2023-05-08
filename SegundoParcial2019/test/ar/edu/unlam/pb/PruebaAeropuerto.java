package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.pb1.parcial2.dominio.Pasajero;
import ar.edu.unlam.pb1.parcial2.dominio.Vuelo;

public class PruebaAeropuerto {

	@Test
	public void queSePuedaCrearUnVuelo() {
		Vuelo vuelo;
		vuelo = new Vuelo("BS AS", "URU", 130);
		
		assertNotNull(vuelo);
	}
	
	
	public void queSePuedaAgregarUnPasajero() {
		//Entrada de datos
		Vuelo vuelo;
		vuelo = new Vuelo("BS AS", "URU", 130);
		Pasajero pasajero;
		pasajero = new Pasajero(39415747, "Axel", "Leguero");
		Pasajero[] lista= new Pasajero[20];
		vuelo.setPasajeros(lista);
		//Ejecucion
		for(int i=0; i< lista.length;i++) {
			if(lista[i] == null) {
				lista[i] = pasajero;
			}
		}
		//Salida de datos
		assertNotNull(vuelo);
		assertNotNull(pasajero);
		
	}
	
}
