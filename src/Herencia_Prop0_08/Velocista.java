package Herencia_Prop0_08;

public class Velocista extends Ciclista {
	
	private double potenciaPromedio;
	private double velocidadPromedio;

	public Velocista(int identificador, String nombre, double potenciaPromedio, double velocidadPromedio, double tiempoAcumulado) {
		super(identificador, nombre, tiempoAcumulado);
		this.potenciaPromedio = potenciaPromedio;
		this.velocidadPromedio = velocidadPromedio;
	}

	public double getPotenciaPromedio() {
		return potenciaPromedio;
	}
	public void setPotenciaPromedio(double potenciaPromedio) {
		this.potenciaPromedio = potenciaPromedio;
	}
	public double getVelocidadPromedio() {
		return velocidadPromedio;
	}
	public void setVelocidadPromedio(double velocidadPromedio) {
		this.velocidadPromedio = velocidadPromedio;
	}

	@Override
	public String toString() {
		return super.toString() + "Velocista [potenciaPromedio=" + getPotenciaPromedio() + ", velocidadPromedio=" + getVelocidadPromedio() + "]";
	}

	@Override
	public String imprimirTipo() {
		return "Velocista";
	}

}
