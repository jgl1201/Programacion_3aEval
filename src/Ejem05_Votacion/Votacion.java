package Ejem05_Votacion;

public class Votacion {

	private String Persona = null;
	private int Votos = 0;
	static private int VotosMasVotado = 0;
	static private String PersonaMasVotada = null;

	Votacion(String Persona) {
		this.Persona = Persona;
	}

	public void Voto() {
		Votos++;
		if (Votos > VotosMasVotado) {
			PersonaMasVotada = Persona;
			VotosMasVotado = Votos;
		}
	}

	public String NombrePersona() {
		return Persona;
	}

	public int Votos() {
		return Votos;
	}

	static public String NombreDelMasVotado() {
		return PersonaMasVotada;
	}

	static public int VotosDelMasVotado() {
		return VotosMasVotado;
	}
	
	@Override
	public String toString() {
		return "Votacion [Persona=" + Persona + ", Votos=" + Votos + "]";
	}
}
