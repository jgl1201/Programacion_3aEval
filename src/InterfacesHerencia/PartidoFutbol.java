package InterfacesHerencia;

public interface PartidoFutbol extends MatchDeportivo {
	
	static final int duracionPartidoFutbol = 90;
	
	void setGolesELocal(int marcador);
	void setGolesEVisitante(int marcador);

}
