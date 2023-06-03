package Herencia04_01_Banco;

public class CuentaAhorros extends Cuenta {
	protected boolean cuentaInactiva;

	public CuentaAhorros(float saldo, float porcientoTasaAnual, boolean cuentaInactiva) {
		super(saldo, porcientoTasaAnual);
		this.cuentaInactiva = cuentaInactiva;
	}

	@Override
	public boolean Ingreso(float ingreso) {

		if (cuentaInactiva = saldo < 100) {

			cuentaInactiva = true;
			System.out.println("La cuenta esta inactiva(saldo menor 100€), ingreso no realizado");
			return false;
		} else
			return super.Ingreso(ingreso);
	}

	@Override
	public boolean Retirar(float retirar) {

		if (cuentaInactiva = saldo - retirar < 100) {
			cuentaInactiva = true;
			System.out.println("Solo puede retirar hasta " + (saldo - 100) + " €");
			retirar = 0;
			return false;
		}
		return super.Retirar(retirar);
	}

	@Override
	public void ExtractoMensual() {
// Aqui para calcular el añadido lo he multiplicado por 3/2, porque el 1.5 es double
		if (numeroDeRetiros > 4) {
			saldo = saldo - ((numeroDeRetiros - 4) * 3 / 2);

			System.out.println("Sobrepasa en " + (numeroDeRetiros - 4) + " retiros");
			System.out.println((numeroDeRetiros - 4) + " x 1.5€ = " + df.format(((numeroDeRetiros - 4) * 3 / 2)));
		}
		if (cuentaInactiva = saldo < 100) {// Tenia otra experesion
			cuentaInactiva = true;
			System.out.println("La cuenta esta inactiva(saldo menor 100€)");
		} else {
			cuentaInactiva = false;
			System.out.println("La cuenta esta activa(saldo superior 100€)");
		}

		System.out.println("Numero de retiros:" + numeroDeRetiros);
		super.ExtractoMensual();

	}

	public String ImprimirCA() {
		System.out.println("CuentaAhorros [saldo= " + df.format(saldo) + ", comisionMensual="
				+ df.format(comisionMensual) + ", Transacciones= " + numeroDeRetiros + numeroIngresos + " ( "
				+ numeroDeRetiros + " retiros, " + numeroIngresos + " ingresos" + ")]");
		return null;
	}
}