package Herencia04_11_Animales;

public class Gato extends Mascota {
	
	protected double alturaSalto;
	protected double longitudSalto;

	public Gato() {
		super();
	}
	
	public Gato(String nombre, int edad, String color, double alturaSalto,
			double longitudSalto) {
		super(nombre, edad, color);
		this.alturaSalto = alturaSalto;
		this.longitudSalto = longitudSalto;
	}
	
	public double getAlturaSalto() {
		return alturaSalto;
	}
	public void setAlturaSalto(double alturaSalto) {
		this.alturaSalto = alturaSalto;
	}
	public double getLongitudSalto() {
		return longitudSalto;
	}
	public void setLongitudSalto(double longitudSalto) {
		this.longitudSalto = longitudSalto;
	}

	@Override
	public String toString() {
		return "Gato [alturaSalto=" + alturaSalto + ", longitudSalto=" + longitudSalto + ", nombre=" + nombre
				+ ", edad=" + edad + ", color=" + color + "]";
	}
	
	@Override
	public String sonido() {
		return "Miau rrrrr";
	}

}
