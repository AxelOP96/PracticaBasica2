package ar.edu.unlam.pb2.aerolineas;

public class Aeropuerto {

	private Long id;
	private String nombre;
	private String codigo;
	private String direccion;

	public Aeropuerto(Long id, String nombre, String codigo, String direccion) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.nombre = nombre;
		this.codigo = codigo;
		this.direccion = direccion;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
