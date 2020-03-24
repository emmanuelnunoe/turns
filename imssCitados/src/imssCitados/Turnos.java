package imssCitados;
import java.awt.*;

import javax.swing.JTabbedPane;

public class Turnos {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crar nueva ventana
			
			Ventana ventana = new Ventana();
			ventana.inAnApplet=false;
			ventana.pack();
			ventana.setVisible(true);
	
	}
	
	 /*private JButton getbAceptar() {
		  bAceptar = new JButton("Aceptar");
		  bAceptar.addKeyListener(this);
		  bAceptar.setBounds(10, 10, 100, 20);
		  return bAceptar;
		 }

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
        int key = e.getKeyCode();
		
		if( key == KeyEvent.VK_ENTER) {
			System.out.println("Presiono Enter");
		}
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Soltó una tecla");

		
	}*/
	

}
