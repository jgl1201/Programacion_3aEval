package Ventanas_85;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements ActionListener {
	private Container contenedor; // Un contenedor de elementos gráficos
	private JMenuBar barraMenu; // Una barra de menú principal
	private JMenu menuOpciones; /* Un menú de la barra de menú principal */
	private JMenuItem itemMenu1; // Un ítem de menú
	private JMenuItem itemMenu2; // Un ítem de menú
	private Hotel hotel; // Definición del hotel

	public VentanaPrincipal(Hotel hotel) {
		this.hotel = hotel;
		inicio();
		setTitle("Hotel"); // Establece el título de la ventana
		setSize(280, 380); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
		// Establece que el botón de cerrar permitirá salir de la aplicación
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); /* Establece que el tamaño de la ventana no puede cambiar */
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
		contenedor.setLayout(null); /* Establece que el contenedor no tiene un layout */
		// Se crea la barra de menús, un menú y dos ítems de menú
		barraMenu = new JMenuBar();
		menuOpciones = new JMenu("Menú");
		itemMenu1 = new JMenuItem("Consultar habitaciones");
		itemMenu2 = new JMenuItem("Salida de huéspedes");
		menuOpciones.add(itemMenu1); /* Se agrega el ítem de menú 1 al menú */
		menuOpciones.add(itemMenu2); /* Se agrega el ítem de menú 2 al menú */
		barraMenu.add(menuOpciones); /* Se agregan las opciones de menú al menú */
		setJMenuBar(barraMenu); /* Se agrega el menú a la barra de menús */
		/*
		 * Agrega al ítem de menú 1 un ActionListener para que gestione eventos del ítem
		 * de menú
		 */
		itemMenu1.addActionListener(this);
		/*
		 * Agrega al ítem de menú 2 un ActionListener para que gestione eventos del ítem
		 * de menú
		 */
		itemMenu2.addActionListener(this);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == itemMenu1) { /* Se selecciona el ítem de menú 1 */
			// Se crea la ventana habitaciones
			VentanaHabitaciones ventanaHabitaciones = new VentanaHabitaciones(hotel);
			ventanaHabitaciones.setVisible(true); /* Se visualiza la ventana habitaciones */
		}
		if (evento.getSource() == itemMenu2) { /* Se selecciona el ítem de menú 2 */
			try {
				// Se ingresa el número de habitación
				String númeroHabitación = JOptionPane.showInputDialog(null, "Ingrese número de habitación",
						"Salida de huéspedes", JOptionPane.QUESTION_MESSAGE);
				int número = Integer.valueOf(númeroHabitación); /* Se convierte el texto ingresado a int */
				if (número < 1 || número > 10) {
					/* Si el número es incorrecto, se muestra un mensaje de error */
					JOptionPane.showMessageDialog(this, "El número de habitación debe estar entre 1 y 10", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE, null);
				} else if (hotel.buscarHabitacionOcupada(número)) {
					// Se busca que la habitación esté ocupada // Se crea ventana de salida del
					// huésped
					VentanaSalida ventanaSalida = new VentanaSalida(hotel, número);
					ventanaSalida.setVisible(true); /* Se visualiza la ventana de salida del huésped */
				} else { /* Si la habitación no está ocupada, se muestra un mensaje de error */
					JOptionPane.showMessageDialog(this, "La habitación ingresada no ha sido ocupada", "Mensaje",
							JOptionPane.INFORMATION_MESSAGE, null);
				}
			} catch (Exception e) { // Si se presenta algún tipo de error
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}