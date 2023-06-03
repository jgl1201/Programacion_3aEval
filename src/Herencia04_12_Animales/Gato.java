package Herencia04_12_Animales;

public class Gato extends Felino {

	public Gato(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}

	@Override
	public String toString() {
		return "Gato [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

}
