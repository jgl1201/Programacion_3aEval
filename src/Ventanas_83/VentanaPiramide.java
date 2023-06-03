package Ventanas_83;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class VentanaPiramide extends JFrame implements ActionListener {

	// Un contenedor de elementos gr�ficos
	private Container contenedor;
	/*
	 * Etiquetas est�ticas para identificar los campos de texto a ingresar y
	 * calcular
	 */
	private JLabel base, altura, apotema, volumen, superficie;
	// Campos de texto a ingresar
	private JTextField campoBase, campoAltura, campoApotema;
	// Bot�n para realizar los c�lculos num�ricos
	private JButton calcular;

	/**
	 * Constructor de la clase VentanaPir�mide
	 */
	public VentanaPiramide() {
		inicio();
		setTitle("Piramide"); // Establece el t�tulo de la ventana
		setSize(280, 240); // Establece el tama�o de la ventana
		setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
		setResizable(false); /* Establece que el bot�n de cerrar permitir� salir de la aplicaci�n */
	}

	/**
	 * M�todo que crea la ventana con sus diferentes componentes gr�ficos
	 */
	private void inicio() {

		contenedor = getContentPane(); /* Obtiene el panel de contenidos de la ventana */
		contenedor.setLayout(null); /* Establece que el contenedor no tiene un layout */

		/* Establece la etiqueta y campo de texto para la base de la pir�mide */
		base = new JLabel();
		base.setText("Base (cms):");
		// Establece la posici�n de la etiqueta de la base de la pir�mide
		base.setBounds(20, 20, 135, 23);

		campoBase = new JTextField();
		/* Establece la posici�n del campo de texto de la base de la pir�mide */
		campoBase.setBounds(120, 20, 135, 23);

		/* Establece la etiqueta y campo de texto para la altura de la pir�mide */
		altura = new JLabel();
		altura.setText("Altura (cms):");
		// Establece la posici�n de la etiqueta de la altura de la pir�mide
		altura.setBounds(20, 50, 135, 23);

		campoAltura = new JTextField();
		/* Establece la posici�n del campo de texto de la altura de la pir�mide */
		campoAltura.setBounds(120, 50, 135, 23);

		/* Establece la etiqueta y campo de texto para el apotema de la pir�mide */
		apotema = new JLabel();
		apotema.setText("Apotema (cms):");
		// Establece la posici�n de la etiqueta del apotema de la pir�mide
		apotema.setBounds(20, 80, 135, 23);

		campoApotema = new JTextField();
		/* Establece la posici�n del campo de texto del apotema de la pir�mide */
		campoApotema.setBounds(120, 80, 135, 23);

		/* Establece el bot�n para calcular volumen y superficie de la pir�mide */
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(120, 110, 135, 23); /* Establece la posici�n del bot�n calcular */
		/* Agrega al bot�n un ActionListener para que gestione eventos del bot�n */
		calcular.addActionListener(this);

		// Establece la etiqueta y el valor del volumen de la pir�mide
		volumen = new JLabel();
		volumen.setText("Volumen (cm3):");
		// Establece la posici�n de la etiqueta de volumen de la pir�mide
		volumen.setBounds(20, 140, 135, 23);

		// Establece la etiqueta y el valor de la superficie de la pir�mide
		superficie = new JLabel();
		superficie.setText("Superficie (cm2):");
		// Establece la posici�n de la etiqueta de superficie de la pir�mide
		superficie.setBounds(20, 170, 135, 23);

		// Se a�ade cada componente gr�fico al contenedor de la ventana
		contenedor.add(base);
		contenedor.add(campoBase);
		contenedor.add(altura);
		contenedor.add(campoAltura);
		contenedor.add(apotema);
		contenedor.add(campoApotema);
		contenedor.add(calcular);
		contenedor.add(volumen);
		contenedor.add(superficie);
	}

	/**
	 * M�todo que gestiona los eventos generados en la ventana de la esfera throws
	 * Exception Excepci�n al ingresar un campo nulo o error en formato de n�mero
	 */
	public void actionPerformed(ActionEvent event) {
		Piramide piramide;
		boolean error = false;
		double base = 0;
		double altura = 0;
		double apotema = 0;
		try {
			// Se obtiene y convierte el valor num�rico de la base
			base = Double.parseDouble(campoBase.getText());
			// Se obtiene y convierte el valor num�rico de la altura
			altura = Double.parseDouble(campoAltura.getText());
			// Se obtiene y convierte el valor num�rico del apotema
			apotema = Double.parseDouble(campoApotema.getText());
			// Se crea un objeto Pir�mide
			piramide = new Piramide(base, altura, apotema);
			// Se muestra el volumen
			volumen.setText("Volumen (cm3): " + String.format("%.2f", piramide.calcularVolumen()));
			// Se muestra la superficie
			superficie.setText("Superficie (cm2): " + String.format("%.2f", piramide.calcularSuperficie()));
		} catch (Exception e) {
			error = true; // Si ocurre una excepci�n
		} finally {
			if (error) { /*
							 * Si ocurre una excepci�n, se muestra un mensaje de error
							 */
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de n�mero", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}

}
