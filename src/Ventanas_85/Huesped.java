package Ventanas_85;

import java.util.Date;

@SuppressWarnings("unused")
public class Huesped {

	private String nombres; /* Atributo que identifica los nombres del huésped */
	private String apellidos; /* Atributo que identifica los apellidos del huésped */
	/* Atributo que identifica el número de documento de identidad del huésped */
	private int documentoIdentidad;
	private Date fechaIngreso; /* Atributo que identifica la fecha de ingreso del huésped */
	private Date fechaSalida; /* Atributo que identifica la fecha de salida del huésped */

	public Huesped(String nombres, String apellidos, int documentoIdentidad) {
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.documentoIdentidad = documentoIdentidad;
	}

	public void setFechaSalida(Date fecha) {
		fechaSalida = fecha;
	}

	public void setFechaIngreso(Date fecha) {
		fechaIngreso = fecha;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public int obtenerDiasAlojamiento() {
		/*
		 * Resta la fecha de ingreso de la fecha de salida utilizando el método getTime
		 */
		int dias = (int) ((fechaSalida.getTime() - fechaIngreso.getTime()) / 86400000);
		return dias;
	}
}