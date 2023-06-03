package Herencia02_Figuras;

import java.awt.Color;

public class Triangulo extends Figura{
	
	private double alto;
	private double base;
	
	public Triangulo(double alto, double base) {
		setAlto(alto);
		setBase(base);
	}

	public Triangulo(double alto, double base, Color color) {
		super(color);
		setAlto(alto);
		setBase(base);
	}

	public Triangulo(double alto, double base, Color color, int[] Posicion) {
		super(color, Posicion);
		setAlto(alto);
		setBase(base);
	}

	public double getAlto() {
		return alto;
	}

	public void setAlto(double alto) {
		this.alto = alto;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	@Override
	public double calculaArea() {
		return (base * alto) / 2;
	}
	
	@Override
	public int compareTo(Object o) {
		Figura c = (Figura) o;
		if (this.calculaArea() > c.calculaArea()) return 1;
		else if (c.calculaArea() == this.calculaArea()) return 0;
		else return -1;
	}
}
