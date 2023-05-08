package ar.edu.unlam.pb1.parcial2.dominio;

public class Vuelo {

	private final int CANTIDAD_DE_FILAS = 32;
	private final int CANTIDAD_DE_ASIENTOS_POR_FILA = 6;

	private String origen;
	private String destino;
	private Pasajero[] pasajeros;
	private Pasajero[][] asientos;

	public Vuelo(String origen, String destino, int cantidadPasajero) {
		
		/* 
		 * El constructor debe generar las acciones necesarias para garantizar el correcto funcionamiento de los objetos de la clase.
		 */
		this.origen = origen;
		this.destino = destino;
		this.pasajeros[cantidadPasajero] = pasajeros[cantidadPasajero];
	}

	public boolean agregarPasajero(Pasajero pasajero) {
		boolean agregado = false;
		/*
		 * Incorpora un nuevo pasajero a la lista de pasajeros del avi�n. Devuelve true si se pudo agregar o false si la capacidad del vuelo se encuentra completa.
		 */
		for(int i=0;i<pasajeros.length;i++) {
			if(pasajeros[i] == null) {
				pasajeros[i] = pasajero;
				agregado = true;
			}
		}
		return agregado;
	}

	public boolean verificarDisponibilidadAsiento(int fila, int columna) {
		boolean verificado = false;
		/*
		 * Verifica si el asiento indicado se encuentra disponible.
		 */
		for(int i=0; i<= CANTIDAD_DE_FILAS;i++) {
			for(int j = 1; j<= CANTIDAD_DE_ASIENTOS_POR_FILA;i++) {
				if(fila ==i && columna == j && asientos[i][j] == null) {
					verificado = true;
				}
			}
		}
		return verificado;
	}

	public Pasajero buscarPasajero(int dni) {
		Pasajero buscado = null;
		/*
		 * Busca un pasajero en la lista de pasajeros a partir del DNI. Si no lo encuentra devuelve null.
		 */
		for(int i=0;i<pasajeros.length;i++) {
			if(pasajeros[i].getDni() == dni) {
				buscado = pasajeros[i];
			}
		}
		return buscado;
	}

	public boolean asignarAsiento(Pasajero pasajero, int fila, int columna) {
		boolean asignado = false;
		/*
		 * Asigna el asiento al pasajero recibido por par�metro. Devuelve true si lo pudo asignar o false en caso que el asiento no se encuentre disponible.
		 */
		for(int i =0; i< asientos[CANTIDAD_DE_FILAS].length;i++) {
			for(int j =1; j< asientos[CANTIDAD_DE_ASIENTOS_POR_FILA].length;i++) {
				if(asientos[fila][columna] == null) {
					asientos[fila][columna] = pasajero;
				}
			}
		}
		return asignado;
	}
	
	public void ordenarListaDePasajerosPorDNI() {
		
		/*
		 * Ordena la lista de pasajeros por DNI.
		 */
		for(int i =0; i< pasajeros.length;i++) {
			if(pasajeros[i].getDni() < pasajeros[i+1].getDni()) {
				
			}
		}
	}
	
	public Pasajero[] getPasajeros() {
		Pasajero[] lista = new Pasajero[192] ;
		/*
		 * Devuelve la lista de pasajeros
		 */
		for(int i=0; i< pasajeros.length; i++) {
			if(pasajeros[i] != null) {
				lista[i] = pasajeros[i];
			}
		}
		return lista;
	}
	
	public String toString() {
		
		/*
		 * Devuelve un mapa de los asientos del vuelo indicando por cada uno si se encuentra libre "L" u ocupado "O".
		 */
		return "Vuelo [asientos =" + asientos + ", pasajero =" + pasajeros + " ]";
	}
}
