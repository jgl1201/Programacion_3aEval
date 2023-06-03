package Herencia01_Publicacion;

public class Test {

	public static void main(String[] args) {
		Libro MiLibro = new Libro(575, 15.2f, "El manifiesto Negro", "Dura", "",
				"Frederick Forsyth", "Circulo de Lectores");
		System.out.println(MiLibro.toString());
		
		Periodico TuPeriodico = new Periodico(64, 1.5f, "Fora de Vigo", "14/04/2023");
		System.out.println(TuPeriodico.toString());
		
	}

}
