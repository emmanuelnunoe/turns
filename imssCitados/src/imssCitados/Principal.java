package imssCitados;

import javax.swing.JLabel;

public class Principal {

    public static void main(String[] args) {
    //crar nueva ventana

        Turnos turnos = new Turnos();
        JLabel iniciar = new JLabel();
        iniciar.setText("0");
        turnos.setConteoLabel(iniciar);
        

    }
    
}