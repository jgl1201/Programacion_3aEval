package Ejem03_Futbol;

import java.util.ArrayList;

public class Test03 {
	
	public static ArrayList<Selection> club = new ArrayList<Selection>();


	public static void main(String[] args) {
		Trainer cholo = new Trainer(1, "Diego", "Simeonme", 52, "XTR0016");
		Player koke = new Player(2, "Koke", "Resurreccion", 32, 6, "MCD");
		Massager raulMartinez = new Massager(3, "Raul", "Martinez", 41, "Licenciado en Fisioterapia", 18);

		club.add(cholo);
		club.add(koke);
		club.add(raulMartinez);
		
		for (Selection person : club) System.out.println(person.toString());
		
		for (Selection person : club) {
			if (person instanceof Trainer) {
				((Trainer) person).directMatch();
				((Trainer) person).directTraining();
			}
			if (person instanceof Player) {
				((Player) person).playMatch();
				((Player) person).train();
			}
			if (person instanceof Massager) {
				((Massager) person).giveMassage();
			}
		}
	}
	
}
