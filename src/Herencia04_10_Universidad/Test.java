package Herencia04_10_Universidad;

import java.util.ArrayList;

public class Test {
	
	
	public static void main(String[] args) {
		ArrayList<Persona> gentes = new ArrayList<Persona>();
		
		Persona p = new Persona("Juanito", "Avenida de Maria Verdiales");
		Estudiante e = new Estudiante("Maria Antonieta", "Ronda de Outeiro", "ADE", 1);
		Profesor pr = new Profesor("Pepe", "Avenida de Hispanidad", "Informatica", "JAVA");
		
		gentes.add(p);
		gentes.add(e);
		gentes.add(pr);
		
		for (Persona pe : gentes) System.out.println(pe.toString());
	}

}
