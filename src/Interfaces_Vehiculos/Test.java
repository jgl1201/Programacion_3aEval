package Interfaces_Vehiculos;


public class Test {
		
	public static void main(String[] args) {
		Terrestre camioneta = new Terrestre(50, 180);
		Acuatico acuatico = new Acuatico(50, 110);
		
		System.out.println(camioneta.toString());
		camioneta.acelerar(100);
		System.out.println(camioneta.toString());
		
		System.out.println(acuatico.toString());
		System.out.println(acuatico.calcularRevsMotor(1200, 2));
		acuatico.recomendarVelocidad(70);
		System.out.println(acuatico.toString());
	}

}
