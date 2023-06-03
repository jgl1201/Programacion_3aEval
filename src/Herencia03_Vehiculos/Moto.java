package Herencia03_Vehiculos;

import java.awt.Color;

@SuppressWarnings("rawtypes")
public class Moto extends Vehiculo implements Comparable, EstacionServicio {

	private byte NumeroDePlazas;

	Moto() {
		super((byte) 2);
	}

	Moto(byte NumeroDePlazas) {
		super((byte) 2);
		setNumeroDePlazas(NumeroDePlazas);
	}

	Moto(Color color) {
		super(color, (byte) 2);
	}

	Moto(Color color, short Cilindrada) {
		super(color, (byte) 2, Cilindrada);
	}

	Moto(Color color, short Cilindrada, short Potencia) {
		super(color, (byte) 2, Cilindrada, Potencia);
	}

	public byte getNumeroDePlazas() {
		return NumeroDePlazas;
	}

	public void setNumeroDePlazas(byte numeroDePlazas) {
		NumeroDePlazas = numeroDePlazas;
	}

	@Override
	public String toString() {
		return "Moto [NumeroDePlazas=" + NumeroDePlazas + ", ColorVehiculo=" + ColorVehiculo + ", NumRuedas="
				+ NumRuedas + ", Cilindrada=" + Cilindrada + ", Potencia=" + Potencia + "]";
	}

	@Override
	public double pagarRodaje() {
		return super.pagarRodaje() + (1.24 * getPotencia());
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
		return super.pagarCarburante() + PRECIO_GASOLINA * pideLitros();
	}
	
}
