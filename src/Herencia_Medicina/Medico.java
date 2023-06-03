package Herencia_Medicina;

public class Medico {

	protected String nombre;

	public Medico(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Medico [nombre=" + nombre + "]";
	}

}
