package Herencia_Prop0_08;

import java.util.ArrayList;

public class Test {

	static ArrayList<Ciclista> equipo = new ArrayList<Ciclista>();

	public static void main(String[] args) {
		Equipo sky = new Equipo("Sky", "Estados Unidos");
		Velocista gt = new Velocista(123979, "Geraint Thomas", 320, 25, 365);
		Escalador eb = new Escalador(123980, "Egan Bernal", 25, 10, 385);
		Contrarrelojista jc = new Contrarrelojista(123981, "Jonathan Castroviejo", 120, 370);
		
		sky.anadirCiclista(gt);
		sky.anadirCiclista(eb);
		sky.anadirCiclista(jc);
		System.out.println(sky.toString());
		
		sky.calcularTotalTiempo();
		System.out.println(sky.toString());
		sky.listarEquipo();
	}
}
