package Ventanas_84;

public class Empleado {
	
	private String nombre; /* Atributo que identifica el nombre de un empleado */
	private String apellidos; /* Atributo que identifica los apellidos de un empleado */
	private double salarioDia; /* Atributo que identifica el salario diario de un empleado */
	private double otrosIngresos; /* Atributo que identifica otros ingresos de un empleado */
	private double pagosSalud; /* Atributo que identifica los pagos por salud de un empleado */
	// Atributo que identifica el aporte de pensiones de un empleado
	private double aportePensiones;
	/* Atributo que identifica la cantidad de días trabajados por un empleado */
	private int diasTrabajados;
	private TipoCargo cargo; /* Atributo que identifica el cargo de un empleado */
	private TipoGenero genero; /* Atributo que identifica el gérero de un empleado */

	public Empleado(String nombre, String apellidos, TipoCargo cargo, TipoGenero genero, double salarioDia,
			int diasTrabajados, double otrosIngresos, double pagosSalud, double aportePensiones) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.cargo = cargo;
		this.genero = genero;
		this.salarioDia = salarioDia;
		this.diasTrabajados = diasTrabajados;
		this.otrosIngresos = otrosIngresos;
		this.pagosSalud = pagosSalud;
		this.aportePensiones = aportePensiones;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public TipoCargo getCargo() {
		return cargo;
	}

	public TipoGenero getGenero() {
		return genero;
	}

	public double getSalarioDia() {
		return salarioDia;
	}

	public int getDiasTrabajados() {
		return diasTrabajados;
	}
	public double getOtrosIngresos() {
		return otrosIngresos;
	}

	public double getPagosSalud() {
		return pagosSalud;
	}

	public double getAportePensiones() {
		return aportePensiones;
	}

	/**
	 * Método que calcula el salario mensual de un empleado
	 * 
	 * @return Salario mensual de un empleado
	 */
	public double calcularNomina() {
		return ((salarioDia * diasTrabajados) + otrosIngresos - pagosSalud - aportePensiones);
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", apellidos=" + apellidos + ", salarioDia=" + salarioDia
				+ ", otrosIngresos=" + otrosIngresos + ", pagosSalud=" + pagosSalud + ", aportePensiones="
				+ aportePensiones + ", diasTrabajados=" + diasTrabajados + ", cargo=" + cargo + ", genero=" + genero
				+ "]";
	}

}