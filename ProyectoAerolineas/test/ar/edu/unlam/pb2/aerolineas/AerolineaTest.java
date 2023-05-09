package ar.edu.unlam.pb2.aerolineas;

import static org.junit.Assert.*;

import org.junit.Test;

public class AerolineaTest {

	@Test
	public void queSePuedaCrearUnaAerolinea() {
		Aerolinea fb;
		String name = "Flybondi";
		fb = new Aerolinea(name);
		
		assertNotNull(fb);
	}

	@Test
	public void queSePuedaRegistrarUnAeropuertoEnUnaAerolinea() {
		//preparacion de datos
		Aerolinea fb;
		String nombre = "Flybondi";
		fb = new Aerolinea(nombre);
		
		Long id = 1L;
		String nombreAeropuerto = "Bariloche";
		String codigo = "BRC";
		String direccion = "xxx 123";
		Aeropuerto brc ;
		brc = new Aeropuerto(id, nombreAeropuerto, codigo, direccion);
		//accion
		boolean exitoso = fb.registrarAeropuerto(brc);
		//verificacion de los datos
		assertTrue(exitoso);
	}
	@Test
	public void queSePuedaBuscarUnAeropuertoPorCodigo() {
		
	}
	
	@Test
	public void queSePuedaBuscarUnAeropuertoPorNombre() {
		
	}
	
	@Test
	public void queSePuedaCrearUnaRuta() {
		
	}
	
	@Test
	public void queSePuedaCambiarElTVDeUnaRuta() {
		
	}
	
	@Test
	public void queSePuedaBuscarTodasLasRutasDeAeropuertoOrigen() {
		
	}
	
	@Test
	public void queNoSePuedaCrearUnVueloConLaMismaRutaYQueSeSuperpongaEnElHorario() {
		
	}

//Tarea Como hace la comparacion de objetos
	//Es con generate Hashcode
}
