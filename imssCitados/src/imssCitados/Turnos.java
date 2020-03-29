package imssCitados;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;
import java.awt.*;



public class Turnos extends JFrame implements KeyListener {

	JLabel conteoLabel = new JLabel("Testlabel");
	int conteoInt = 0;

	public Turnos() {
		super("Sistema de Turnos de Laboratorio");
		setSize(350,100);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(this);
		add(conteoLabel, BorderLayout.WEST);
		setVisible(true);
		setFocusable(true);

	}

	/*---------- CAMBIO DE TURNO ---------- */
	public void siguiente ()
	{
		if( verificaIncremento()) {

			setConteoInt(this.conteoInt++);

		}

	}

	public void anterior ()
	{
		if( verificaDecremento() )
		{
			setConteoInt(conteoInt--);
		} 
	}

	public boolean verificaIncremento()
	{
		if( getConteoInt() < 200 ) {
			return true;
		}

		return false;
		
	}

	public boolean verificaDecremento()
	{
		if( getConteoInt() > 0 ) {
			return true;
		}

		return false;
		
	}



	/*---------- GETTERS AND SETTERS ---------- */

	public JLabel getConteoLabel() {
		return conteoLabel;
	}

	public void setConteoLabel(JLabel conteoLabel) {
		this.conteoLabel = conteoLabel;
	}

	public int getConteoInt() {
		return conteoInt;
	}

	public void setConteoInt(int conteoInt) {
		this.conteoInt = conteoInt;
	}

	/*---------- METODOS INTERFACE ---------- */


	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		 int key = e.getKeyChar();
		 
		if(  key ==  KeyEvent.VK_BACK_SPACE){
			anterior();
			System.out.println("Anterior");

		}
		else if( key == KeyEvent.VK_ENTER)
		{
			siguiente();
			System.out.println("Siguiente");
		}
		else
		{
			// trigger
		}

	}


}
