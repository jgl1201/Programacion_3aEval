package Herencia04_11_Animales;

public class GatoPeloC extends Gato {
	
	public enum razas {AZUL_RUSO, BRITANICO, MANX, DEVON_REX};
	private razas raza;
	
	public GatoPeloC() {
		super();
	}
	public GatoPeloC(String nombre, int edad, String color, double alturaSalto,
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
		return "GatoPeloC [raza=" + raza + ", alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto
				+ ", nombre=" + nombre + ", edad=" + edad + ", color=" + color + "]";
	}
}
