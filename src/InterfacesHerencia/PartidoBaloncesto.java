package InterfacesHerencia;

public interface PartidoBaloncesto extends MatchDeportivo {

	static final int duracionPartidoBaloncesto = 40;
	
	void setCestasELocal(int marcador);
	void setCestasEVisitante(int marcador);
	
}
