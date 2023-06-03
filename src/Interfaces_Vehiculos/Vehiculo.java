package Interfaces_Vehiculos;

public abstract class Vehiculo {

	protected int velocidadActual;
	protected int velocidadMaxima;

	public Vehiculo(int velocidadActual, int velocidadMaxima) {
		super();
		this.velocidadActual = velocidadActual;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return "Vehiculo [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}

	abstract void acelerar(int incremento);

	abstract void frenar(int incremento);

}
