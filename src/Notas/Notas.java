package Notas;

public class Notas {
	double[] listaNotas;

	public Notas() {
		listaNotas = new double[5];
	}
	
	double calcularPromedio() {
		double suma = 0;
		for (Double n : listaNotas) suma += n;
		return suma / listaNotas.length;
	}

	double calcularDesviacion() {
		double prom = calcularPromedio();
		double suma = 0;
		for (Double n : listaNotas) suma += Math.pow(n - prom, 2);
		return Math.sqrt(suma / listaNotas.length);
	}
	
	double calcularMenor() {
		double menor = listaNotas[0];
		for (Double n : listaNotas) {
			if (n < menor) menor = n;
		}
		return menor;
	}
	
	double calcularMayor() {
		double mayor = listaNotas[0];
		for (Double n : listaNotas) {
			if (n > mayor) mayor = n;
		}
		return mayor;
	}
}
