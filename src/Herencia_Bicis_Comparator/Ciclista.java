package Herencia_Bicis_Comparator;

abstract public class Ciclista {
	
	private int identificador;
	private String nombre;
	private int tiempoAcumulado = 0;
	private int posicionGeneral = 0;
	
	public Ciclista(int identificador, String nombre) {
		super();
		this.identificador = identificador;
		this.nombre = nombre;
	}

	public int getIdentificador() {
		return identificador;
	}
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTiempoAcumulado() {
		return tiempoAcumulado;
	}
	public void setTiempoAcumulado(int tiempoAcumulado) {
		this.tiempoAcumulado = tiempoAcumulado;
	}
	public int getPosicionGeneral() {
		return posicionGeneral;
	}
	public void setPosicionGeneral(int posicionGeneral) {
		this.posicionGeneral = posicionGeneral;
	}

	@Override
	public String toString() {
		return "Ciclista [identificador=" + getIdentificador() + ", nombre=" + getNombre() + ", tiempoAcumulado="
				+ getTiempoAcumulado() + ", posicionGeneral=" + getPosicionGeneral() +  "]";
	}
	
	abstract public String imprimirTipo();

}
