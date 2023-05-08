package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaAlumnos {

	@Test
	public void queSePuedaAlmacenarLaNotaDelPrimerParcial() {
		//Error excepcion
		//Failure algo que esperaba y no fue asi
		//Datos de entrada
		int notaDelPrimerParcial =7;
		Alumno Axel; 
		
		//Ejecucion
		Axel = new Alumno();
		Axel.setNotaPrimerParcial(notaDelPrimerParcial);
		//Salida
		assertEquals(notaDelPrimerParcial, Axel.getNotaPrimerParcial());
		Axel.getNotaPrimerParcial();
	}
	
	@Test
	public void queNoSePuedaAlmacenarUnValorNegativoEnLaNotaDelPrimerParcial() {
		//Error excepcion
		//Failure algo que esperaba y no fue asi
		//Datos de entrada
		int notaDelPrimerParcial =-7;
		Alumno Axel; 
		
		//Ejecucion
		Axel = new Alumno();
		Axel.setNotaPrimerParcial(notaDelPrimerParcial);
		//Salida
		assertNotEquals(notaDelPrimerParcial, Axel.getNotaPrimerParcial());
		Axel.getNotaPrimerParcial();
	}

	@Test
	public void queSiSeSaca7Y7YTenga25AsistenciasHayaAprobado() {
		//Error excepcion
		//Failure algo que esperaba y no fue asi
		//Datos de entrada
		int notaDelPrimerParcial =7;
		int notaDelSegundoParcial =7;
		int asistencias = 25;
		Alumno Axel; 
		
		//Ejecucion
		Axel = new Alumno();
		Axel.setNotaPrimerParcial(notaDelPrimerParcial);
		Axel.setNotaSegundoParcial(notaDelSegundoParcial);
		Axel.setCantidadAsistencias(asistencias);
		//Salida
		assertEquals(notaDelPrimerParcial, Axel.getNotaPrimerParcial());
		assertEquals(notaDelSegundoParcial, Axel.getNotaSegundoParcial());
		assertEquals(asistencias, Axel.getCantidadAsistencias());
		assertTrue(Axel.aprobo());
	}
	
	@Test
	public void queSiSeSaca10Y2YTenga25AsistenciasHayaDesaprobado() {
		//Error excepcion
		//Failure algo que esperaba y no fue asi
		//Datos de entrada
		int notaDelPrimerParcial =10;
		int notaDelSegundoParcial =2;
		int asistencias = 25;
		Alumno Axel; 
		
		//Ejecucion
		Axel = new Alumno();
		Axel.setNotaPrimerParcial(notaDelPrimerParcial);
		Axel.setNotaSegundoParcial(notaDelSegundoParcial);
		Axel.setCantidadAsistencias(asistencias);
		//Salida
		assertEquals(notaDelPrimerParcial, Axel.getNotaPrimerParcial());
		assertEquals(notaDelSegundoParcial, Axel.getNotaSegundoParcial());
		assertEquals(asistencias, Axel.getCantidadAsistencias());
		assertFalse(Axel.aprobo());
		
		//assertNull()
		//assertNotNull()
		
	}
	
	@Test
	public void queSiSeSaca10Y7YTenga25AsistenciasHayaPromocionado() {
		//Error excepcion
		//Failure algo que esperaba y no fue asi
		//Datos de entrada
		int notaDelPrimerParcial =10;
		int notaDelSegundoParcial =7;
		int asistencias = 25;
		Alumno Axel; 
		
		//Ejecucion
		Axel = new Alumno();
		Axel.setNotaPrimerParcial(notaDelPrimerParcial);
		Axel.setNotaSegundoParcial(notaDelSegundoParcial);
		Axel.setCantidadAsistencias(asistencias);
		//Salida
		
		assertTrue(Axel.aprobo());
		assertFalse(Axel.desaprobo());
		assertTrue(Axel.promociono());
		
		
		//assertNull()
		//assertNotNull()
		
	}
}
