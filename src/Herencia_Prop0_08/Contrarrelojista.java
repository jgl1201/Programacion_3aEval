package Herencia_Prop0_08;

public class Contrarrelojista extends Ciclista {
	
	private double velocidadMaxima;

	public Contrarrelojista(int identificador, String nombre, double velocidadMaxima, double tiempoAcumulado) {
		super(identificador, nombre, tiempoAcumulado);
		this.velocidadMaxima = velocidadMaxima;
	}
	
	public double getVelocidadMaxima() {
		return velocidadMaxima;
	}
	public void setVelocidadMaxima(double velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String toString() {
		return super.toString() + "Contrarrelojista [velocidadMaxima=" + velocidadMaxima + "]";
	}

	@Override
	public String imprimirTipo() {
		return "Contrarrelojista";
	}
}
