package InterfacesHerencia;

public class PartidoFutbolLiga implements PartidoFutbol {

	String equipoLocal;
	String equipoVisitante;
	int golesLocal;
	int golesVisitante;

	@Override
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal = nombreEquipo;
	}

	@Override
	public void setequipoVisistante(String nombreEquipo) {
		this.equipoVisitante = nombreEquipo;
	}

	@Override
	public void setGolesELocal(int marcador) {
		this.golesLocal = marcador;
	}

	@Override
	public void setGolesEVisitante(int marcador) {
		this.golesVisitante = marcador;
	}

	@Override
	public String toString() {
		return "PartidoFutbolLiga [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", golesLocal=" + golesLocal + ", golesVisitante=" + golesVisitante + "]";
	}
	
	

}
