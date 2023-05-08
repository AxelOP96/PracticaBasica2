package ar.edu.unlam.pb;

import java.util.Scanner;

public class InterfazCallCenter {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String args[]) {
		menu();	
		Empresa tuenti = new Empresa("tuenti", false);
		tuenti.setZonaDeCobertura(new int[100]);
		int opcion = teclado.nextInt();
		menuOpciones(opcion);
	}
	
	private static void incorporarZonaDeCobertura() {
		/*
		 * Se registra un nuevo c�digo postal dentro de la zona de cobertura de la empresa
		 */
		Empresa tuenti = new Empresa("tuenti", false);
		System.out.println("Ingrese un codigo postal");
		int codigo = teclado.nextInt();
		boolean incorporada =tuenti.agregarNuevaZonaDeCobertura(codigo);
		if(incorporada){
			System.out.println("Codigo postal agregado correctamente");
			}
		}
	
	private static void darDeAltaNuevoContacto() {
		/*
		 * Registra un nuevo contacto en la empresa
		 */
		Empresa tuenti = new Empresa("tuenti", false);
		System.out.println("Comencemos con la alta del nuevo contacto");
		System.out.println("Ingrese su nombre");
		String nombre = teclado.nextLine();
		System.out.println("Ingrese su numero");
		Integer numero = teclado.nextInt();
		System.out.println("Ingrese su codigo postal");
		Integer cp = teclado.nextInt();
		System.out.println("Ingrese su mail");
		String mail = teclado.nextLine();
		//Contacto nuevaAlta = new Contacto(nombre, numero, cp, mail);
		//nuevaAlta.esEmailValido(mail);
		//tuenti.agregarNuevoContacto(nuevaAlta);
	}
	
	private static void realizarNuevaLlamada() {
		/*
		 * Busca un candidato,  muestra los datos del mismo, y permite almacenar el resultado de la llamada.
		 * 
		 * a.	Si la llamada fue exitosa (en ese caso el contacto pasa a ser cliente, y no se lo debe volver a 
		 * llamar).
		 * b.	Si el contacto no desea ser llamado nuevamente (la llamada pudo no haber sido exitosa, pero se haga 
		 * un nuevo intento en el futuro).
		 * c.	Observaciones: Texto libre donde el operador deja registro de lo conversado.
		 */
		
	}
	
	private static void verInformacionDelContacto() {
		/*
		 * Se visualiza la informaci�n del contacto, incluso el listado de las llamadas que se le hicieron
		 * 
		 * 
		 */
		Empresa tuenti = null;
		tuenti.toString();
	}

	private static void menu() {
		System.out.println("Bienvenido al callcenter");
		
		System.out.println("************************");
		System.out.println("Menu de opciones\n");
		System.out.println("1 - Incorporar zona de cobertura");
		System.out.println("2 - Dar de alta un nuevo contacto");
		System.out.println("3 - Realizar nueva llamada");
		System.out.println("4 - Ver informaci�n del contacto");
		System.out.println("9 - Salir");
		System.out.println("************************");
	}
	private static void menuOpciones(int opcion) {
		switch(opcion) {
		case 1:
			incorporarZonaDeCobertura();
			break;
		case 2:
			darDeAltaNuevoContacto();
			break;
		case 3:
			realizarNuevaLlamada();
			break;
		case 4:
			verInformacionDelContacto();
			break;
		case 9:
		default:
			break;
		}
	}
	
}
