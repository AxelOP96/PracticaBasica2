package ar.edu.unlam.pb2.aerolineas;

import static org.junit.Assert.*;

import org.junit.Test;

public class AeropuertoTest {

	@Test
	public void queSePuedaCrearUnAeropuerto() {
		Long id = 1L;
		String nombre = "Bariloche";
		String codigo = "BRC";
		String direccion = "xxx 123";
		Aeropuerto brc ;
		brc = new Aeropuerto(id, nombre, codigo, direccion);
		
		assertNotNull(brc);
	}

}
