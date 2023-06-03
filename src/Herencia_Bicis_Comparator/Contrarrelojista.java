package Herencia_Bicis_Comparator;

public class Contrarrelojista extends Ciclista {
	
	private double velocidadMaxima;

	public Contrarrelojista(int identificador, String nombre, double velocidadMaxima) {
		super(identificador, nombre);
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
