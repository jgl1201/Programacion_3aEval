package Ejem01_RentedVehicles;

public class Vehicle {

	private String matricule;
	private String brand;
	private String model;
	private String color;
	private double rent;
	private boolean abailable;

	public Vehicle(String matricule, String brand, String model, String color) {
		this.matricule = matricule;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.rent = 0.0;
		this.abailable = false;
	}

	public Vehicle(String matricule, String brand, String model, String color, double rent) {
		this.matricule = matricule;
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.rent = rent;
		this.abailable = false;
	}

	public String getMatricule() {
		return matricule;
	}	
	public String getBrand() {
		return brand;
	}
	public String getModel() {
		return model;
	}
	public String getColor() {
		return color;
	}
	public double getRent() {
		return rent;
	}
	public boolean isAbailable() {
		return abailable;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}
	public void setAbailable(boolean abailable) {
		this.abailable = abailable;
	}

	@Override
	public String toString() {
		return "Vehicle [matricule=" + matricule + ", brand=" + brand + ", model=" + model + ", color=" + color
				+ ", rent=" + rent + ", abailable=" + abailable + "]";
	}
	
}
