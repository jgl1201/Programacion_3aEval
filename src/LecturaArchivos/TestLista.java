package LecturaArchivos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class TestLista {
	
	@SuppressWarnings({ "unchecked" })
	public static void main(String[] args) throws Exception {
		ArrayList<Asignatura> arrayEscribir= new ArrayList<Asignatura>();
		ArrayList<Asignatura> arrayLeer;
		
		System.out.println("Asignaturas que vamos a escribir en el fichero: ");
		for (int i = 0; i < 5; i++) {
			Asignatura newObject = new Asignatura(i, "Asignatura " + i, 5*i);
			arrayEscribir.add(newObject);
			System.out.println("arrayEscribir[" + i + "] = " + arrayEscribir.get(i).toString());
		}
		
		try {
			System.out.println("Guardando el arrayList en el fichero objetos.dat...");
			
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(
					new FileOutputStream("objetos.dat"));
			escribiendoFichero.writeObject(arrayEscribir);
			escribiendoFichero.close();
			
			System.out.println("ESCRITO ok!");
			
			System.out.println("Leyendo ArrayList del fichero datos.dat...");
			
			ObjectInputStream leyendoFichero = new ObjectInputStream(
					new FileInputStream("objetos.dat"));
			arrayLeer = (ArrayList<Asignatura>) leyendoFichero.readObject();
			leyendoFichero.close();
			
			System.out.println("LEIDO ok!");
			
			System.out.println("Datos del fichero: ");
			
			for (int i = 0; i < arrayLeer.size(); i++)
				System.out.println("arrayLeer[" + i + "] = " + arrayLeer.get(i).toString());

		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
