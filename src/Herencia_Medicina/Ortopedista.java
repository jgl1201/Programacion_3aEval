package Herencia_Medicina;

public class Ortopedista extends Medico {
	
	public enum Tipologia {MAXILOFACIAL, PEDIATRA};
	private Tipologia tipo;
	
	public Ortopedista(String nombre, Tipologia tipo) {
		super(nombre);
		this.tipo = tipo;
	}

	public Tipologia getTipo() {
		return tipo;
	}

	public void setTipo(Tipologia tipo) {
		this.tipo = tipo;
	}

	@Override
	public String toString() {
		return "Ortopedista [tipo=" + tipo + ", nombre=" + nombre + "]";
	}

}
