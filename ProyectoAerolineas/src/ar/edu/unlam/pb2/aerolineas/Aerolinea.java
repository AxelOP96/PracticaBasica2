package ar.edu.unlam.pb2.aerolineas;

import java.util.ArrayList;
import java.util.Iterator;

public class Aerolinea {

	private String nombre;
	//ArrayList de aeropuerto, no haay que especificar la cantidad de delementos es dinamico
	private ArrayList <Aeropuerto> aeropuertos = new ArrayList<> ();
	//LinkedList
	//Set: HashSet, Treeset. No permiten duplicados
	public Aerolinea(String nombre) {
		// TODO Auto-generated constructor stub
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean registrarAeropuerto(Aeropuerto aeropuerto) {
		// TODO Auto-generated method stub
		return this.aeropuertos.add(aeropuerto);
	}

	public Aeropuerto buscarAeropuertoPorCodigo(String codigo) {
		//FOREACH
		for(Aeropuerto aeropuerto : aeropuertos) {
			if(aeropuerto.getCodigo().equals(codigo))
				return aeropuerto;
			}
			return null;
		}
	
	public Aeropuerto buscarAeropuertoPorCodigo2(String codigo) {
		//FOREACH
		for(int i=0; i <aeropuertos.size(); i++) {
			if(this.aeropuertos.get(i).getCodigo().equals(codigo)) 
				return this.aeropuertos.get(i);
			}
			return null;
		}
	//Tarea porque, cuando y como usar un iterador
	//asignacion de asientos
	public Aeropuerto buscarAeropuertoPorCodigo3(String codigo) {
		//FOREACH
		Iterator <Aeropuerto> it = this.aeropuertos.iterator();
		
		/*while(it.hasNext())
			Aeropuerto aeropuerto = it.next();
		//while(it.next()!=null);*/
			return null;
		}
	}

