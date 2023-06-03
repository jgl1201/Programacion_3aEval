package Ventanas_83;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class VentanaPrincipal extends JFrame implements ActionListener {
	private Container contenedor;
	private JButton cilindro, piramide, esfera;
	
	public VentanaPrincipal() {
		inicio();
		setTitle("Principal");
		setSize(240, 200);
		setLocationRelativeTo(null);
		setResizable(false);
	}
	
	private void inicio() {
		contenedor = getContentPane();
		contenedor.setLayout(null);
		
		cilindro = new JButton();		
		cilindro.setText("CILINDRO");
		cilindro.addActionListener(this);
		cilindro.setBounds(20, 20, 135, 23);
		
		piramide = new JButton();
		piramide.setText("PIRAMIDE");
		piramide.addActionListener(this);
		piramide.setBounds(20, 70, 135, 23);
		
		esfera = new JButton();
		esfera.setText("ESFERA");
		esfera.addActionListener(this);
		esfera.setBounds(20, 120, 135, 23);
		
		contenedor.add(cilindro);
		contenedor.add(piramide);
		contenedor.add(esfera);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == cilindro) {
			VentanaCilindro vc = new VentanaCilindro();
			vc.setVisible(true);
		}
		if (event.getSource() == piramide) {
			VentanaPiramide vp = new VentanaPiramide();
			vp.setVisible(true);
		}
		if (event.getSource() == esfera) {
			VentanaEsfera ve = new VentanaEsfera();
			ve.setVisible(true);
		}
	}
}
