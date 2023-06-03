package Ejem04_Logistica;

public class Almacen {

	private String Name;
	private byte Capacity;
	private byte NumeroDeHuecos;
	private byte NumeroDeContenedores;

	Almacen(byte Capacidad, String n) {
		this.Capacity = Capacidad;
		NumeroDeHuecos = Capacidad;
		NumeroDeContenedores = 0;
		this.Name = n;
	}

	public byte getNumeroDeHuecos() {
		return (NumeroDeHuecos);
	}
	
	public byte getNumeroDeContenedores() {
		return (NumeroDeContenedores);
	}

	public byte getCapacidad() {
		return (Capacity);
	}

	public boolean HayHueco() {
		return (NumeroDeHuecos != 0);
	}

	public boolean HayContenedor() {
		return (NumeroDeContenedores != 0);
	}

	public void MeteContenedor() {
		System.out.println(this.toString());
		NumeroDeHuecos--;
		NumeroDeContenedores++;
	}

	public void SacaContenedor() {
		System.out.println(this.toString());
		NumeroDeHuecos++;
		NumeroDeContenedores--;
	}

	@Override
	public String toString() {
		return "Almacen [Nombre=" + Name + ", Capacidad=" + Capacity + ", NumeroDeHuecos=" + NumeroDeHuecos + ", NumeroDeContenedores=" + NumeroDeContenedores + "]";
	}

}
