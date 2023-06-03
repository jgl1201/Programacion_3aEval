package Ejem01_RentedVehicles;

@SuppressWarnings("unused")
public class TestRentals {
	
	public static void main(String[] args) {
		Vehicle vehicle1 = new Vehicle("4050 ABJ", "VolksWangen", "GTI", "Blanco", 100.0);
		Vehicle vehicle2 = new Vehicle("2345 JVM", "SEAT", "Leon", "Amarillo", 80.0);
		
		Client client1 = new Client("30435624X", "Juan", "Perez");
		
		RentedVehicle rent1 = new RentedVehicle(client1, vehicle1, 11, 11, 2011, 2);
		
		System.out.println("Vehiculo alquilado");
		System.out.println("Cliente: " + rent1.getClient().getNif() + " " + 
				rent1.getClient().getName() + " " + rent1.getClient().getSurnames());
		System.out.println("Vehiculo: " + rent1.getVehicle().getMatricule());
		System.out.println("Dias de alquiler: " + rent1.getTotalDaysRented());
	}

}