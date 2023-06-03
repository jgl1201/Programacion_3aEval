package Ventanas_84;

import java.util.ArrayList;

public class ListaEmpleados {

	public ArrayList<Empleado> lista;

	public double totalNomina = 0;
	
	public ListaEmpleados() {
		lista = new ArrayList<Empleado>();
	}

	public void agregarEmpleado(Empleado a) {
		lista.add(a);
	}

	public double calcularTotalNomina() {
		for (int i = 0; i < lista.size(); i++) { 
			Empleado e = (Empleado) lista.get(i);
			totalNomina = totalNomina + e.calcularNomina();
		}
		return totalNomina;
	}

	public String[][] obtenerMatriz() {
		String datos[][] = new String[lista.size()][3];
		for (int i = 0; i < lista.size(); i++) {
			Empleado e = (Empleado) lista.get(i);
			datos[i][0] = e.getNombre();
			datos[i][1] = e.getApellidos();
			datos[i][2] = Double.toString(e.calcularNomina());
			totalNomina = totalNomina + e.calcularNomina();
		}
		return datos;
	}

	public String convertirTexto() {
		String texto = "";
		for (int i = 0; i < lista.size(); i++) { 
			Empleado e = (Empleado) lista.get(i);
			texto = texto + "Nombre = " + e.getNombre() + "\n" + "Apellidos = " + e.getApellidos() + "\n" + "Cargo = "
					+ e.getCargo() + "\n" + "Genero = " + e.getGenero() + "\n" + "Salario = $" + e.getSalarioDia()
					+ "\n" + "Dias trabajados = " + e.getDiasTrabajados() + "\n" + "Otros ingresos = $"
					+ e.getOtrosIngresos() + "\n" + "Pagos saludo = $" + e.getPagosSalud() + "\n"
					+ "Aportes pensiones = $" + e.getAportePensiones() + "\n---------\n";
		}
		texto = texto + "Total nómina = $" + String.format("%.2f", calcularTotalNomina());
		return texto;
	}

}