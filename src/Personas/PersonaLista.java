package Personas;

import java.io.Serializable;
import java.util.ArrayList;

@SuppressWarnings("serial")
public class PersonaLista implements Serializable {
	ArrayList<Persona> listaPersonas;

	public PersonaLista(ArrayList<Persona> listaPersonas) {
		super();
		this.listaPersonas = listaPersonas;
	}

	public PersonaLista() {
		listaPersonas = new ArrayList<Persona>();
	}

	public void addPersona(Persona p) {
		listaPersonas.add(p);
	}

	public void eliminarPersona(int id) {
		listaPersonas.remove(id);
	}

	public void borrarLista() {
		listaPersonas.removeAll(listaPersonas);
	}

	public void listar() {
		for (int i = 0; i < listaPersonas.size(); i++)
			System.out.println("Posicion: " + i + " = " + listaPersonas.get(i).toString());
	}
}
