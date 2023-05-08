package ar.edu.unlam.pb;

public class Persona {
	private boolean viva;
	private int edad;
	private String nombre;
	private double peso;
	private double altura;
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public boolean isViva() {
		return viva;
	}
	public Persona() {
		viva = true;
		edad =0;
	}
	public void morir() {
		viva = false;
	}
	public boolean estaViva() {
		return viva;
	}
	public void setViva(boolean viva) {
		this.viva = viva;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}
//Completar la clase persona
//armar los test de los ejercicios integradores
//hacer tpo
