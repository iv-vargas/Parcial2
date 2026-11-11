package presentacion;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;


import logica.Parcial;

public class FPrincipal extends JFrame implements ActionListener {
	private JLabel lResultado;
	private JButton bCalcular = new JButton("Calcular");	
	private JTextField tA;  
    private JTextField tB;
    private JTextField tC;
    private Parcial parcial;
	
	
	
	
	public FPrincipal() {
		this.parcial=new Parcial();
		this.setLayout(new BorderLayout());
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    Dimension pantalla = Toolkit.getDefaultToolkit().getScreenSize();
		this.setTitle("Parcial2");		
		this.setBounds((int)pantalla.getWidth()/2 - 200, (int)pantalla.getHeight()/2 - 300, 400, 600);
		
		
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(4, 2, 10, 10));
		
		tA = new JTextField();
		tB = new JTextField();
		tC = new JTextField();
		bCalcular = new JButton("Calcular");
		lResultado = new JLabel("");

		mainPanel.add(new JLabel("a:", SwingConstants.RIGHT));
		mainPanel.add(tA);
		mainPanel.add(new JLabel("b:", SwingConstants.RIGHT));
		mainPanel.add(tB);
		mainPanel.add(new JLabel("c:", SwingConstants.RIGHT));
		mainPanel.add(tC);
		mainPanel.add(bCalcular);
		mainPanel.add(lResultado);

		bCalcular.addActionListener(this);
		
		this.add(mainPanel, BorderLayout.CENTER);
		
		this.setVisible(true);
	}
	
	
	
	
	
	public static void main(String[] args) {
		new FPrincipal();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
	    try {
	        double a = Double.parseDouble(this.tA.getText());
	        double b = Double.parseDouble(this.tB.getText());
	        double c = Double.parseDouble(this.tC.getText());

	        String respuesta = this.parcial.hallarRaices(a, b, c);
	        this.lResultado.setText(respuesta);
	    } catch (Exception ex) {
	        JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
	    }
	}

}
