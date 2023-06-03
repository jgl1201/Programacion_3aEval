package Herencia04_11_Animales;

public class PerroGrande extends Perro {

	public enum razas { PASTOR_ALEMAN, DOBERMAN, ROTWEILLER}
	private razas raza;

	public PerroGrande() {
		super();
	}

	public PerroGrande(String nombre, int edad, String color, double peso,
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
		return "PerroGrande [raza=" + raza + ", peso=" + peso + ", muerde=" + muerde + ", nombre=" + nombre + ", edad="
				+ edad + ", color=" + color + "]";
	};
	
	
	
}
