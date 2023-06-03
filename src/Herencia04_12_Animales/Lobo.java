package Herencia04_12_Animales;

public class Lobo extends Perro {

	public Lobo(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}

	@Override
	public String toString() {
		return "Lobo [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

}
