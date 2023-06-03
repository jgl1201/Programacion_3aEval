package Herencia04_11_Animales;

public class Perro extends Mascota {
	
	protected double peso;
	protected boolean muerde;
	
	public Perro() {
		super();
	}

	public Perro(String nombre, int edad, String color, double peso, boolean muerde) {
		super(nombre, edad, color);
		this.peso = peso;
		this.muerde = muerde;
	}

	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public boolean isMuerde() {
		return muerde;
	}
	public void setMuerde(boolean muerde) {
		this.muerde = muerde;
	}
	
	@Override
	public String toString() {
		return "Perro [peso=" + peso + ", muerde=" + muerde + ", nombre=" + nombre + ", edad=" + edad + ", color="
				+ color + "]";
	}

	@Override
	public String sonido() {
		return "Guau";
	}

}
