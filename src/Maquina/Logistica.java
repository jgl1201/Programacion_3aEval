package Maquina;

public class Logistica {

	private String Nombre;
	private byte Capacidad;
	private byte NumeroDeContenedores;

	Logistica(byte Capacidad, String n) {
		this.Capacidad = Capacidad;
		NumeroDeContenedores = 0;
		this.Nombre = n;
	}

	public byte getNumeroDeContenedores() {
		return (byte) (Capacidad-NumeroDeContenedores);
	}

	public byte getCapacidad() {
		return (Capacidad);
	}

	public boolean HayHueco() {
		return (NumeroDeContenedores <Capacidad);
	}

	public boolean HayContenedor() {
		return (NumeroDeContenedores != Capacidad);
	}

	public void MeteContenedor() {
		NumeroDeContenedores++;
		System.out.println(this.toString());
	}

	public void SacaContenedor() {
		if (Capacidad!=0) {
			NumeroDeContenedores--;
			System.out.println(this.toString());
		} else {
			System.out.println("No se pueden sacar");
		}
		
	}

	@Override
	public String toString() {
		return "Logistica [Nombre=" + Nombre + ", Capacidad=" + Capacidad + ", NumeroDeContendores=" + NumeroDeContenedores + "]";
	}
}
