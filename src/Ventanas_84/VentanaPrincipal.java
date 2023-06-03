package Ventanas_84;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements ActionListener {

	private Container contenedor; // Un contenedor de elementos gráficos
	ListaEmpleados empleados; // Un vector de empleados
	private JMenuBar barraMenu; // Una barra de menú principal
	private JMenu menuOpciones; /* Un menú de la barra de menú principal */
	private JMenuItem itemMenu1; // Un ítem de menú
	private JMenuItem itemMenu2; // Un ítem de menú
	private JMenuItem itemMenu3; // Un ítem de menú

	/**
	 * Constructor de la clase VentanaPrincipal
	 */

	public VentanaPrincipal() {
		empleados = new ListaEmpleados(); // Se crea la lista de empleados
		inicio();
		setTitle("Nómina"); // Establece el título de la ventana
		setSize(280, 380); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
		// Establece que el botón de cerrar permitirá salir de la aplicación
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); /* Establece que el tamaño de la ventana no puede cambiar */
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	public void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);

		// Se crea la barra de menús, un menú y tres ítems de menú
		barraMenu = new JMenuBar();
		menuOpciones = new JMenu("Menú");
		itemMenu1 = new JMenuItem("Agregar empleado");
		itemMenu2 = new JMenuItem("Calcular nómina");
		itemMenu3 = new JMenuItem("Guardar archivo");

		menuOpciones.add(itemMenu1);
		menuOpciones.add(itemMenu2);
		menuOpciones.add(new JSeparator());
		menuOpciones.add(itemMenu3);
		barraMenu.add(menuOpciones);
		setJMenuBar(barraMenu); // Se agrega el menú a la ventana
		/*
		 * Agrega al ítem de menú un ActionListener para que gestione eventos del ítem
		 * de menú
		 */
		itemMenu1.addActionListener(this);
		itemMenu2.addActionListener(this);
		itemMenu3.addActionListener(this);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal throws
	 * Exception Excepción en la creación o escritura del archivo
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == itemMenu1) { /* Se selecciona el ítem de menú 1 */

			// Se crea la ventana de agregar empleado
			VentanaAgregarEmpleado ventanaAgregar = new VentanaAgregarEmpleado(empleados);
			ventanaAgregar.setVisible(true); // Se hace visible la ventana
		}

		if (evento.getSource() == itemMenu2) { /* Se selecciona el ítem de menú 2 */
			// Se crea la ventana de nómina
			VentanaNomina ventanaNomina = new VentanaNomina(empleados);
			ventanaNomina.setVisible(true); // Se hace visible la ventana
		}

		if (evento.getSource() == itemMenu3) { /* Se selecciona el ítem de menú 3 */
			JFileChooser fc = new JFileChooser(); /* Crea un selector de archivo */
			fc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
			// Es un selector de directorio
			int respuesta = fc.showOpenDialog(this); /* Se muestra el selector de directorio en pantalla */
			if (respuesta == JFileChooser.APPROVE_OPTION) { /* Si se pulsa aceptar en el selector */
				File directorioElegido = fc.getSelectedFile(); /* Se obtiene el directorio seleccionado */
				String nombre = directorioElegido.getName(); /* Se obtiene el nombre del directorio */
				try {
					// Convierte los datos de los empleados en texto
					String contenido = empleados.convertirTexto();
					// Se asigna el nombre del archivo de texto
					File file = new File(nombre + "\\" + "nomina.txt");
					file.createNewFile(); // Se crea el archivo de texto
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw); /* Se crea el flujo de escritura de datos */
					bw.write(contenido); /* Se escriben los datos en el archivo */
					bw.close(); // Se cierra el archivo
					String texto = "El archivo de la nómina nomina.txt se ha creado en " + nombre;
					// Mensaje de confirmación
					JOptionPane.showMessageDialog(this, texto, "Mensaje", JOptionPane.INFORMATION_MESSAGE, null);
				} catch (Exception e) {
					/*
					 * En caso que se presente una excepción en la creación y escritura del archivo
					 */
					e.printStackTrace();
				}
			}
		}
	}
}