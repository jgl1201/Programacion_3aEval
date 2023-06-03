package Personas;

public class TestPersona {

	public static void main(String[] args) {
		PersonaLista alumnos = new PersonaLista();
	
		alumnos.addPersona(new Persona("P", "P", "P", "P"));
		alumnos.addPersona(new Persona("S", "S", "S", "S"));
		alumnos.addPersona(new Persona("S", "S", "S", "S"));
		alumnos.addPersona(new Persona("S", "S", "S", "S"));
		alumnos.listar();
		alumnos.eliminarPersona(1);
		alumnos.listar();
		alumnos.borrarLista();
	}

}
