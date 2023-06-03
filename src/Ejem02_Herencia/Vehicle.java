package Ejem02_Herencia;

public class Vehicle {

	protected String matricule;
	protected String brand;
	protected String model;
	protected String color;
	protected double rent;
	protected boolean abailable;

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
	
	public void start() {
		System.out.println("Arrancando el vehiculo... Espere");
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

class Turism extends Vehicle {
	
	protected int numberDoors;
	protected boolean automatic;
	
	public Turism(String matricule, String brand, String model, String color, double rent, int numberDoors, boolean automatic) {
		super(matricule, brand, model, color, rent);
		this.numberDoors = numberDoors;
		this.automatic = automatic;
	}
	
	public void start() {
		System.out.println("Con esos humos no pasas la ITV");
	}

	public int getNumberDoors() {
		return numberDoors;
	}
	public boolean isAutomatic() {
		return automatic;
	}

	@Override
	public String toString() {
		return super.toString() + " Turism [numberDoors=" + numberDoors + ", automatic=" + automatic + "]";
	}
}

class Deportive extends Vehicle {
	
	protected int cv;

	public Deportive(String matricule, String brand, String model, String color, double rent, int cv) {
		super(matricule, brand, model, color, rent);
		this.cv = cv;
	}
	
	public void start() {
		System.out.println("BRRRRRRRRUUUUUUUMMMMMMM");
	}

	public int getCv() {
		return cv;
	}

	@Override
	public String toString() {
		return super.toString() + " Deportive [cv=" + cv + "]";
	}	
}

class Van extends Vehicle {
	
	protected int charge;
	protected int volume;
	
	public Van(String matricule, String brand, String model, String color, double rent, int charge, int volume) {
		super(matricule, brand, model, color, rent);
		this.charge = charge;
		this.volume = volume;
	}
	
	public void start() {
		System.out.println("Calentando inyectores. Espere 10 minutos");
	}
	
	public int getCharge() {
		return charge;
	}
	public int getVolume() {
		return volume;
	}

	@Override
	public String toString() {
		return super.toString() + " Van [charge=" + charge + ", volume=" + volume + "]";
	}
	
}