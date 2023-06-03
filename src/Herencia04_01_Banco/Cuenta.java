package Herencia04_01_Banco;

import java.text.DecimalFormat;

public class Cuenta {

	protected float saldo;
	protected int numeroIngresos = 0;
	protected int numeroDeRetiros = 0;
	protected float porcientoTasaAnual;
	protected float comisionMensual = 0;

	public DecimalFormat df = new DecimalFormat("0.00");

	public Cuenta() {
		super();
	}

	public Cuenta(float saldo, float porcientoTasaAnual) {
		super();
		this.saldo = saldo;
		this.porcientoTasaAnual = porcientoTasaAnual;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getNumeroIngresos() {
		return numeroIngresos;
	}

	public void setNumeroIngresos(int numeroIngresos) {
		this.numeroIngresos = numeroIngresos;
	}

	public int getNumeroDeRetiros() {
		return numeroDeRetiros;
	}

	public void setNumeroDeRetiros(int numeroDeRetiros) {
		this.numeroDeRetiros = numeroDeRetiros;
	}

	public float getPorcientoTasaAnual() {
		return porcientoTasaAnual;
	}

	public void setPorcientoTasaAnual(float porcientoTasaAnual) {
		this.porcientoTasaAnual = porcientoTasaAnual;
	}

	public float getComisionMensual() {
		return comisionMensual;
	}

	public void setComisionMensual(float comisionMensual) {
		this.comisionMensual = comisionMensual;
	}

	public boolean Ingreso(float ingreso) {
		boolean ingresoCorrecto = true;
		if (ingreso < 0) {
			ingresoCorrecto = false;
		} else {
			saldo = saldo + ingreso;
			numeroIngresos++;
			System.out.println("Ingreso de " + ingreso + " € hecho");
		}
		return ingresoCorrecto;
	}

	public boolean Retirar(float retirar) {// Mismo objetivo que en ingreso
		boolean retirarCorrecto = true;
		if (retirar <= 0) {
			retirarCorrecto = false;
		} else if (saldo >= retirar) {
			saldo = saldo - retirar;
			numeroDeRetiros++;
			System.out.println("Retirada de " + retirar + "€ hecho");
		} else {
			System.out.println("Saldo insuficiente, retirada de " + retirar + "€ denegada");
			retirarCorrecto = false;
		}
		return retirarCorrecto;
	}

	public float InteresMensual() {
		comisionMensual = saldo * (porcientoTasaAnual / 12) / 100;
		saldo = saldo - comisionMensual;
		return comisionMensual;
	}

	public void ExtractoMensual() {
		System.out.println("Interes mensual: " + df.format(InteresMensual()) + " €/mes");
		System.out.println("Saldo: " + df.format(saldo) + " €");

	}

	public String Imprimir() {

		System.out.println("Cuenta [saldo= " + df.format(saldo) + " €, numeroIngresos=" + numeroIngresos
				+ ", numeroDeRetiros=" + numeroDeRetiros + ", porcientoTasaAnual=" + df.format(porcientoTasaAnual)
				+ "%, comisionMensual=" + df.format(comisionMensual) + "€]");
		return null;
	}

	@Override
	public String toString() {

		StringBuilder builder = new StringBuilder();
		builder.append("Cuenta [ ");
		if (this instanceof CuentaAhorros) {
			builder.append("Cuenta de Ahorro - Transacciones= ");
			builder.append(numeroDeRetiros + numeroIngresos + ", ");
			if (saldo < 100) {
				builder.append("cuenta inactiva, ");
			}

		}
		if (this instanceof CuentaCorriente) {
			builder.append("Cuenta Corriente - Transacciones= ");
			builder.append(numeroDeRetiros + numeroIngresos + ", ");

		}

		builder.append("Numero Ingresos= ");

		builder.append(numeroIngresos);

		builder.append(", Numero Retiros= ");

		builder.append(numeroDeRetiros);

		builder.append(", Saldo= ");

		builder.append(df.format(saldo));

		builder.append("€, TasaAnual= ");

		builder.append(df.format(porcientoTasaAnual));

		builder.append("%, Comision Mensual= ");

		builder.append(df.format(comisionMensual));

		builder.append("€]");

		return builder.toString();
	}

}
