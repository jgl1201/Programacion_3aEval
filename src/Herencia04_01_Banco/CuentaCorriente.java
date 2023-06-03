package Herencia04_01_Banco;

public class CuentaCorriente extends Cuenta {
	protected float sobregiro = 0;

	public CuentaCorriente(float saldo, float porcientoTasaAnual, float sobregiro) {
		super(saldo, porcientoTasaAnual);
		this.sobregiro = sobregiro;
	}

	public float getSobregiro() {
		return sobregiro;
	}

	public void setSobregiro(float sobregiro) {
		this.sobregiro = sobregiro;
	}

	@Override
	public boolean Ingreso(float ingreso) {

		if (sobregiro > 0) {
			if (ingreso <= sobregiro) {
				System.out.println("Ingreso de: " + ingreso + " € para pagar sobregiro de " + sobregiro + " €");
				sobregiro = sobregiro - ingreso;
				ingreso = 0;
				System.out.println("Sobregiro actual de: " + sobregiro + " €,");
			} else {
				System.out.println("Ingreso de: " + ingreso + " € para pagar sobregiro de " + sobregiro + " €");
				ingreso = ingreso - sobregiro;
				sobregiro = 0;
				System.out.println("Sobregiro actual de: " + sobregiro + " €,");
			}

		}
		return super.Ingreso(ingreso);
	}

	public boolean Retirar(float retirar) {
		boolean retirarCorrecto = true;
		if (retirar < 0) {
			retirarCorrecto = false;
		} else if (saldo >= retirar) {
			saldo = saldo - retirar;
			numeroDeRetiros++;
			System.out.println("retiro de " + retirar + "€ hecho");
		} else {
			sobregiro = retirar - saldo;
			saldo = 0;
			numeroDeRetiros++;
			System.out.println("retiro de " + retirar + "€ hecho" + '\n' + "Sobregiro de: " + sobregiro + " €");
			retirarCorrecto = true;
		}
		return retirarCorrecto;
	}

	@Override
	public void ExtractoMensual() {
		super.ExtractoMensual();
	}

	public String Imprimir() {
		System.out.println("Cuenta Corriente [Sobregiro= " + df.format(sobregiro) + "€, Saldo= " + df.format(saldo)
				+ "€, ComisionMensual= " + df.format(comisionMensual) + ", Transacciones= "
				+ (numeroDeRetiros + numeroIngresos) + " ( " + numeroDeRetiros + " retiros, " + numeroIngresos
				+ " ingresos" + ")]");
		return null;
	}

}
