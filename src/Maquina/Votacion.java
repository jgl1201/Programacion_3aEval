package Maquina;

public class Votacion {
	// Persona a la que se vota en esta instancia y el numero
	// de votos que lleva
	private String Persona = null;
	private int Votos = 0;

	// Persona mas votada de todas las instancias y el numero

	// de votos que lleva
	static private int VotosMasVotado = 0;
	static private String PersonaMasVotada = null;

	// Constructor
	Votacion(String Persona) {
		this.Persona = Persona;
	}

	// Se invoca cada vez que alguien vota a Persona
	public void Voto() {
		Votos++;
		if (Votos > VotosMasVotado) {
			PersonaMasVotada = Persona;
			VotosMasVotado = Votos;
		}
	}

	// Devuelve el nombre de Persona
	public String NombrePersona() {
		return Persona;
	}

	// Devuelve el numero de votos de Persona
	public int Votos() {
		return Votos;
	}

	// Devuelve el nombre de la persona mas votada
	public static String NombreDelMasVotado() {
		return PersonaMasVotada;
	}

	// Devuelve el numero de votos de la persona mas votada
	public static int VotosDelMasVotado() {
		return VotosMasVotado;
	}

}
