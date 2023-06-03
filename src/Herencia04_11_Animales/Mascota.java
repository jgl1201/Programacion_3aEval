package Herencia04_11_Animales;

abstract public class Mascota {
	
	protected String nombre;
	protected int edad;
	protected String color;
	
	public Mascota() {
		super();
	}
	public Mascota(String nombre, int edad, String color) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.color = color;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	abstract public String sonido();
	
}
