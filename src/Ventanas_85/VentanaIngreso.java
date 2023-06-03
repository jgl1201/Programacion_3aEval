package Ventanas_85;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings({"serial", "unused", "static-access"})
public class VentanaIngreso extends JFrame implements ActionListener {

	private Container contenedor; // Un contenedor de elementos gráficos
	private JLabel habitacion; /* Etiqueta para identificar la habitación seleccionada */
	private JButton aceptar, cancelar; /* Botones para aceptar o cancelar el ingreso del huésped */
	private JLabel nombre, apellidos, documentoIdentidad; /* Etiquetas para los campos de texto */
	private JLabel huesped; // Etiqueta para identificar el huésped
	// Campos de texto para ingresar datos del huésped
	private JTextField campoNombre, campoApellidos, campoDocumentoIdentidad;
	private JLabel fechaIngreso; // Etiqueta de la fecha de ingreso
	private JTextField campoFechaIngreso; /* Campo de texto de la fecha de ingreso */
	
	private int numeroHabitacionReservada; /* Número de la habitación reservada */
	private Hotel hotel; // Objeto Hotel
	
	private Date fechaInicial; /* Fecha de inicio del alojamiento del huésped */
	private Habitacion habitacionReservada; // Habitación reservada

	public VentanaIngreso(Hotel hotel, int numeroHabitacionReservada) {
		this.hotel = hotel;
		this.numeroHabitacionReservada = numeroHabitacionReservada;
		inicio();
		setTitle("Ingreso"); // Establece el título de la ventana
		setSize(290, 250); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
		setResizable(false); /* Establece que el tamaño de la ventana no puede cambiar */
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
		// Establece que el contenedor tendrá un GridBagLayout
		
		contenedor.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints(); /* Define las restricciones del layout */
		
		c.fill = GridBagConstraints.HORIZONTAL; /* El layout es horizontal */
		c.insets = new Insets(3, 3, 3, 3); /* Define los bordes del contenedor */
		// Establece la etiqueta del número de la habitación reservada
		habitacion = new JLabel();
		habitacion.setText("Habitacion: " + numeroHabitacionReservada);
		/* Localización de la etiqueta del número de la habitación en el layout (0,0) */
		c.gridx = 0;
		c.gridy = 0;
		contenedor.add(habitacion, c); /* Se agrega la etiqueta al contenedor de la ventana */
		// Establece la etiqueta y campo de texto de la fecha de ingreso
		fechaIngreso = new JLabel();
		fechaIngreso.setText("Fecha (aaaa-mm-dd):");
		// Localización de la etiqueta fecha de ingreso en el layout (0,1)
		c.gridx = 0;
		c.gridy = 1;
		/* Se agrega la etiqueta de fecha de ingreso al contenedor de la ventana */
		contenedor.add(fechaIngreso, c);
		campoFechaIngreso = new JTextField();
		/* Localización del campo de texto de fecha de ingreso en el layout (1,1) */
		c.gridx = 1;
		c.gridy = 1;
		/* Se agrega el campo de texto fecha de ingreso al contenedor de la ventana */
		contenedor.add(campoFechaIngreso, c);
		// Establece la etiqueta del huésped
		huesped = new JLabel();
		huesped.setText("Huesped");
		// Localización de la etiqueta huésped en el layout (0,2)
		c.gridx = 0;
		c.gridy = 2;
		contenedor.add(huesped, c); /* Se agrega la etiqueta huésped al contenedor de la ventana */
		// Establece la etiqueta y el campo de texto nombre del huésped
		nombre = new JLabel();
		nombre.setText("Nombre: ");
		// Localización de la etiqueta nombre en el layout (0,3)
		c.gridx = 0;
		c.gridy = 3;
		contenedor.add(nombre, c); /* Se agrega la etiqueta nombre al contenedor de la ventana */
		campoNombre = new JTextField();
		// Localización del campo de texto nombre en el layout
		c.gridx = 1;
		c.gridy = 3;
		// Se agrega el campo de texto nombre al contenedor de la ventana
		contenedor.add(campoNombre, c);
		// Establece la etiqueta y el campo de texto apellidos del huésped
		apellidos = new JLabel();
		apellidos.setText("Apellidos: ");
		// Localización de la etiqueta apellidos en el layout (0,4)
		c.gridx = 0;
		c.gridy = 4;
		contenedor.add(apellidos, c); /* Se agrega la etiqueta apellidos al contenedor de la ventana */
		campoApellidos = new JTextField();
		// Localización del campo de texto apellidos en el layout (1,4)
		
		c.gridx = 1;
		c.gridy = 4;
		// Se agrega el campo de texto apellidos al contenedor de la ventana
		contenedor.add(campoApellidos, c);
		/*
		 * Establece la etiqueta y el campo de texto documento de identidad del huésped
		 */
		documentoIdentidad = new JLabel();
		documentoIdentidad.setText("Doc. Identidad: ");
		/* Localización de la etiqueta documento de identidad en el layout (0,5) */
		c.gridx = 0;
		c.gridy = 5;
		/* Se agrega la etiqueta documento de identidad al contenedor de la ventana */
		contenedor.add(documentoIdentidad, c);
		campoDocumentoIdentidad = new JTextField();
		/* Localización del campo de texto documento de identidad en el layout (1,5) */
		c.gridx = 1;
		c.gridy = 5;
		/*
		 * Se agrega el campo de texto documento de identidad al contenedor de la
		 * ventana
		 */
		contenedor.add(campoDocumentoIdentidad, c);
		// Establece el botón aceptar y cancelar de la ventana
		aceptar = new JButton("Aceptar");
		// Localización del botón aceptar en el layout (0,6)
		c.gridx = 0;
		c.gridy = 6;
		contenedor.add(aceptar, c); /* Se agrega el botón aceptar al contenedor de la ventana */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		aceptar.addActionListener(this);
		cancelar = new JButton("Cancelar");
		// Localización del botón cancelar en el layout (1,6)
		c.gridx = 1;
		c.gridy = 6;
		contenedor.add(cancelar, c); /* Se agrega el botón cancelar al contenedor de la ventana */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		cancelar.addActionListener(this);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana de ingreso de
	 * huéspedes
	 * 
	 * @throws ParseException
	 *             Excepción generada cuando la fecha no está en el formato
	 *             solicitado
	 * @throws Exception
	 *             Excepción generada cuando hay un campo nulo o error en formato de
	 *             numero
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == aceptar) { // Se pulsa el botón Aceptar
			int posicion = -1;
			for (int i = 0; i < hotel.listaHabitaciones.size(); i++) { /* Se recorre el vector de habitaciones */
				// Se obtiene un elemento del vector
				Habitacion habitacion = (Habitacion) hotel.listaHabitaciones.get(i);
				if (habitacion.getNumeroHabitacion() == this.numeroHabitacionReservada) {
					// Si la habitación está reservada
					try {
						posicion = i;
						// Obtiene la fecha de ingreso tecleada
						String fechaIngresada = campoFechaIngreso.getText();
						// Establece formato de fecha
						SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
						// Convierte la fecha de ingreso al formato
						Date fecha = formatoFecha.parse(fechaIngresada);
						// Crea un objeto huésped
						Huesped huesped = new Huesped(nombre.getText(), apellidos.getText(),
								Integer.parseInt(campoDocumentoIdentidad.getText()));
						huesped.setFechaIngreso(fecha); /* Establece fecha de ingreso del huésped */
						habitacion.setHuesped(huesped); /* Establece el huésped para la habitación */
						habitacion.setDisponible(false); /* Coloca la habitación como no disponible */
						habitacionReservada = habitacion;
						/* Coloca la habitación como ocupada en la lista de habitaciones */
						hotel.listaHabitaciones.set(posicion, habitacion);
						JOptionPane.showMessageDialog(this, "El huésped ha sido registrado", "Mensaje",
								JOptionPane.INFORMATION_MESSAGE, null);
						setVisible(false); /* La ventana de ingreso no está visible */
						break;
					} catch (ParseException e) { /* Si la fecha no está en el formato indicado */
						JOptionPane.showMessageDialog(this, "La fecha no está en el formato solicitado", "Mensaje",
								JOptionPane.ERROR_MESSAGE);
					} catch (Exception e) { /* Si ocurre un error por datos ingresados nulos o no numéricos */
						JOptionPane.showMessageDialog(this, "Campo nulo o error en formato de numero", "Error",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
		if (evento.getSource() == cancelar) { /* Si se pulsa el botón cancelar */
			setVisible(false); // La ventana de ingreso no está visible
		}
	}

}