package Herencia04_02_Inmuebles;

abstract public class Apartamento extends Vivienda {

	public Apartamento(int id, int area, String direccion,
			int numeroHabitaciones, int numeroBannos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Apartamento [numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos=" + numeroBannos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();

}
