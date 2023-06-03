package InterfacesHerencia;

public class PartidoTenisLiga implements PartidoTenis {

	String equipoLocal;
	String equipoVisitante;
	int puntosLocal;
	int puntosVisitante;

	@Override
	public void setEquipoLocal(String nombreEquipo) {
		this.equipoLocal = nombreEquipo;
	}

	@Override
	public void setequipoVisistante(String nombreEquipo) {
		this.equipoVisitante = nombreEquipo;
	}

	@Override
	public void setPuntosELocal(int marcador) {
		this.puntosLocal = marcador;
	}

	@Override
	public void setPuntosEVisitante(int marcador) {
		this.puntosVisitante = marcador;
	}

	@Override
	public String toString() {
		return "PartidoTenisLiga [equipoLocal=" + equipoLocal + ", equipoVisitante=" + equipoVisitante
				+ ", puntosLocal=" + puntosLocal + ", puntosVisitante=" + puntosVisitante + "]";
	}

}
