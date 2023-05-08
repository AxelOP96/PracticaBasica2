package ar.edu.unlam.pb;

import static org.junit.Assert.*;

import org.junit.Test;

public class PruebaCallCenter {
	/*Nos contratan para desarrollar el software de un callcenter para identificar potenciales 
clientes del servicio de televisión por cable e internet de una nueva empresa llamada 
“Oeste Cable Color”. 
El objetivo de la aplicación es poder incorporar el listado de “Contactos”, de los cuales nos 
interesa conocer: 
 Nombre y Apellido: Valor alfanumérico. 
 Celular: Compuesto del código de país + código de área + número de celular. 
 E-Mail: Debe contener el símbolo ‘@’ y el caracter ‘.’. 
 Dirección: Valor alfanumérico. 
 Universidad Nacional de la Matanza Programación Básica I 
3 de 16 
 Código Postal: Valor numérico. 
 Localidad: Valor alfanumérico. 
 Provincia. Enumerador que contenga las 23 provincias argentinas. 
 Es cliente (Si o No): Inicialmente se carga en “No”. 
 Desea ser llamado nuevamente (Si o No): Inicialmente se carga en “Si”. 
*/
	@Test
	public void queSePuedaCrearElListadoDeContactos() {
		Contacto[] lista;
		lista = new Contacto[100];
		assertNotNull(lista);
	}
	
	public void queElNuevoContactoNoSeaCliente() {
		Contacto[] lista;
		lista = new Contacto[100];
		assertFalse(lista[1].getEsCliente());
		assertTrue(lista[1].getEsCliente());
		lista[1].setEsCliente(true);
	}

}
