package Ventanas_83;

public class Esfera extends FiguraGeometrica {
	private double radio;

	public Esfera(double radio) {
		this.radio = radio;
		this.setVolumen(calcularVolumen());
		this.setSuperficie(calcularSuperficie());
	}
	
	public double calcularVolumen() {
		return (4/3) * Math.PI * Math.pow(radio, 3);
	}
	
	public double calcularSuperficie() {
		return 4.0 * Math.PI * Math.pow(radio, 2.0);
	}

	@Override
	public String toString() {
		return "Esfera [radio=" + radio + "]";
	}
	
}
