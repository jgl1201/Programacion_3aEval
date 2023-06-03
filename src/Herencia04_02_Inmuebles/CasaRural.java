package Herencia04_02_Inmuebles;

public class CasaRural extends Casa {

	protected final double VALOR_AREA = 1500000;
	protected double distanciaCabera;
	protected double altitud;

	public CasaRural(int id, int area, String direccion, int numeroHabitaciones, int numeroBannos,
			int numeroPisos, double distanciaCabrera, double altitud) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos, numeroPisos);
		this.distanciaCabera = distanciaCabrera;
		this.altitud = altitud;
	}

	@Override
	public String toString() {
		return "CasaRural [VALOR_AREA=" + VALOR_AREA + ", numeroPisos=" + numeroPisos + ", numeroHabitaciones="
				+ numeroHabitaciones + ", numeroBannos=" + numeroBannos + ", id=" + id + ", area=" + area
				+ ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return VALOR_AREA * area;
	}

}
