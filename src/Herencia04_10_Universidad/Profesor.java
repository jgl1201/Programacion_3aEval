package Herencia04_10_Universidad;

public class Profesor extends Persona {
	
	private String departamento;
	private String categoria;
	
	public Profesor() {
		super();
	}
	public Profesor(String nombre, String direccion, String departamento, String categoria) {
		super(nombre, direccion);
		this.departamento = departamento;
		this.categoria = categoria;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	@Override
	public String toString() {
		return "Profesor [departamento=" + departamento + ", categoria=" + categoria + ", nombre=" + nombre
				+ ", direccion=" + direccion + "]";
	}

}
