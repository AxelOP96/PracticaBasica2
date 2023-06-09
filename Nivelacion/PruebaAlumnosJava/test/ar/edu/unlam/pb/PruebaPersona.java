package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaPersona {

	@Test
	public void queCuandoSeInstancieUnaPersonaEsteViva() {
		//Datos de entrada
		Persona actual;
		//Ejecucion
		actual = new Persona();
		//Salida
		assertNotNull(actual);
		assertTrue(actual.estaViva());
	}

	public void queCuandoSeInstancieUnaPersonaLaEdadEsCero() {
		//Datos de entrada
		Persona actual;
		//Ejecucion
		actual = new Persona();
		final int EDAD_ESPERADA=0;
		//Salida
		assertEquals(EDAD_ESPERADA,actual.getEdad());
		
	}
	
	public void queSeMueraUnaPersona() {
		Persona actual;
		actual = new Persona();
		
		actual.morir();
		assertFalse(actual.estaViva());
	}
	
	public void queSePuedaCambiarLaEdad() {
		Persona actual;
		actual = new Persona();
		int edad = 15;
		actual.setEdad(edad);
		assertEquals(edad, actual.getEdad());
	}
}
