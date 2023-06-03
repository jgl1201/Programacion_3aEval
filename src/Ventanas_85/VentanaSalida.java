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
public class VentanaSalida extends JFrame implements ActionListener {

	private Container contenedor; /* Un contenedor de elementos gráficos */
	private JLabel habitacion; // Etiqueta de habitación ocupada
	// Etiquetas de fecha de ingreso, de salida y días de alojamiento
	private JLabel fechaIngreso, fechaSalida, cantidadDias;
	private JTextField campoFechaSalida; /* Campo de texto para ingresar fecha de salida */
	private JLabel totalPago; // Etiqueta del total a pagar por alojamiento
	/*
	 * Botón para calcular el valor a pagar y para registrar la salida del huésped
	 */
	private JButton calcular, registrarSalida;
	private Hotel hotel; // Objeto Hotel
	private int numeroHabitacion; // Número de la habitación ocupada
	private int posicionHabitacion; /* Posición de la habitación en el vector de habitaciones */
	private Habitacion habitacionOcupada; /* Habitación ocupada por el huésped */

	public VentanaSalida(Hotel hotel, int numero) {
		this.hotel = hotel;
		this.numeroHabitacion = numero;
		inicio();
		setTitle("Salida huéspedes"); // Establece el título de la ventana
		setSize(260, 260); // Establece el tamaño de la ventana
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
		// Establece la etiqueta de la habitación
		habitacion = new JLabel();
		habitacion.setText("Habitación: " + numeroHabitacion);
		// Localización de la etiqueta habitación en el layout (0,0)
		c.gridx = 0;
		c.gridy = 0;
		contenedor.add(habitacion); /* Se agrega la etiqueta habitación al contenedor de la ventana */
		// Obtiene la fecha de ingreso para un número de habitación
		String fecha = hotel.buscarFechaIngresoHabitacion(numeroHabitacion);
		fechaIngreso = new JLabel();
		// Concatena la etiqueta con la fecha de ingreso obtenida
		fechaIngreso.setText("Fecha de ingreso: " + fecha);
		// Localización de la etiqueta fecha de ingreso en el layout (0,1)
		c.gridx = 0;
		c.gridy = 1;
		/* Se agrega la etiqueta fecha de ingreso al contenedor de la ventana */
		contenedor.add(fechaIngreso, c);
		/*
		 * Establece la etiqueta y campo de texto de la fecha de salida de la habitación
		 */
		fechaSalida = new JLabel();
		fechaSalida.setText("Fecha de salida (aaaa-mm-dd): ");
		// Localización de la etiqueta fecha de salida en el layout (0,2)
		c.gridx = 0;
		c.gridy = 2;
		/* Se agrega la etiqueta fecha de salida al contenedor de la ventana */
		contenedor.add(fechaSalida, c);
		campoFechaSalida = new JTextField();
		/* Localización del campo de texto fecha de salida en el layout (0,3) */
		c.gridx = 0;
		c.gridy = 3;
		/* Se agrega el campo de texto de fecha de salida al contenedor de la ventana */
		contenedor.add(campoFechaSalida, c);
		// Establece el botón calcular
		calcular = new JButton("Calcular");
		// Localización del botón en el layout (0,4)
		c.gridx = 0;
		c.gridy = 4;
		contenedor.add(calcular, c); /* Se agrega el botón calcular al contenedor de la ventana */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		calcular.addActionListener(this);
		// Establece la etiqueta cantidad de días de alojamiento
		cantidadDias = new JLabel();
		cantidadDias.setText("Cantidad de días: ");
		// Localización de la etiqueta cantidad de días en el layout (0,5)
		c.gridx = 0;
		c.gridy = 5;
		/* Se agrega la etiqueta cantidad de días al contenedor de la ventana */
		contenedor.add(cantidadDias, c);
		// Establece la etiqueta de total a pagar
		totalPago = new JLabel();
		totalPago.setText("Total: $");
		// Localización de la etiqueta total a pagar en el layout (0,6)
		c.gridx = 0;
		c.gridy = 6;
		// Se agrega la etiqueta total a pagar al contenedor de la ventana
		contenedor.add(totalPago, c);
		// Establece el botón registrar salida del huésped
		registrarSalida = new JButton("RegistrarSalida");
		// Localización del botón registrar salida en el layout (0,7)
		c.gridx = 0;
		c.gridy = 7;
		// Se agrega el botón registrar salida al contenedor de la ventana
		contenedor.add(registrarSalida, c);

		/* Deshabilita inicialmente el botón de registro de salida de huésped */
		registrarSalida.setEnabled(false);
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		registrarSalida.addActionListener(this);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana de salida de
	 * huéspedes
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == calcular) { // Se pulsa el botón Calcular
			String fechaS = campoFechaSalida.getText(); /* Se obtiene la fecha de salida ingresada */
			// Se busca la fecha de ingreso según su número de habitación
			String fechaI = hotel.buscarFechaIngresoHabitacion(numeroHabitacion);
			for (int i = 0; i < hotel.listaHabitaciones.size(); i++) { /* Se recorre el vector de habitaciones */
				// Se obtiene un elemento del vector de habitaciones
				habitacionOcupada = (Habitacion) hotel.listaHabitaciones.get(i);
				if (habitacionOcupada.getNumeroHabitacion() == this.numeroHabitacion) {
					// Se encuentra la habitación buscada
					try {
						posicionHabitacion = i;
						SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
						Date fecha2 = formatoFecha.parse(fechaS); /* Da formato a la fecha de salida */
						/* Establece la fecha de salida del huésped de una habitación */
						habitacionOcupada.getHuesped().setFechaSalida(fecha2);
						// Obtiene la fecha de ingreso del huésped
						Date fecha1 = habitacionOcupada.getHuesped().getFechaIngreso();
						/* Si la fecha de ingreso es menor a la fecha de salida */
						if (fecha1.compareTo(fecha2) < 0) {
							// Calcula cantidad de días de alojamiento
							int cantidad = habitacionOcupada.getHuesped().obtenerDiasAlojamiento();
							// Actualiza la etiqueta de cantidad de días
							cantidadDias.setText("Cantidad de días: " + cantidad);
							// Calcula el total a pagar
							double valor = cantidad * habitacionOcupada.getPrecioDia();
							totalPago.setText("Total: $" + valor);
							// Actualiza la etiqueta de total a pagar
							registrarSalida.setEnabled(true); /* Habilita el botón de registrar salida del huésped */
						} else {
							/*
							 * Si la fecha de ingreso es mayor que la de salida, se genera mensaje de error
							 */
							JOptionPane.showMessageDialog(this, "La fecha de salida es menor que la de ingreso",
									"Mensaje", JOptionPane.ERROR_MESSAGE);
						}
					} catch (ParseException e) {
						/* Si la fecha no está en el formato indicado, se genera mensaje de error */
						JOptionPane.showMessageDialog(this, "La fecha no está en el formato solicitado", "Mensaje",
								JOptionPane.ERROR_MESSAGE);
					}
				}
			}
		}
		if (evento.getSource() == registrarSalida) { /* Si se pulsa el botón de Registrar salida */
			habitacionOcupada.setHuesped(null); /* La habitación liberada no tendrá huésped */
			habitacionOcupada.setDisponible(true); /* La habitación se coloca como disponible */
			// Se actualiza el vector de habitaciones
			hotel.listaHabitaciones.set(posicionHabitacion, habitacionOcupada);
			// Se muestra mensaje de confirmación
			JOptionPane.showMessageDialog(this, "Se ha registrado la salida del huésped", "Mensaje",
					JOptionPane.INFORMATION_MESSAGE, null);
			setVisible(false); /* La ventana de registro de salida no se muestra */
		}
	}

}