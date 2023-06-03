package Herencia04_02_Inmuebles;

abstract public class Casa extends Vivienda{
	
	protected int numeroPisos;
	
	

	public Casa(int id, int area, String direccion, int numeroHabitaciones, int numeroBannos,
			int numeroPisos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos);
		this.numeroPisos = numeroPisos;
	}

	@Override
	public String toString() {
		return "Casa [numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos="
				+ numeroBannos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + ", precioVenta="
				+ precioVenta + "]";
	}

	@Override
	abstract public double calculaPrecioVenta();
	
	

}
