package ar.edu.unlam.pb;

public class Contacto {
	private String nombre;
	private String apellido;
	private Integer celular;
	private String email;
	private String direccion;
	private Integer codigoPostal;
	private String localidad;
	private Provincia provincia;
	private Boolean esCliente;
	private Boolean deseaSerLlamado;
	
	
	public Contacto() {
		esCliente = false;
		deseaSerLlamado = true;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public Integer getCelular() {
		return celular;
	}


	public void setCelular(Integer celular) {
		this.celular = celular;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getDireccion() {
		return direccion;
	}


	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}


	public Integer getCodigoPostal() {
		return codigoPostal;
	}


	public void setCodigoPostal(Integer codigoPostal) {
		this.codigoPostal = codigoPostal;
	}


	public String getLocalidad() {
		return localidad;
	}


	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}


	public Provincia getProvincia() {
		return provincia;
	}


	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}


	public Boolean getEsCliente() {
		return esCliente;
	}


	public void setEsCliente(Boolean esCliente) {
		this.esCliente = esCliente;
	}


	public Boolean getDeseaSerLlamado() {
		return deseaSerLlamado;
	}


	public void setDeseaSerLlamado(Boolean deseaSerLlamado) {
		this.deseaSerLlamado = deseaSerLlamado;
	}
}
