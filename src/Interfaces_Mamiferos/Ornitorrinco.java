package Interfaces_Mamiferos;

public class Ornitorrinco extends Mamifero implements PoneHuevos{

	public void amamantarCrias() {
		System.out.println("Dando de mamar a los ornitorrincos");
	}

	@Override
	public void ponerHuevos() {
		System.out.println("Poniendo huevos");
	}

}
