package Herencia04_12_Animales;

import java.util.ArrayList;

public class Test {
	
	static ArrayList<Animal> bichos = new ArrayList<Animal>();
	
	public static void main(String[] args) {
	//	Animal a = new Animal("No", "No se", "Depende", "Quien pregunta");
	//	Canido c = new Canido("GRRR", "Carne", "Montanas", "Canido");
	//	Felino f = new Felino("MMMM", "Carne", "Selvas", "Felino");
		Perro p = new Perro("GUAU", "Pienso", "Casa", "Canis canis");
		Lobo l = new Lobo("AUUUUU", "Conellos", "Bosque", "Lupus Canis");
		Gato g = new Gato("MIAAAA", "Pienso", "Casa", "Felis felis");
		Leon le = new Leon("GRRRRRRR", "Lo que cace", "Sabana", "Leon felis");
		
		bichos.add(le);
		bichos.add(g);
		bichos.add(l);
		bichos.add(p);
		
		for (Animal ani : bichos) System.out.println(ani.toString());
	}

}
