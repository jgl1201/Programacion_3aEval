package Herencia02_Figuras;

import java.awt.Color;
import java.util.Arrays;

public class Cuadrado extends Figura{

	private double Lado;

	public Cuadrado(double Lado) {
		setLado(Lado);
	}

	public Cuadrado(Color color, double Lado) {
		super(color);
		setLado(Lado);
	}

	public Cuadrado(Color color, int[] Posicion, double Lado) {
		super(color, Posicion);
		setLado(Lado);
	}

	public double getLado() {
		return Lado;
	}
	public void setLado(double lado) {
		Lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [Lado=" + Lado + ", ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion)
				+ "]";
	}

	@Override
	public double calculaArea() {
		return Lado * Lado;
	}
	
	@Override
	public int compareTo(Object o) {
		Figura c = (Figura) o;
		if (this.calculaArea() > c.calculaArea()) return 1;
		else if (c.calculaArea() == this.calculaArea()) return 0;
		else return -1;
	}
	
}
