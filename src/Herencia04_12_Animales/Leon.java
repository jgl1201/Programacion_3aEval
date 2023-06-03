package Herencia04_12_Animales;

public class Leon extends Felino {

	public Leon(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super(sonido, alimentos, habitat, nombreCientifico);
	}

	@Override
	public String toString() {
		return "Leon [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}

}
