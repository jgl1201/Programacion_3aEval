package Ejem01_RentedVehicles;

public class Client {
	private String nif;
	private String name;
	private String surnames;

	public Client(String nif, String name, String surnames) {
		this.nif = nif;
		this.name = name;
		this.surnames = surnames;
	}

	public String getNif() {
		return nif;
	}
	public String getName() {
		return name;
	}
	public String getSurnames() {
		return surnames;
	}

	@Override
	public String toString() {
		return "Client [nif=" + nif + ", name=" + name + ", surnames=" + surnames + "]";
	}
	
}