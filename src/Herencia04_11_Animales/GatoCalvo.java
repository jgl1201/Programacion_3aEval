package Herencia04_11_Animales;

public class GatoCalvo extends Gato {

	public enum razas {ESFINGE, ELFO, DONSKOY};
	private razas raza;
	
	public GatoCalvo() {
		super();
	}
	public GatoCalvo(String nombre, int edad, String color, double alturaSalto,
			double longitudSalto, razas raza) {
		super(nombre, edad, color, alturaSalto, longitudSalto);
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
		return "GatoCalvo [raza=" + raza + ", alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto
				+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
	
	
}
