package Herencia02_Figuras;

import java.awt.Color;
import java.util.Arrays;

@SuppressWarnings("rawtypes")
abstract public class Figura implements Comparable{

	protected Color ColorFigura;
	protected int[] Posicion = new int[2];

	Figura() {
		setColor(Color.black);
		Posicion[0] = 0;
		Posicion[1] = 0;
	}

	Figura(Color color) {
		setColor(color);
	}

	Figura(Color color, int[] Posicion) {
		setColor(color);
		setCentro(Posicion);
	}

	public void setCentro(int[] Posicion) {
		this.Posicion[0] = Posicion[0];
		this.Posicion[1] = Posicion[1];
	}
	public int[] getCentro() {
		return Posicion;
	}
	public Color getColor() {
		return ColorFigura;
	}
	public void setColor(Color colorFigura) {
		ColorFigura = colorFigura;
	}

	@Override
	public String toString() {
		return "Figura [ColorFigura=" + ColorFigura + ", Posicion=" + Arrays.toString(Posicion) + "]";
	}
	
	abstract public double calculaArea();
}
