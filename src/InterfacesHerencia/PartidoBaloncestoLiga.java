package InterfacesHerencia;

public class PartidoBaloncestoLiga implements PartidoBaloncesto {
	
	String equipoLocal;
	String equipoVisitante;
	int cestasLocal;
	int cestasVisitante;
	
	@Override
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal = nombreEquipo;
	}

	@Override
	public void setequipoVisistante(String nombreEquipo) {
		this.equipoVisitante = nombreEquipo;
	}

	@Override
	public void setCestasELocal(int marcador) {
		this.cestasLocal = marcador;
	}

	@Override
	public void setCestasEVisitante(int marcador) {
		this.cestasVisitante = marcador;
	}

	@Override
	public String toString() {
		return "PartidoBaloncestoLiga [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", cestasLocal=" + cestasLocal + ", cestasVisitante=" + cestasVisitante + "]";
	}
}
