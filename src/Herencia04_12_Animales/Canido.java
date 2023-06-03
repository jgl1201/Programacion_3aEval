package Herencia04_12_Animales;

abstract public class Canido extends Animal{

	public Canido(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}

	@Override
	public String toString() {
		return "Canido [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

}
