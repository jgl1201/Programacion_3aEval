package Herencia04_11_Animales;

public class GatoPeloL extends Gato {
	
	public enum razas {ANGORA, HIMALAYO, BALINES, SOMALI};
	private razas raza;
	
	public GatoPeloL() {
		super();
	}
	public GatoPeloL(String nombre, int edad, String color, double alturaSalto,
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
		return "GatoPeloL [raza=" + raza + ", alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto
				+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
	
}
