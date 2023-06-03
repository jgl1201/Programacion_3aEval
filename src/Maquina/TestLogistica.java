package Maquina;

import java.util.Scanner;

public class TestLogistica {
//	4.3.3 Ejercicio de logística
//	En este ejemplo se plantea la siguiente situación: una empresa dispone de 3
//	almacenes de grandes contenedores. El primer almacén tiene una capacidad de 2
//	contenedores, el segundo de 4 y el tercero de 8. El primero se encuentra muy cerca
//	de una vía (carretera) principal, el segundo se encuentra a 10 kilómetros de la
//	carretera principal y el tercero a 20 kilómetros.
//	Los camioneros o bien llegan con un contenedor (uno solo por camión) o
//	bien llegan con el camión vacío con la intención de llevarse un contenedor. En
//	ã BOBADILLA CAPÍTULO 4: PROGRAMACIÓN ORIENTADA A OBJETOS USANDO CLASES 101
//	cualquier caso, siempre ha existido un vigilante al comienzo del camino que lleva a
//	los almacenes que le indicaba a cada camionero a que almacén debía dirigirse a
//	depositar el contenedor que traía o a recoger un contenedor, en caso de llegar sin
//	carga.
//	El vigilante, con muy buena lógica, siempre ha indicado a los camioneros el
//	almacén más cercano donde podían realizar la operación de carga o descarga,
//	evitando de esta manera largos trayectos de ida y vuelta a los almacenes más lejanos
//	cuando estos desplazamientos no eran necesarios.
//	Como el buen vigilante está a punto de jubilarse, nos encargan la realización
//	de un programa informático que, de forma automática, le indique a los camioneros el
//	almacén al que deben dirigirse minimizando los costes de combustible y tiempo. Los
//	camioneros, una vez que llegan a la barrera situada al comienzo del camino, pulsan
//	un botón (‘m’) si van a meter un contenedor, o un botón ‘s’ si lo van a sacar. El
//	programa les indicará en un panel el almacén (1, 2 ó 3) al que se deben dirigir.
//	Para resolver esta situación, utilizaremos dos clases: una a la que
//	llamaremos LogisticaAlmacen, que permitirá la creación de una estructura de datos
//	almacén y sus métodos de acceso necesarios. Posteriormente crearemos la clase
//	LogisticaControl1Contenedor que utilizando la primera implementa la lógica de
//	control expuesta en el enunciado del ejercicio.

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		Logistica Almacen1 = new Logistica((byte) 2, "cerca 1");
		Logistica Almacen2 = new Logistica((byte) 4, "cerca 2");
		Logistica Almacen3 = new Logistica((byte) 8, "cerca 3");
		String Accion;
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println(" m meter // s sacar // salir");

			Accion = sc.nextLine();
			if (Accion.equals("m")) {
				if (Almacen1.HayHueco()) {
					Almacen1.MeteContenedor();
				} else if (Almacen2.HayHueco()) {
					Almacen2.MeteContenedor();

				} else if (Almacen3.HayHueco()) {
					Almacen3.MeteContenedor();
				} else {
					System.out.println("no quedan huecos");
				}
			} else if (Accion.equals("s")) {
				if (Almacen1.HayContenedor()) {
					Almacen1.SacaContenedor();
				} else if (Almacen2.HayContenedor()) {
					Almacen2.SacaContenedor();
				} else if (Almacen3.HayContenedor()) {
					Almacen3.SacaContenedor();
				} else {
					System.out.println("no hay ningun contenedor el cual sacar");
				}

			}

		} while (!Accion.equals("salir"));

	}

}
