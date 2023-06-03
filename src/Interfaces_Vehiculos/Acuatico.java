package Interfaces_Vehiculos;

public class Acuatico extends Vehiculo implements Motor, Vela {
	
	public Acuatico(int velocidadActual, int velocidadMaxima) {
		super(velocidadActual, velocidadMaxima);
	}

	@Override
	public String toString() {
		return "Terrestre [velocidadActual=" + velocidadActual + ", velocidadMaxima=" + velocidadMaxima + "]";
	}
	
	@Override
	void acelerar(int incremento) {
		int vel = velocidadActual + incremento;
		if (vel > velocidadMaxima) System.out.println("Supera la velocidad maxima");
		else System.out.println("No supera la velocidad maxima");
	}

	@Override
	void frenar(int incremento) {
		int vel = velocidadActual - incremento;
		if (vel < 0) System.out.println("La velocidad no puede ser negativa");
		else System.out.println("Parado");	
	}
	
	public int calcularRevsMotor(int fuerza, int radio) {
		return fuerza * radio;
	}

	@Override
	public void recomendarVelocidad(int velocidadViento) {
		if(velocidadViento > 80 || velocidadViento < 10) velocidadActual = 0;
		
	}

}
