package Herencia_Prop0_08;

import java.util.ArrayList;

import javax.swing.JOptionPane;

@SuppressWarnings("unused")
public class Equipo {
	private String nombre;
	private double totalTiempo;
	private String pais;
	private ArrayList<Ciclista> bicis = new ArrayList<Ciclista>();
	
	public Equipo(String nombre, String pais) {
		this.nombre = nombre;
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", pais=" + pais + "]";
	}

	public void anadirCiclista(Ciclista ciclista) {
		bicis.add(ciclista);
	}
	public void listarEquipo() {
		for (Ciclista c : bicis) System.out.println(c.toString());
	}
	public void buscarCiclista() {
		String nombreCiclista = JOptionPane.showInputDialog("Nombre del ciclista");
		for (int i = 0; i < bicis.size(); i++) {
			Ciclista c = (Ciclista) bicis.get(i);
			if (c.getNombre().equalsIgnoreCase(nombreCiclista)) c.toString();
			else System.out.println("No existe");
		}
	}
	
	public void calcularTotalTiempo() {
		for (Ciclista c : bicis) totalTiempo += c.getTiempoAcumulado();
	}

}
