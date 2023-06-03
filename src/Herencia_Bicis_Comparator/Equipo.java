package Herencia_Bicis_Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

import javax.swing.JOptionPane;

public class Equipo {
	private String nombre;
	private int totalTiempo;
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

	public void setTotalTiempo(int totalTiempo) {
		this.totalTiempo = totalTiempo;
	}

	public double getTotalTiempo() {
		return totalTiempo;
	}

	@Override
	public String toString() {
		return "Equipo [nombre=" + nombre + ", pais=" + pais + "]";
	}

	public void anadirCiclista(Ciclista ciclista) {
		bicis.add(ciclista);
	}

	public void listarEquipo() {
		for (Ciclista c : bicis)
			System.out.println(c.toString());
	}

	public void buscarCiclista() {
		String nombreCiclista = JOptionPane.showInputDialog("Nombre del ciclista");
		for (int i = 0; i < bicis.size(); i++) {
			Ciclista c = (Ciclista) bicis.get(i);
			if (c.getNombre().equalsIgnoreCase(nombreCiclista)) c.toString();
			else System.out.println("No existe");
		}
	}

	public int calcularTotalTiempo() {
		for (Ciclista c : bicis) totalTiempo += c.getTiempoAcumulado();
		return (int) totalTiempo;
	}
	
	public void sort() {
		bicis.sort(new Comparator<Ciclista>() {
			@Override
			public int compare(Ciclista o1, Ciclista o2) {
				return  (int) (o1.getTiempoAcumulado() - o2.getTiempoAcumulado());
			}
		} );
	}
	
	public void asignarPosiciones() {
		for(int i = 0; i < bicis.size(); i++) bicis.get(i).setPosicionGeneral(i + 1);
	}
	
	public void asignarPosicionesIterator() {
		Iterator<Ciclista> it = bicis.iterator();
		while(it.hasNext()) it.next();
	}

}
