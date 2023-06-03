package Herencia01_Publicacion;

public class Periodico extends Publicacion{
	
	public String Nombre;
	public String Fecha;
	
	public Periodico() {
		super();
	}
	
	public Periodico(int NumeroDePaginas, float Precio, String nombre, String fecha) {
		super(NumeroDePaginas, Precio);
		Nombre = nombre;
		Fecha = fecha;
	}
	
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getFecha() {
		return Fecha;
	}
	public void setFecha(String fecha) {
		Fecha = fecha;
	}

	@Override
	public String toString() {
		return "Periodico [Nombre=" + Nombre + ", Fecha=" + Fecha + ", NumeroDePaginas=" + NumeroDePaginas + ", Precio="
				+ Precio + "]";
	}

}
