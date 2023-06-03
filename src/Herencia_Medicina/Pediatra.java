package Herencia_Medicina;

public class Pediatra extends Medico {
	
	public enum Tipologia {NEUROLOGO, PSICOLOGO};
	private Tipologia tipo;
	
	public Pediatra(String nombre, Tipologia tipo) {
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
		return "Pediatra [tipo=" + tipo + ", nombre=" + nombre + "]";
	}

}
