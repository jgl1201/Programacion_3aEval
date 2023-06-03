package Herencia_Prop0_08;

public class Escalador extends Ciclista {
	
	private double aceleracionPromedio;
	private double gradoRampa;
	
	public Escalador(int identificador, String nombre, double aceleracionPromedio, double gradoRampa, double tiempoAcumulado) {
		super(identificador, nombre, tiempoAcumulado);
		this.aceleracionPromedio = aceleracionPromedio;
		this.gradoRampa = gradoRampa;
	}
	
	public double getAceleracionPromedio() {
		return aceleracionPromedio;
	}
	public void setAceleracionPromedio(double aceleracionPromedio) {
		this.aceleracionPromedio = aceleracionPromedio;
	}
	public double getGradoRampa() {
		return gradoRampa;
	}
	public void setGradoRampa(double gracoRampa) {
		this.gradoRampa = gracoRampa;
	}	

	@Override
	public String toString() {
		return super.toString() + "Escalador [aceleracionPromedio=" + getAceleracionPromedio() + ", gracoRampa=" + getGradoRampa() + "]";
	}

	@Override
	public String imprimirTipo() {
		return "Escalador";
	}
}
