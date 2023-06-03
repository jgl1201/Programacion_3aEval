package LecturaArchivos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

@SuppressWarnings("serial")
public class Asignatura implements Serializable {
	int codigo;
	String nombre;
	int creditos;
	
	Asignatura(int codigo, String nombre, int creditos) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditos = creditos;
	}
	
	void imprimir() {
		System.out.println("Codigo de la asignatura: " + codigo);
		System.out.println("Nombre de la asignatura: " + nombre);
		System.out.println("Creditos de la asignatura: " + creditos);
	}
	
	void escribirAsignatura() throws Exception {
		try {
			FileOutputStream archivo = new FileOutputStream("Asignatura.dat");
			ObjectOutputStream salida = new ObjectOutputStream(archivo);
			salida.writeObject(this);
			salida.close();
		} catch (IOException e) {
			System.out.println("No se pudo escribir el archivo");
		}
	}
	
	void leerAsignatura() throws Exception {
		try {
			FileInputStream archivo = new FileInputStream("Asignatura.dat");
			ObjectInputStream entrada = new ObjectInputStream(archivo);
			Asignatura asignatura = (Asignatura) entrada.readObject();
			asignatura.imprimir();
			entrada.close();
		} catch (FileNotFoundException f) {
			System.out.println("No se pudo leer el archivo");
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
		} catch (Exception e) {
			System.out.println("Error al leer el archivo");
		}
	}
	
	public static void main(String[] args) throws Exception {
		Asignatura a = new Asignatura(4100547, "Programacion orientada a objetos", 4);
		a.escribirAsignatura();
		a.leerAsignatura();
	}

	@Override
	public String toString() {
		return "Asignatura [codigo=" + codigo + ", nombre=" + nombre + ", creditos=" + creditos + "]";
	}

}
