package Herencia04_02_Inmuebles;

public class ApartamentoFamiliar extends Apartamento {

	protected final double VALOR_AREA = 2000000;
	protected int valorAdministracion;

	public ApartamentoFamiliar(int id, int area, String direccion, int numeroHabitaciones,
			int numeroBannos, int valorAdministracion) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos);
		this.valorAdministracion = valorAdministracion;
	}

	@Override
	public String toString() {
		return "ApartamentoFamiliar [VALOR_AREA=" + VALOR_AREA + ", valorAdministracion=" + valorAdministracion
				+ ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos=" + numeroBannos + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return VALOR_AREA * area;
	}

}
