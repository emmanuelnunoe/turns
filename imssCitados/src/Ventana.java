
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.KeyStroke;
public class Ventana extends JFrame  {

	
	boolean inAnApplet = true;

	public Ventana() {
	//Ejecuta la Ventana en modo maximizado (fullscreen)
        this.setExtendedState(MAXIMIZED_BOTH);
    //Elimina los bordes de la Ventana
        //this.setUndecorated(true);
		
	   	//asigna titulo al frame y da formato al titulo
		  JLabel titulo = new JLabel("IMSS");
		  Font negrita = new Font("Arial",Font.BOLD, 500); 
		  titulo.setFont(negrita);
		  titulo.getInputMap().put(KeyStroke.getKeyStroke("F2"),
                 "imprimeAlgo");
		  
		  
		  this.add(titulo);
	

	//termina el proceso cuando se cierra la ventana.
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	

	
	
	}//fin de la clase


	
	




