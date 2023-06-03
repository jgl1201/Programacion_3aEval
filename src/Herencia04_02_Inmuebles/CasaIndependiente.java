package Herencia04_02_Inmuebles;

public class CasaIndependiente extends CasaUrbana {

	protected final double VALOR_AREA = 3000000;

	public CasaIndependiente(int id, int area, String direccion, int numeroHabitaciones, int numeroBannos,
			int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos, numeroPisos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "CasaIndependiente [VALOR_AREA=" + VALOR_AREA + ", numeroPisos=" + numeroPisos + ", numeroHabitaciones="
				+ numeroHabitaciones + ", numeroBannos=" + numeroBannos + ", id=" + id + ", area=" + area
				+ ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return VALOR_AREA * area;
	}

}
