package Herencia04_02_Inmuebles;

abstract public class CasaUrbana extends Casa {

	public CasaUrbana(int id, int area, String direccion, int numeroHabitaciones, int numeroBannos, int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos, numeroPisos);
	}

	@Override
	public String toString() {
		return "CasaUrbana [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBannos=" + numeroBannos + ", id=" + id + ", area=" + area + ", direccion=" + direccion
				+ ", precioVenta=" + precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();
}
