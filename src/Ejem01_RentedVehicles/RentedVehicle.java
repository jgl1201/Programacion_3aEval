package Ejem01_RentedVehicles;

public class RentedVehicle {
	
	//atributos
	private Client client;
	private Vehicle vehicle;
	
	//atributos int
	private int daysRental;
	private int monthRental;
	private int yearRental;
	private int totalDaysRented;

	public RentedVehicle(Client client, Vehicle vehicle, int diaAlquiler, int mesAlquiler, int annoAlquiler,
			int totalDiasAlquiler) {
		this.client = client;
		this.vehicle = vehicle;
		this.daysRental = diaAlquiler;
		this.monthRental = mesAlquiler;
		this.yearRental = annoAlquiler;
		this.totalDaysRented = totalDiasAlquiler;
	}

	public Client getClient() {
		return this.client;
	}
	public Vehicle getVehicle() {
		return this.vehicle;
	}

	public int getDaysRental() {
		return daysRental;
	}
	public int getMonthRental() {
		return monthRental;
	}
	public int getYearRental() {
		return yearRental;
	}
	public int getTotalDaysRented() {
		return totalDaysRented;
	}

	@Override
	public String toString() {
		return "RentedVehicle [client=" + client + ", vehicle=" + vehicle + ", daysRental=" + daysRental
				+ ", monthRental=" + monthRental + ", yearRental=" + yearRental + ", totalDaysRented=" + totalDaysRented
				+ "]";
	}
		
}