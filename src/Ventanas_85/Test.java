package Ventanas_85;

public class Test {
	
	public static void main(String[] args) {
		Hotel miHotel = new Hotel();
		
		VentanaPrincipal miVentana;
		miVentana = new VentanaPrincipal(miHotel);
		miVentana.setVisible(true);
		miVentana.setResizable(false);

	}

}
