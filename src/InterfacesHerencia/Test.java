package InterfacesHerencia;

public class Test {
	
	public static void main(String[] args) {
		PartidoFutbolLiga partido = new PartidoFutbolLiga();
		partido.setEquipoLocal("Madrid");
		partido.setequipoVisistante("Barca");
		partido.setGolesELocal(12);
		partido.setGolesEVisitante(2);
		
		System.out.println(partido.toString());
		
		PartidoBaloncestoLiga baloncesto = new PartidoBaloncestoLiga();
		baloncesto.setEquipoLocal("Madrid");
		baloncesto.setequipoVisistante("Barca");
		baloncesto.setCestasELocal(120);
		baloncesto.setCestasEVisitante(97);
		
		System.out.println(baloncesto.toString());
		
		PartidoTenisLiga tenis = new PartidoTenisLiga();
		tenis.setEquipoLocal("Madrid");
		tenis.setequipoVisistante("Barca");
		tenis.setPuntosELocal(7);
		tenis.setPuntosEVisitante(5);
		
		System.out.println(tenis.toString());
	}

}
