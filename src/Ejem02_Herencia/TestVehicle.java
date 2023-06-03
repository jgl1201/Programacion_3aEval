package Ejem02_Herencia;

import java.util.ArrayList;

public class TestVehicle {
	
	public static ArrayList<Vehicle> rentals = new ArrayList<Vehicle>();
	
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("4050 ABJ", "VolksWangen", "GTI", "Blanco", 100.0);
		Turism turism1 = new Turism("3049 HXX", "Renault", "Scenic", "Gris", 50.0, 5, false);
		Deportive deportive1 = new Deportive("3015 HKP", "Lamborghinni", "Aventador", "Rojo", 1500.0, 1500);
		Van van1 = new Van("4896 HOY", "Citroen", "Berlingo", "Azul", 60.0, 1000, 150);
		
		rentals.add(vehicle1);
		rentals.add(turism1);
		rentals.add(deportive1);
		rentals.add(van1);
		
		for (Vehicle v : rentals) System.out.println(v.toString());
		
		for (Vehicle v : rentals) v.start();
		
		Vehicle myVehicle1 = new Turism("4090 TUR", "Skoda", "Fabia", "Azul", 90.0, 2, false);
		System.out.println(myVehicle1.toString());
		Vehicle myVehicle2 = new Deportive("4090 DEP", "Porsche", "911", "Negro", 150.0, 5000);
		System.out.println(myVehicle2.toString());
		Vehicle myVehicle3 = new Van("4090 VAN", "Citroen", "C15", "Blanca", 80.0, 1000, 150);
		System.out.println(myVehicle3.toString());
	}

}
