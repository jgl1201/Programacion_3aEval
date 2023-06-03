package Maquina;

public class Puerta {

	Logistica Parking = null;

	Puerta(Logistica Parking) {
		this.Parking = Parking;
	}

	public void EntraVehiculo() {
		if (Parking.HayHueco()) {
			System.out.println("puede entrar");
			Parking.MeteContenedor();
		} else {
			System.out.println("esta lleno");
		}
	}

	public void saleVehiculo() {
		if (Parking.getNumeroDeContenedores()!=0) {
			System.out.println("puede salir");
			Parking.SacaContenedor();
		} else {
			System.out.println("no puede salir");
		}
		
	}
}
