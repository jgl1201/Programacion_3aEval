package Herencia04_11_Animales;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Mascota> animales = new ArrayList<Mascota>();
		PerroGrande pg = new PerroGrande("Can", 2, "Negro", 80.7, false, PerroGrande.razas.ROTWEILLER);
		PerroMed pm = new PerroMed("Fido", 12, "Blanco", 30.56, true, PerroMed.razas.SABUESO);
		PerroPeque pp = new PerroPeque("Fufo", 6, "Marron", 5.2, true, PerroPeque.razas.CHIHUAHUA);
		GatoCalvo gCal = new GatoCalvo("Kitty", 16, "Gris", 1.5, 1.2, GatoCalvo.razas.DONSKOY);
		GatoPeloC gpc = new GatoPeloC("Rayo", 1, "Naranja", 5.2, 6.0, GatoPeloC.razas.DEVON_REX);
		GatoPeloL gpl = new GatoPeloL("Minber", 5, "Blanco", 4.2, 1.9, GatoPeloL.razas.HIMALAYO);
		Perro p = new Perro("Puto", 12, "Negro", 35.2, true);
		Gato g = new Gato("Pelucho", 5, "Blanco", 2.3, 3.2);
		Mascota ma = new Mascota("Loro", 4, "Muchos") {
			@Override
			public String sonido() {
				return null;
			}
		};
		
		animales.add(pg);
		animales.add(pm);
		animales.add(pp);
		animales.add(gCal);
		animales.add(gpc);
		animales.add(gpl);
		animales.add(p);
		animales.add(g);
		animales.add(ma);
		
		for (Mascota m : animales) {
			System.out.println(m.toString());
			if (m instanceof Perro || m instanceof Gato) System.out.println(m.sonido());
		}
	}

}
