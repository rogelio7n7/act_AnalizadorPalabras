package polindromo;

//import java.awt.*;
import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
//import javax.swing.table.DefaultTableModel;

public class Polindromo extends JFrame implements ActionListener
{
	JFrame window;
	JTextField cajaPalabra;
	
	public Polindromo()
	{
		window = new JFrame();
		
		window.setTitle("Polindromo");
		window.setSize(300, 400);
		window.setVisible(true);
		window.setLocationRelativeTo(null);
		
		addOptions();
	}
	
	public void addOptions()
	{
		JButton botonVerificar = new JButton();
		
		botonVerificar.setText("Verificar");
		botonVerificar.setBounds(60, 40 , 175, 25);
		botonVerificar.addActionListener(this);
		window.add(botonVerificar);
		
		JLabel palabraTexto = new JLabel();
		JLabel polindromoTexto = new JLabel();
		JLabel logitudTexto = new JLabel();
		JLabel inversaTexto = new JLabel();
		
		palabraTexto.setText("Palabra: ");
		palabraTexto.setBounds(10, 10, 50, 25);
		palabraTexto.setForeground(Color.BLACK);
    	window.add(palabraTexto);
    	
    	polindromoTexto.setText("Polindromo: ");
    	polindromoTexto.setBounds(10, 80, 80, 25);
    	polindromoTexto.setForeground(Color.BLACK);
    	window.add(polindromoTexto);
    	
    	logitudTexto.setText("Longitud: ");
    	logitudTexto.setBounds(10, 120, 80, 25);
    	logitudTexto.setForeground(Color.BLACK);
    	window.add(logitudTexto);
    	
    	inversaTexto.setText("Inversa: ");
    	inversaTexto.setBounds(10, 160, 80, 25);
    	inversaTexto.setForeground(Color.BLACK);
    	window.add(inversaTexto);
    	
    	cajaPalabra = new JTextField();
    	
    	cajaPalabra.setBounds(60, 10, 175, 25);
    	window.add(cajaPalabra);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String palabra = cajaPalabra.getText();
		String palabraAlrevez="";

		JTextField polindromoResultado = new JTextField();
		JTextField longitudResultado = new JTextField();
		JTextField inversaResulta = new JTextField();

    	String longitudPalabra = Integer.toString(palabra.length());
    	
        longitudResultado.setText(longitudPalabra);
        //System.out.println(longitudPalabra);
    	longitudResultado.setBounds(100, 120, 80, 25);
    	longitudResultado.setForeground(Color.BLACK);
    	window.add(longitudResultado);
    	
        for (int x=palabra.length()-1;x>=0;x--)
        	palabraAlrevez = palabraAlrevez + palabra.charAt(x);

        inversaResulta.setText(palabraAlrevez);
        //System.out.println(palabraAlrevez);
    	inversaResulta.setBounds(100, 160, 80, 25);
    	inversaResulta.setForeground(Color.BLACK);
    	window.add(inversaResulta);
        
        palabra=palabra.replace(" ","").toUpperCase();
        palabraAlrevez=palabraAlrevez.replace(" ","").toUpperCase();
        
        if(palabraAlrevez.equals(palabra))
        {
        	polindromoResultado.setText("true");
        	//System.out.println("true");
        	polindromoResultado.setForeground(Color.GREEN);
        }
        else
        {
        	polindromoResultado.setText("false");
        	//System.out.println("false");
        	polindromoResultado.setForeground(Color.RED);
		}
        polindromoResultado.setBounds(100, 80, 160, 25);
		
    	window.add(polindromoResultado);
	}
	
	public static void main(String[] args)
	{
		new Polindromo();
	}

	
}
