package Herencia_Medicina;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Medico> m = new ArrayList<Medico>();
		
		Medico med = new Medico("Pepe");
		m.add(med);
		
		Ortopedista o = new Ortopedista("Jose", Ortopedista.Tipologia.MAXILOFACIAL);
		m.add(o);
		
		Pediatra p = new Pediatra("Maria", Pediatra.Tipologia.NEUROLOGO);
		m.add(p);
		
		for (Medico me : m) me.toString();
	}

}
