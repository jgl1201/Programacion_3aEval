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
public class VentanaCilindro extends JFrame implements ActionListener {

	private Container contenedor;

	private JLabel radio, altura, volumen, superficie;
	// Campos de texto a ingresar
	private JTextField campoRadio, campoAltura;
	// Bot�n para realizar los c�lculos num�ricos
	private JButton calcular;

	/**
	 * Constructor de la clase VentanaCilindro
	 */
	public VentanaCilindro() {
		inicio();
		setTitle("Cilindro"); // Establece el t�tulo de la ventana
		setSize(280, 210); // Establece el tama�o de la ventana
		setLocationRelativeTo(null);
		setResizable(false);
	}

	/**
	 * M�todo que crea la ventana con sus diferentes componentes gr�ficos
	 */
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		// Establece la etiqueta y campo de texto para el radio del cilindro
		radio = new JLabel();
		radio.setText("Radio (cms):");
		radio.setBounds(20, 20, 135, 23);

		campoRadio = new JTextField();
		// Establece la posici�n del campo de texto de radio del cilindro
		campoRadio.setBounds(100, 20, 135, 23);
		// Establece la etiqueta y campo de texto para la altura del cilindro

		altura = new JLabel();
		altura.setText("Altura (cms):");
		altura.setBounds(20, 50, 135, 23);

		campoAltura = new JTextField();
		// Establece la posici�n del campo de texto de altura del cilindro
		campoAltura.setBounds(100, 50, 135, 23);

		/*
		 * Establece el bot�n para calcular el volumen y superficie del cilindro
		 */
		calcular = new JButton();
		calcular.setText("Calcular");
		calcular.setBounds(100, 80, 135, 23);
		/*
		 * Agrega al bot�n un ActionListener para que gestione eventos del bot�n
		 */
		calcular.addActionListener(this);

		// Establece la etiqueta y el valor del volumen del cilindro
		volumen = new JLabel();
		volumen.setText("Volumen (cm3):");
		// Establece la posici�n de la etiqueta de volumen del cilindro
		volumen.setBounds(20, 110, 135, 23);

		// Establece la etiqueta y el valor de la superficie del cilindro
		superficie = new JLabel();
		superficie.setText("Superficie (cm2):");
		// Establece la posici�n de la etiqueta de superficie del cilindro
		superficie.setBounds(20, 140, 135, 23);

		// Se a�ade cada componente gr�fico al contenedor de la ventana
		contenedor.add(radio);
		contenedor.add(campoRadio);
		contenedor.add(altura);
		contenedor.add(campoAltura);
		contenedor.add(calcular);
		contenedor.add(volumen);
		contenedor.add(superficie);
	}

	/**
	 * M�todo que gestiona los eventos generados en la ventana del cilindro throws
	 * Exception Excepci�n al ingresar un campo nulo o error en formato de n�mero
	 */
	public void actionPerformed(ActionEvent event) {
		// Se inicializan el radio y la altura del cilindro
		boolean error = false; /* Se inicializa variable para determinar si ocurre un error */
		double radio = 0;
		double altura = 0;
		try {
			// Se obtiene el radio del cilindro ingresado
			radio = Double.parseDouble(campoRadio.getText());
			// Se obtiene la altura del cilindro ingresada
			altura = Double.parseDouble(campoAltura.getText());
			Cilindro cilindro = new Cilindro(radio, altura); /* Se crea un objeto Cilindro */
			// Se calcula y muestra el volumen
			volumen.setText("Volumen (cm3): " + String.format("%.2f", cilindro.calcularVolumen()));
			// Se calcula y muestra la superficie
			superficie.setText("Superficie (cm2): " + String.format("%.2f", cilindro.calcularSuperficie()));
		} catch (Exception e) {
			error = true; // Si ocurre una excepci�n
		} finally {
			if (error) { /* Si ocurre una excepci�n, se muestra un mensaje de error */
				JOptionPane.showMessageDialog(null, "Campo nulo o error en formato de numero", "Error",
						JOptionPane.ERROR_MESSAGE);
			}
		}
	}
}
