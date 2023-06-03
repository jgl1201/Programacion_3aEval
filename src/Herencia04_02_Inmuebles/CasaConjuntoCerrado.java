package Herencia04_02_Inmuebles;

public class CasaConjuntoCerrado extends CasaUrbana {

	protected final double VALOR_AREA = 2500000;
	protected double valorAdministracion;
	protected boolean tienePiscina;
	protected boolean tieneCamposDeportivos;

	public CasaConjuntoCerrado(int id, int area, String direccion, int numeroHabitaciones, int numeroBannos,
			int numeroPisos, double valorAdministracion, boolean tienePiscina, boolean tieneCamposDeportivos) {
		super(id, area, direccion, numeroHabitaciones, numeroBannos, numeroPisos);
		this.valorAdministracion = valorAdministracion;
		this.tienePiscina = tienePiscina;
		this.tieneCamposDeportivos = tieneCamposDeportivos;
	}

	@Override
	public String toString() {
		return "CasaConjuntoCerrado [VALOR_AREA=" + VALOR_AREA + ", valorAdministracion=" + valorAdministracion
				+ ", tienePiscina=" + tienePiscina + ", tieneCamposDeportivos=" + tieneCamposDeportivos
				+ ", numeroPisos=" + numeroPisos + ", numeroHabitaciones=" + numeroHabitaciones + ", numeroBannos="
				+ numeroBannos + ", id=" + id + ", area=" + area + ", direccion=" + direccion + ", precioVenta="
				+ precioVenta + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return VALOR_AREA * area;
	}

}
