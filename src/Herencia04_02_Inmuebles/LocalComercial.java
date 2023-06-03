package Herencia04_02_Inmuebles;

public class LocalComercial extends Local {

	protected final double VALOR_AREA = 3000000;
	protected String centroComercial;
	

	public LocalComercial(int id, int area, String direccion, String centroComercial) {
		super(id, area, direccion);
		this.centroComercial = centroComercial;
	}

	@Override
	public String toString() {
		return "LocalComercial [valorArea=" + VALOR_AREA + ", centroComercial=" + centroComercial + ", id=" + id
				+ ", area=" + area + ", direccion=" + direccion + ", precioVenta=" + precioVenta + "]";
	}

	@Override
	public double calculaPrecioVenta() {
		return VALOR_AREA * area;
	}

}
