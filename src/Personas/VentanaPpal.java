package Personas;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;


@SuppressWarnings({ "serial", "rawtypes", "unchecked" })
public class VentanaPpal extends JFrame implements ActionListener {

	private PersonaLista lista; // El objeto ListaPersonas de la aplicación
	private Container contenedor; /* Un contenedor de elementos gráficos */
	// Etiquetas estáticas para los nombres de los atributos
	private JLabel nombre, apellidos, teléfono, dirección;
	// Campos de ingreso de texto
	private JTextField campoNombre, campoApellidos, campoTeléfono, campoDirección;
	private JButton anadir, eliminar, borrarLista, guardar; // Botones
	private JList listaNombres; // Lista de personas
	private DefaultListModel modelo; // Objeto que modela la lista
	private JScrollPane scrollLista; // Barra de desplazamiento vertical

	/**
	 * Constructor de la clase VentanaPrincipal
	 */
	public VentanaPpal() {
		lista = new PersonaLista(); // Crea la lista de personas
		inicio();
		setTitle("Personas"); // Establece el título de la ventana
		setSize(470, 350); // Establece el tamaño de la ventana
		setLocationRelativeTo(null); /* La ventana se posiciona en el centro de la pantalla */
		// Establece que el botón de cerrar permitirá salir de la aplicación
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false); /* Establece que el tamaño de la ventana no se puede cambiar */
	}

	/**
	 * Método que crea la ventana con sus diferentes componentes gráficos
	 */
	private void inicio() {
		contenedor = getContentPane(); /*
										 * Obtiene el panel de contenidos de la ventana
										 */
		contenedor.setLayout(null); /* Establece que el panel no tiene asociado ningún layout */
		// Establece la etiqueta y el campo nombre
		nombre = new JLabel();
		nombre.setText("Nombre:");
		nombre.setBounds(20, 20, 135, 23); /* Establece la posición de la etiqueta nombre */
		campoNombre = new JTextField();
		// Establece la posición del campo de texto nombre
		campoNombre.setBounds(105, 20, 135, 23);
		// Establece la etiqueta y el campo apellidos
		apellidos = new JLabel();
		apellidos.setText("Apellidos:"); /* Establece la posición de la etiqueta apellidos */
		apellidos.setBounds(20, 50, 135, 23);
		campoApellidos = new JTextField();
		// Establece la posición del campo de texto apellidos
		campoApellidos.setBounds(105, 50, 135, 23);

		// Establece la etiqueta y el campo teléfono
		teléfono = new JLabel();
		teléfono.setText("Teléfono:");
		teléfono.setBounds(20, 80, 135, 23); /* Establece la posición de la etiqueta teléfono */
		campoTeléfono = new JTextField();
		// Establece la posición del campo de texto teléfono
		campoTeléfono.setBounds(105, 80, 135, 23);
		// Establece la etiqueta y el campo dirección
		dirección = new JLabel();
		dirección.setText("Dirección:");
		dirección.setBounds(20, 110, 135, 23); /* Establece la posición de la etiqueta dirección */
		campoDirección = new JTextField();
		// Establece la posición del campo de texto dirección
		campoDirección.setBounds(105, 110, 135, 23);
		// Establece el botón Añadir persona
		anadir = new JButton();
		anadir.setText("Añadir");
		anadir.setBounds(105, 150, 80, 23); /* Establece la posición del botón Añadir persona */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		anadir.addActionListener(this);
		// Establece el botón Eliminar persona
		eliminar = new JButton();
		eliminar.setText("Eliminar");
		eliminar.setBounds(20, 280, 80, 23); /* Establece la posición del botón Eliminar persona */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		eliminar.addActionListener(this);
		// Establece el botón Borrar lista
		borrarLista = new JButton();
		borrarLista.setText("Borrar Lista");
		borrarLista.setBounds(120, 280, 120, 23); /* Establece la posición del botón Borrar lista */
		/* Agrega al botón un ActionListener para que gestione eventos del botón */
		borrarLista.addActionListener(this);

		guardar = new JButton();
		guardar.setText("Guardar");
		guardar.setBounds(250, 280, 120, 23);
		guardar.addActionListener(this);

		// Establece la lista gráfica de personas
		listaNombres = new JList();
		/* Establece que se pueda seleccionar solamente un elemento de la lista */
		listaNombres.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		
		modelo = new DefaultListModel();
		
		lista = poblarLista();
		
		// Poblar el JList con los elementos de la lista de personas
		for (Persona persona : lista.listaPersonas) {
		    String elemento = persona.getNombre() + " " + persona.getApellidos() + " " +
		                      persona.telefono + " " + persona.direccion;
		    modelo.addElement(elemento);
		}
		// Asignar el modelo al JList
		listaNombres.setModel(modelo);

		
		// Establece una barra de desplazamiento vertical
		scrollLista = new JScrollPane();
		// Establece la posición de la barra de desplazamiento vertical
		scrollLista.setBounds(20, 190, 220, 80);
		// Asocia la barra de desplazamiento vertical a la lista de personas
		scrollLista.setViewportView(listaNombres);
	
		// Se añade cada componente gráfico al contenedor de la ventana
		contenedor.add(nombre);
		contenedor.add(campoNombre);
		contenedor.add(apellidos);
		contenedor.add(campoApellidos);
		contenedor.add(teléfono);
		contenedor.add(campoTeléfono);
		contenedor.add(dirección);
		contenedor.add(campoDirección);
		contenedor.add(anadir);
		contenedor.add(eliminar);
		contenedor.add(borrarLista);
		contenedor.add(guardar);
		contenedor.add(scrollLista);
	}

	/**
	 * Método que gestiona los eventos generados en la ventana principal
	 */
	@Override
	public void actionPerformed(ActionEvent evento) {
		if (evento.getSource() == anadir) { // Si se pulsa el botón añadir
			añadirPersona(); // Se invoca añadir persona
		}
		if (evento.getSource() == eliminar) {
			/*
			 * Si se pulsa el botón eliminar Se invoca el método eliminarNombre que elimina
			 * el elemento seleccionado
			 */
			eliminarNombre(listaNombres.getSelectedIndex());
		}
		if (evento.getSource() == borrarLista) {
			/* Si se pulsa el botón borrar lista */
			borrarLista(); // Se invoca borrar lista
		}
		if (evento.getSource() == guardar) {
			guardarLista();
		}
	}

	/**
	 * Método que agrega una persona al vector de personas y a la lista gráfica de
	 * personas
	 */
	private void añadirPersona() {
		/* Se obtienen los campos de texto ingresados y se crea una persona */
		Persona p = new Persona(campoNombre.getText(), campoApellidos.getText(), campoTeléfono.getText(),
				campoDirección.getText());
		lista.addPersona(p); /* Se añade una persona al vector de personas */
		String elemento = campoNombre.getText() + " " + campoApellidos.getText() + " " + campoTeléfono.getText() + " "
				+ campoDirección.getText();
		modelo.addElement(elemento);
		/* Se agrega el texto con los datos de la persona al JList */
		listaNombres.setModel(modelo);
		// Se colocan todos los campos de texto nulos
		campoNombre.setText("");
		campoApellidos.setText("");
		campoTeléfono.setText("");
		campoDirección.setText("");
	}

	/**
	 * Método que elimina una persona del vector de personas y de la lista gráfica
	 * de personas en la ventana
	 * 
	 * @param indice Parámetro que define la posición de la persona a eliminar
	 */
	private void eliminarNombre(int indice) {
		if (indice >= 0) { // Si la posición existe
			modelo.removeElementAt(indice); /* Se elimina la persona seleccionada de la lista gráfica */
			lista.eliminarPersona(indice); /* Se elimina la persona seleccionada del vector de personas */
		} else { /* Si no se seleccionó ninguna persona, se genera un mensaje de error */
			JOptionPane.showMessageDialog(null, "Debe seleccionar un elemento", "Error", JOptionPane.ERROR_MESSAGE);
		}
	}

	/**
	 * Método que elimina todas las personas del vector de personas
	 */
	private void borrarLista() {
		lista.borrarLista(); // Se eliminan todas las personas del vector
		modelo.clear(); // Limpia el JList, la lista gráfica de personas
	}

	private void guardarLista() {
		// lista ---> escribir en fichero
		try {
			ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("lista.dat"));
			escribiendoFichero.writeObject(lista);
			escribiendoFichero.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private PersonaLista poblarLista() {
		PersonaLista aux;
		try {
			ObjectInputStream leyendoFichero = new ObjectInputStream(new FileInputStream("lista.dat"));
			aux = (PersonaLista) leyendoFichero.readObject();
			leyendoFichero.close();
			return aux;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}