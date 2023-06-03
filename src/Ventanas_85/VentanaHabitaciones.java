package Ventanas_85;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

@SuppressWarnings({"serial", "static-access"})
public class VentanaHabitaciones extends JFrame implements ActionListener {

	private Container contenedor; /* Un contenedor de elementos gráficos */
	// Etiquetas de cada habitacion
	private JLabel habitacion1, habitacion2, habitacion3, habitacion4, habitacion5;
	private JLabel habitacion6, habitacion7, habitacion8, habitacion9, habitacion10;
	// Etiquetas de disponibilidad cada habitacion
	private JLabel disponibleHab1, disponibleHab2, disponibleHab3, disponibleHab4, disponibleHab5;
	private JLabel disponibleHab6, disponibleHab7, disponibleHab8, disponibleHab9, disponibleHab10;
	private JLabel habitacionSeleccionada; /* Etiqueta para indicar la habitacion a ocupar */
	private JSpinner campohabitacionSeleccionada; /* Selector numérico de habitacion a ocupar */
	private SpinnerNumberModel modeloSpinner; /* Modelo de datos del selector */
	private JButton botonAceptar; // Botón aceptar
	private Hotel hotel; // Objeto Hotel

	public VentanaHabitaciones(Hotel hotel) {
		this.hotel = hotel;
		inicio();
		setTitle("Habitaciones"); // Establece el título de la ventana
		setSize(760, 260); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
		setResizable(false); /* Establece que el tamaño de la ventana no puede cambiar */
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
		contenedor.setLayout(null); /* Establece que el contenedor no tiene un layout */
		Habitacion habitacion;
		// Establece las etiquetas de la habitacion 1 y su disponibilidad
		habitacion1 = new JLabel();
		habitacion1.setText("habitacion 1");
		// Establece la posición de la etiqueta de la habitacion 1
		habitacion1.setBounds(20, 30, 130, 23);
		disponibleHab1 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 1
		 */
		disponibleHab1.setBounds(20, 50, 100, 23);
		// Obtiene la habitacion 1 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(0);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 1 está disponible o no */
			disponibleHab1.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 2 y su disponibilidad
		habitacion2 = new JLabel();
		habitacion2.setText("habitacion 2");
		// Establece la posición de la etiqueta de la habitacion 2
		habitacion2.setBounds(160, 30, 130, 23);
		disponibleHab2 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 2
		 */
		disponibleHab2.setBounds(160, 50, 100, 23);
		// Obtiene la habitacion 2 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(1);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 2 está disponible o no */
			disponibleHab2.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 3 y su disponibilidad
		habitacion3 = new JLabel();
		habitacion3.setText("habitacion 3");
		// Establece la posición de la etiqueta de la habitacion 3
		habitacion3.setBounds(300, 30, 130, 23);
		disponibleHab3 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 3
		 */
		disponibleHab3.setBounds(300, 50, 100, 23);
		// Obtiene la habitacion 3 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(2);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 3 está disponible o no */
			disponibleHab3.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 4 y su disponibilidad
		habitacion4 = new JLabel();
		habitacion4.setText("habitacion 4");
		// Establece la posición de la etiqueta de la habitacion 4
		habitacion4.setBounds(440, 30, 130, 23);
		disponibleHab4 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 4
		 */
		disponibleHab4.setBounds(440, 50, 100, 23);
		// Obtiene la habitacion 4 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(3);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 4 está disponible o no */
			disponibleHab4.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 5 y su disponibilidad
		habitacion5 = new JLabel();
		// Establece la posición de la etiqueta de la habitacion 5
		habitacion5.setText("habitacion 5");
		habitacion5.setBounds(580, 30, 135, 23);
		disponibleHab5 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 5
		 */
		disponibleHab5.setBounds(580, 50, 100, 23);
		// Obtiene la habitacion 5 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(4);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 5 está disponible o no */
			disponibleHab5.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 6 y su disponibilidad
		habitacion6 = new JLabel();
		habitacion6.setText("habitacion 6");
		// Establece la posición de la etiqueta de la habitacion 6
		habitacion6.setBounds(20, 120, 130, 23);
		disponibleHab6 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 6
		 */
		disponibleHab6.setBounds(20, 140, 100, 23);
		// Obtiene la habitacion 6 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(5);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 6 está disponible o no */
			disponibleHab6.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 7 y su disponibilidad
		habitacion7 = new JLabel();
		habitacion7.setText("habitacion 7");
		// Establece la posición de la etiqueta de la habitacion 7
		habitacion7.setBounds(160, 120, 130, 23);
		disponibleHab7 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 7
		 */
		disponibleHab7.setBounds(160, 140, 100, 23);
		// Obtiene la habitacion 7 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(6);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 7 está disponible o no */
			disponibleHab7.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 8 y su disponibilidad
		habitacion8 = new JLabel();
		habitacion8.setText("habitacion 8");
		// Establece la posición de la etiqueta de la habitacion 8
		habitacion8.setBounds(300, 120, 130, 23);
		disponibleHab8 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 8
		 */
		disponibleHab8.setBounds(300, 140, 100, 23);
		// Obtiene la habitacion 8 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(7);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 8 está disponible o no */
			disponibleHab8.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 9 y su disponibilidad
		habitacion9 = new JLabel();
		habitacion9.setText("habitacion 9");
		// Establece la posición de la etiqueta de la habitacion 9
		habitacion9.setBounds(440, 120, 130, 23);
		disponibleHab9 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 9
		 */
		disponibleHab9.setBounds(440, 140, 100, 23);
		// Obtiene la habitacion 9 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(8);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 9 está disponible o no */
			disponibleHab9.setText("No disponible");
		}
		// Establece las etiquetas de la habitacion 10 y su disponibilidad
		habitacion10 = new JLabel();
		habitacion10.setText("habitacion 10");
		// Establece la posición de la etiqueta de la habitacion 10
		habitacion10.setBounds(580, 120, 135, 23);
		disponibleHab10 = new JLabel("Disponible");
		/*
		 * Establece la posición de la etiqueta de la disponibilidad de la habitacion 10
		 */
		disponibleHab10.setBounds(580, 140, 100, 23);
		// Obtiene la habitacion 10 de la lista de habitaciones
		habitacion = (Habitacion) hotel.listaHabitaciones.get(9);
		if (!habitacion.getDisponible()) { /* Determina si la habitacion 10 está disponible o no */
			disponibleHab10.setText("No disponible");
		}
		// Establece la etiquetas de la habitacion a reservar
		habitacionSeleccionada = new JLabel();
		habitacionSeleccionada.setText("habitacion a reservar:");
		// Establece la posición de la etiqueta de la habitacion a reservar
		habitacionSeleccionada.setBounds(250, 180, 135, 23);
		campohabitacionSeleccionada = new JSpinner(); /* Crea un selector numérico */
		modeloSpinner = new SpinnerNumberModel(); /* Crea un modelo numérico para el selector */
		// Define valores mínimo, máximo y actual del modelo numérico
		modeloSpinner.setMinimum(1);
		modeloSpinner.setMaximum(10);
		modeloSpinner.setValue(1);
		// Asocia el modelo numérico al spinner
		campohabitacionSeleccionada.setModel(modeloSpinner);
		// Establece la posición del selector numérico
		campohabitacionSeleccionada.setBounds(380, 180, 40, 23);
		// Establece el botón aceptar
		botonAceptar = new JButton("Aceptar");
		botonAceptar.setBounds(500, 180, 100, 23); /* Establece la posición del botón aceptar */
		/* Se agregan los componentes gráficos al contenedor de la ventana */
		contenedor.add(habitacion1);
		contenedor.add(disponibleHab1);
		contenedor.add(habitacion2);
		contenedor.add(disponibleHab2);
		contenedor.add(habitacion3);
		contenedor.add(disponibleHab3);
		contenedor.add(habitacion4);
		contenedor.add(disponibleHab4);
		contenedor.add(habitacion5);
		contenedor.add(disponibleHab5);
		contenedor.add(habitacion6);
		contenedor.add(disponibleHab6);
		contenedor.add(habitacion7);
		contenedor.add(disponibleHab7);
		contenedor.add(habitacion8);
		contenedor.add(disponibleHab8);
		contenedor.add(habitacion9);
		contenedor.add(disponibleHab9);
		contenedor.add(habitacion10);
		contenedor.add(disponibleHab10);
		contenedor.add(habitacionSeleccionada);
		contenedor.add(campohabitacionSeleccionada);
		contenedor.add(botonAceptar);
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		botonAceptar.addActionListener(this);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == botonAceptar) { /* Se pulsa el botón Aceptar */
			// Se obtiene la habitacion seleccionada
			int habitacion = (int) campohabitacionSeleccionada.getValue();
			if (!hotel.buscarHabitacionOcupada(habitacion)) { /* Si la habitacion no está ocupada */
				// Se registra ingreso en la habitacion
				VentanaIngreso ventanaIngreso = new VentanaIngreso(hotel, habitacion);
				setVisible(false); /* La ventana con el listado de habitaciones se cierra */
				ventanaIngreso.setVisible(true); /* La ventana de ingreso del húesped se hace visible */
			} else {
				/*
				 * Si la habitacion está ocupada se genera un cuadro de diálogo informando la
				 * situación
				 */
				JOptionPane.showMessageDialog(this, "La habitacion está ocupada", "Mensaje",
						JOptionPane.INFORMATION_MESSAGE, null);
			}
		}
	}
}