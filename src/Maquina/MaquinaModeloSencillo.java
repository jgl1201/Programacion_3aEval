package Maquina;

public class MaquinaModeloSencillo {

	public MaquinaAlmacen Deposito1Euro = new MaquinaAlmacen((short) 8);
	public MaquinaAlmacen Deposito01Euro = new MaquinaAlmacen((short) 15);

	public MaquinaAlmacen DepositoCocaCola = new MaquinaAlmacen((short) 10);
	public MaquinaAlmacen DepositoNaranja = new MaquinaAlmacen((short) 5);
	public MaquinaAlmacen DepositoAgua = new MaquinaAlmacen((short) 8);

	private float PrecioCocaCola = 1.0f;
	private float PrecioNaranja = 1.3f;
	private float PrecioAgua = 0.6f; // precio recomendado

	public void PonPrecios(float CocaCola, float Naranja, float Agua) {
		PrecioCocaCola = CocaCola;
		PrecioNaranja = Naranja;
		PrecioAgua = Agua;
	}

	public float DimePrecioCocaCola() {
		return PrecioCocaCola;
	}

	public float DimePrecioNaranja() {
		return PrecioNaranja;

	}

	public float DimePrecioAgua() {
		return PrecioAgua;
	}

	public void MostrarEstadoMaquina() {
		System.out.print("CocaColas: " + DepositoCocaCola.DimeNumeroDeElementos() + " ");
		System.out.print("Naranjas: " + DepositoNaranja.DimeNumeroDeElementos() + " ");
		System.out.println("Agua: " + DepositoAgua.DimeNumeroDeElementos() + " ");

		System.out.print("1 Euro: " + Deposito1Euro.DimeNumeroDeElementos() + " ");
		System.out.println("0.1 Euro: " + Deposito01Euro.DimeNumeroDeElementos() + " ");
		System.out.println();
	}

}
