package Herencia_Bicis_Comparator;

import java.util.ArrayList;

public class Test {

	static ArrayList<Ciclista> equipo = new ArrayList<Ciclista>();

	public static void main(String[] args) {
		Equipo sky = new Equipo("Sky", "Estados Unidos");
		Velocista gt = new Velocista(123979, "Geraint Thomas", 320, 25);
		Escalador eb = new Escalador(123980, "Egan Bernal", 25, 10);
		Contrarrelojista jc = new Contrarrelojista(123981, "Jonathan Castroviejo", 120);
		
		Equipo mov = new Equipo("Movistar", "Espanha");
		Velocista v = new Velocista(125979, "Pepe Luis", 320, 25);
		Escalador e = new Escalador(125980, "Alba Cete", 25, 10);
		Contrarrelojista c = new Contrarrelojista(125981, "Johny Melabo", 120);
		
		sky.anadirCiclista(gt);
		sky.anadirCiclista(eb);
		sky.anadirCiclista(jc);
		System.out.println(sky.toString());
		
		mov.anadirCiclista(v);
		mov.anadirCiclista(e);
		mov.anadirCiclista(c);
		System.out.println(mov.toString());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");
		
		gt.setTiempoAcumulado(365);
		eb.setTiempoAcumulado(300);
		jc.setTiempoAcumulado(250);
		
		v.setTiempoAcumulado(330);
		e.setTiempoAcumulado(290);
		c.setTiempoAcumulado(280);
		
		System.out.println(sky.calcularTotalTiempo());
		System.out.println(mov.calcularTotalTiempo());
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");

		System.out.println(sky.toString());
		sky.listarEquipo();
		System.out.println(mov.toString());
		mov.listarEquipo();
		
		System.out.println("----------------------------------------------------------------");
		System.out.println("----------------------------------------------------------------");
		
		sky.sort();
		mov.sort();
		sky.asignarPosiciones();
		mov.asignarPosiciones();
		sky.listarEquipo();
		mov.listarEquipo();
	}
}
