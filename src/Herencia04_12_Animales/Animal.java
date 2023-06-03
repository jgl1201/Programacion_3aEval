package Herencia04_12_Animales;

abstract public class Animal {
	
	protected String sonido;
	protected String alimentos;
	protected String habitat;
	protected String nombreCientifico;
	
	public Animal(String sonido, String alimentos, String habitat, String nombreCientifico) {
		super();
		this.sonido = sonido;
		this.alimentos = alimentos;
		this.habitat = habitat;
		this.nombreCientifico = nombreCientifico;
	}
	
	public String getSonido() {
		return sonido;
	}
	public String getAlimentos() {
		return alimentos;
	}
	public String getHabitat() {
		return habitat;
	}
	public String getNombreCientifico() {
		return nombreCientifico;
	}
	
	@Override
	public String toString() {
		return "Animal [sonido=" + sonido + ", alimentos=" + alimentos + ", habitat=" + habitat + ", nombreCientifico="
				+ nombreCientifico + "]";
	}
	
}
