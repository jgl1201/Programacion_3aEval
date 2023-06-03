package LecturaArchivos;

import java.io.FileWriter;
import java.io.PrintWriter;

public class EscribirArchivo {

	public static void main(String[] args) throws Exception{
		FileWriter archivo = null;
		PrintWriter impresor = null;
		
		try {
			archivo = new FileWriter("C:\\Users\\Primero DAM\\eclipse-workspace\\Eval3_Prog_POO\\src\\prueba2.txt");
			impresor = new PrintWriter(archivo);
			for (int i = 0; i < 10; i++) impresor.println("Ronda " + i);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (archivo != null) archivo.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

}
