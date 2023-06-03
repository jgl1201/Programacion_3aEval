package Ejem04_Logistica;

/* Una empresa dispone de 3 almacenes de grandes contenedores.
 * El primer almacén tiene una capacidad de 2contenedores, el segundo de 4 y el tercero de 8.
 * El primero se encuentra muy cerca, el segundo a 10 kilómetros y el tercero a 20.
 * Los camioneros o bien llegan con un contenedor (uno solo por camión) o bien llegan con
 * el camión vacío con la intención de llevarse un contenedor.
 * El vigilante, con muy buena lógica, siempre ha indicado a los camioneros el almacén más
 * cercano donde podían realizar la operación de carga o descarga, evitando largos trayectos.
 * Realizar un programa que indique a los camioneros el almacén al que dirigirse minimizando
 * los costes de combustible y tiempo. Los camioneros pulsan un botón (‘m’) si van a meter un contenedor,
 * o un botón ‘s’ si lo van a sacar. El programa les indicará el almacén (1, 2 o 3) al que se deben dirigir.
 * Utilizaremos dos clases: una que permitirá la creación de una estructura de datos almacén y sus métodos de
 * acceso necesarios. Posteriormente crearemos la clase que utilizando la primera implementa la lógica de
 * control expuesta en el enunciado del ejercicio. */

import java.util.Scanner;

public class Test {
	
	public static void main(String[] args) {
		Almacen a1 = new Almacen((byte) 2, "cerca 1");
		Almacen a2 = new Almacen((byte) 4, "media 2");
		Almacen a3 = new Almacen((byte) 8, "lejos 3");
		
		String action;
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("M meter || S sacar || SALIR");
			action = sc.nextLine();
			
			if (action.equalsIgnoreCase("m")) {
				if (a1.HayHueco()) a1.MeteContenedor();
				else if (a2.HayHueco()) a2.MeteContenedor();
				else if (a3.HayHueco()) a3.MeteContenedor();
				else System.out.println("No hay huecos libres, espere");
			}
			else if (action.equalsIgnoreCase("s")) {
				if (a1.HayContenedor()) a1.SacaContenedor();
				else if (a2.HayContenedor()) a2.SacaContenedor();
				else if (a3.HayContenedor()) a3.SacaContenedor();
				else System.out.println("No hay contenedores todavia");
			}
			else if (action.equalsIgnoreCase("salir")) System.out.println("Saliendo");
			else System.out.println("Opcion no valida");
			
		} while (! action.equalsIgnoreCase("salir"));
		
		
		sc.close();
	}

}
