package Herencia04_12_Animales;

abstract public class Felino extends Animal {

	public Felino(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}

	@Override
	public String toString() {
		return "Felino [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
}
