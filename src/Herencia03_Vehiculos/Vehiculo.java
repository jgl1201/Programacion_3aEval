package Herencia03_Vehiculos;

import java.awt.Color;
import java.util.Scanner;

@SuppressWarnings("rawtypes")
public class Vehiculo implements Comparable, EstacionServicio{

	protected Color ColorVehiculo;
	protected byte NumRuedas;
	protected short Cilindrada;
	protected short Potencia;

	Vehiculo(Color color) {
		setColor(color);
	}

	Vehiculo(byte NumRuedas) {
		this.NumRuedas = NumRuedas;
	}

	Vehiculo(short Cilindrada) {
		this.Cilindrada = Cilindrada;
	}

	Vehiculo(Color color, byte NumRuedas) {
		this(color);
		this.NumRuedas = NumRuedas;
	}

	Vehiculo(Color color, byte NumRuedas, short Cilindrada) {
		this(color, NumRuedas);
		this.Cilindrada = Cilindrada;
	}

	Vehiculo(Color color, byte NumRuedas, short Cilindrada, short Potencia) {
		this(color, NumRuedas, Cilindrada);
		this.Potencia = Potencia;
	}

	public Color getColor() {
		return ColorVehiculo;
	}

	public void setColor(Color colorVehiculo) {
		ColorVehiculo = colorVehiculo;
	}

	public byte getNumRuedas() {
		return NumRuedas;
	}

	public void setNumRuedas(byte numRuedas) {
		NumRuedas = numRuedas;
	}

	public short getCilindrada() {
		return Cilindrada;
	}

	public void setCilindrada(short cilindrada) {
		Cilindrada = cilindrada;
	}

	public short getPotencia() {
		return Potencia;
	}

	public void setPotencia(short potencia) {
		Potencia = potencia;
	}

	@Override
	public String toString() {
		return "Vehiculo [ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas + ", Cilindrada=" + Cilindrada
				+ ", Potencia=" + Potencia + "]";
	}
	
	public double pagarRodaje() {
		return 53.27d;
	}
	
	@Override
	public int compareTo(Object o) {
		Vehiculo v = (Vehiculo) o;
		if (this.pagarRodaje() > v.pagarRodaje()) return -1;
		else if (this.pagarRodaje() == v.pagarRodaje()) return 0;
		else return 1;
	}
	
	@Override
	public double pagarCarburante() {
		System.out.println("Impuesto general: ");
		return 1.55;
	}
	
	@SuppressWarnings("resource")
	public double pideLitros() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Litros: ");
		double litros = sc.nextDouble();
		return litros;
	}
	
	@SuppressWarnings("resource")
	public boolean esDiesel() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Si es diesel ponga 's': ");
		char r = sc.nextLine().charAt(0);
		if (r == 's' || r == 'S') return true;
		return false;
	}

}
