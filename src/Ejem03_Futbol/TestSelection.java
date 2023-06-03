package Ejem03_Futbol;

import java.util.ArrayList;

public class TestSelection {
	
	public static ArrayList<Selection> club = new ArrayList<Selection>();

	public static void main(String[] args) {
		Trainer delBosque = new Trainer(1, "Vicente", "del Bosque", 60, "284EZ89");
		Player iniesta = new Player(2, "Andres", "Iniesta", 29, 6, "Interior Derecho");
		Massager raulMartinez = new Massager(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);
		
		club.add(delBosque);
		club.add(iniesta);
		club.add(raulMartinez);
		
		for (Selection person : club) {
			System.out.print(person.toString() + " --> ");
			person.concentrate();
		}
		
		System.out.println("-------------------------------------------------------");
		
		for (Selection person : club) {
			System.out.print(person.toString() + " --> ");
			person.travel();
		}
		
		System.out.println("\nENTRENAMIENTO: Solo entrenador y futbolista tienen metodos para entrenar");
		System.out.print(delBosque.toString() + " --> ");
		delBosque.directTraining();
		System.out.print(iniesta.toString() + " --> ");
		iniesta.train();
		
		System.out.println("\nMASAJE: Solo el masajista tiene metodos para dar masajes");
		System.out.print(raulMartinez.toString() + " --> ");
		raulMartinez.giveMassage();
		
		System.out.println("\nPARTIDO: Solo entrenador y futbolista estan en el partido");
		System.out.print(delBosque.toString() + " --> ");
		delBosque.directMatch();
		System.out.print(iniesta.toString() + " --> ");
		iniesta.playMatch();
	}
	
}
