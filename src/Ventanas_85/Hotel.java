package Ventanas_85;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Hotel {
	// Atributo que establece el conjunto de habitaciones del hotel
	public static ArrayList<Habitacion> listaHabitaciones;

	public Hotel() {
		listaHabitaciones = new ArrayList<Habitacion>(); /* Crea el vector de habitaciones */
		/*
		 * Crea cada Habitacion con un número de Habitacion, disponibilidad inicial y
		 * precio por día
		 */
		Habitacion Habitacion1 = new Habitacion(1, true, 120);
		Habitacion Habitacion2 = new Habitacion(2, true, 120);
		Habitacion Habitacion3 = new Habitacion(3, true, 120);
		Habitacion Habitacion4 = new Habitacion(4, true, 120);
		Habitacion Habitacion5 = new Habitacion(5, true, 120);
		Habitacion Habitacion6 = new Habitacion(6, true, 160);
		Habitacion Habitacion7 = new Habitacion(7, true, 160);
		Habitacion Habitacion8 = new Habitacion(8, true, 160);
		Habitacion Habitacion9 = new Habitacion(9, true, 160);
		Habitacion Habitacion10 = new Habitacion(10, true, 160);
		// Se agrega cada Habitacion al vector de habitaciones del hotel
		listaHabitaciones.add(Habitacion1);
		listaHabitaciones.add(Habitacion2);
		listaHabitaciones.add(Habitacion3);
		listaHabitaciones.add(Habitacion4);
		listaHabitaciones.add(Habitacion5);
		listaHabitaciones.add(Habitacion6);
		listaHabitaciones.add(Habitacion7);
		listaHabitaciones.add(Habitacion8);
		listaHabitaciones.add(Habitacion9);
		listaHabitaciones.add(Habitacion10);
	}

	public String buscarFechaIngresoHabitacion(int numero) {
		for (int i = 0; i < listaHabitaciones.size(); i++) { /* Recorre el vector de habitaciones */
			// Obtiene un elemento del vector
			Habitacion Habitacion = (Habitacion) listaHabitaciones.get(i);
			if (Habitacion.getNumeroHabitacion() == numero) { /* Si el número buscado es encontrado */
				// Se obtiene la fecha de ingreso
				Date fecha = Habitacion.getHuesped().getFechaIngreso();

				// Se le da formato a la fecha de ingreso
				DateFormat formatoFecha = new SimpleDateFormat("yyyy/MM/dd");
				return formatoFecha.format(fecha); /* Devuelve la fecha de ingreso */
			}
		}
		return ""; // En caso de no encontrar la Habitacion
	}

	public boolean buscarHabitacionOcupada(int numero) {
		for (int i = 0; i < listaHabitaciones.size(); i++) {
			// Obtiene un elemento del vector
			Habitacion Habitacion = (Habitacion) listaHabitaciones.get(i);
			if (Habitacion.getNumeroHabitacion() == numero && !Habitacion.getDisponible()) {
				// Si la Habitacion está disponible
				return true;
			}
		}
		return false; // Si la Habitacion no está disponible
	}
}