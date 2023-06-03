package Maquina;

public class PruebaVotacion {
	public static void main(String[] args) {

		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

		// Tenemos tres candidatos en esta votacion
		Votacion Juan = new Votacion("Juan Peire");
		Votacion Ana = new Votacion("Ana Garcia");
		Votacion Adela = new Votacion("Adela Sancho");

		// empieza la votacion
		Juan.Voto();
		Ana.Voto();
		Ana.Voto();
		Ana.Voto();
		Adela.Voto();
		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

		Juan.Voto();
		Juan.Voto();
		Juan.Voto();
		Adela.Voto();
		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

		Adela.Voto();
		Adela.Voto();
		Ana.Voto();
		Ana.Voto();
		System.out.println(Votacion.NombreDelMasVotado() + ": " + Votacion.VotosDelMasVotado());

		System.out.println(Juan.NombrePersona() + ": " + Juan.Votos());
		System.out.println(Ana.NombrePersona() + ": " + Ana.Votos());
		System.out.println(Adela.NombrePersona() + ": " + Adela.Votos());

	}

}
