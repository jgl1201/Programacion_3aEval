package Herencia02_Figuras;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;

public class Test {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		int[] Posicion = { 10, 20 };
		double[] Lados = { 50d, 100d };
		
		Circulo MiCirculo = new Circulo(3d, Color.red, Posicion);
		Rectangulo MiRectangulo = new Rectangulo(Lados, Color.blue, Posicion);		
		Cuadrado miCuadrado = new Cuadrado(Color.black, Posicion, 5.6d);
		Triangulo miTriangulo = new Triangulo(12, 12, Color.red, Posicion);

		ArrayList<Figura> figuras = new ArrayList<Figura>();
		figuras.add(MiCirculo);
		figuras.add(MiRectangulo);
		figuras.add(miCuadrado);
		figuras.add(miTriangulo);
		for (Figura i : figuras) {
			System.out.println(i.toString());
			System.out.println("Area: " + i.calculaArea());
		}
		
		Collections.sort(figuras);
		for (Figura i : figuras) {
			System.out.println(i.toString());
			System.out.println("Area: " + i.calculaArea());
		}
	}

}
