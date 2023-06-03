package Herencia03_Vehiculos;

import java.awt.Color;

@SuppressWarnings("rawtypes")
public class Coche extends Vehiculo implements Comparable, EstacionServicio {

	private int NumPuertas;

	Coche(byte NumeroDeRuedas) {
		super(NumeroDeRuedas);
	}

	Coche(Color color, byte NumeroDeRuedas) {
		super(color, NumeroDeRuedas);
	}

	Coche(Color color, byte NumeroDeRuedas, short Cilindrada) {
		super(color, NumeroDeRuedas, Cilindrada);
	}

	Coche(Color color, byte NumeroDeRuedas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);

	}

	Coche(Color color, byte NumeroDeRuedas, int NumPuertas, short Cilindrada, short Potencia) {
		super(color, NumeroDeRuedas, Cilindrada, Potencia);
		setNumPuertas(NumPuertas);
	}

	public int getNumPuertas() {
		return NumPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		NumPuertas = numPuertas;
	}

	@Override
	public String toString() {
		return "Coche [NumPuertas=" + NumPuertas + ", ColorVehiculo=" + ColorVehiculo + ", NumRuedas=" + NumRuedas
				+ ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
	}

	@Override
	public double pagarRodaje() {
		return super.pagarRodaje() + (40 * getNumPuertas()) + (0.18 * getPotencia());
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
		if (esDiesel()) return super.pagarCarburante() + PRECIO_GASOIL * pideLitros();
		else return super.pagarCarburante() + PRECIO_GASOLINA * pideLitros();
	}
	
}
