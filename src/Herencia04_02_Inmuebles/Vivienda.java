package Herencia04_02_Inmuebles;

abstract public class Vivienda extends Inmueble{
	
	protected int numeroHabitaciones;
	protected int numeroBannos;

	
	
	public Vivienda(int id, int area, String direccion,
			int numeroHabitaciones, int numeroBannos) {
		super(id, area, direccion);
		this.numeroHabitaciones = numeroHabitaciones;
		this.numeroBannos = numeroBannos;
	}

	@Override
	public String toString() {
		return "Vivienda [numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos=" + numeroBannos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();
	
	
}
