package Ventanas_83;

public class FiguraGeometrica {
	private double volumen;
	private double superficie;
	
	public FiguraGeometrica() {}

	public double getVolumen() {
		return volumen;
	}

	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}

	public double getSuperficie() {
		return superficie;
	}

	public void setSuperficie(double superficie) {
		this.superficie = superficie;
	}

	@Override
	public String toString() {
		return "FiguraGeometrica [volumen=" + volumen + ", superficie=" + superficie + "]";
	}

}
