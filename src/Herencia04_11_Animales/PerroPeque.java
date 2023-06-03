package Herencia04_11_Animales;

public class PerroPeque extends Perro {

	public enum razas {CANICHE, YORKSHIRE_TERRIER, SCHNAUZER, CHIHUAHUA};
	private razas raza;
	
	public PerroPeque() {
		super();
	}
	public PerroPeque(String nombre, int edad, String color, double peso,
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
		return "PerroPeque [raza=" + raza + ", peso=" + peso + ", muerde=" + muerde + ", nombre=" + nombre + ", edad="
				+ edad + ", color=" + color + "]";
	}

}
