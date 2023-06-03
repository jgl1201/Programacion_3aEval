package Herencia04_02_Inmuebles;

public class ApartaEstudio extends Apartamento {

	protected final double VALOR_AREA = 1500000;

	public ApartaEstudio(int id, int area, String direccion, int numeroHabitaciones, int numeroBannos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos);
	}

	@Override
	public String toString() {
		return "ApartaEstudio [VALOR_AREA=" + VALOR_AREA + ", numeroHabitaciones=" + numeroHabitaciones
				+ ", numeroBannos=" + numeroBannos + ", id=" + id + ", area=" + area + ", direccion=" + direccion
				+ ", precioVenta=" + precioVenta + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return VALOR_AREA * area;
	}

}
