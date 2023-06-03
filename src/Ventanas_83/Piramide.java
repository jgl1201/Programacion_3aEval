package Ventanas_83;

public class Piramide extends FiguraGeometrica {
	private double base;
	private double altura;
	private double apotema;
	
	public Piramide(double base, double altura, double apotema) {
		super();
		this.base = base;
		this.altura = altura;
		this.apotema = apotema;
		this.setVolumen(calcularVolumen());
		this.setSuperficie(calcularSuperficie());
	}
	
	public double calcularVolumen() {
		return (Math.pow(base, 2.0) * altura) / 3.0;
	}
	
	public double calcularSuperficie() {
		return (Math.pow(base, 2.0) ) + (2.0 * base * apotema);
	}

	@Override
	public String toString() {
		return "Piramide [base=" + base + ", altura=" + altura + ", apotema=" + apotema + "]";
	}
}
