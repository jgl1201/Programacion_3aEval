package Herencia04_11_Animales;

public class PerroMed extends Perro {

	public enum razas {COLLIE, DALMATA, BULLDOG, GALGO, SABUESO};
	private razas raza;
	
	public PerroMed() {
		super();
	}
	public PerroMed(String nombre, int edad, String color, double peso,
			boolean muerde, razas raza) {
		super(nombre, edad, color, peso, muerde);
		this.raza = raza;
		}
	
	public razas getRaza() {
		return raza;
	}
	public void setRaza(razas raza) {
		this.raza = raza;
	}
	
	@Override
	public String toString() {
		return "PerroMed [raza=" + raza + ", peso=" + peso + ", muerde=" + muerde + ", nombre=" + nombre + ", edad="
				+ edad + ", color=" + color + "]";
	}

}
