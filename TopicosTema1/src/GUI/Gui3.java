
package GUI;

import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Gui3 extends JFrame{
    //constantes y componentes(Objeto)
    private Container panel;
    private JButton miboton;
    public Gui3(){
        super("Ventana/Herencia");//Establece el titulo de la ventana
        //Configura componentes;
        miboton = new JButton("Aceptar");
        panel = getContentPane();
        panel.add(miboton);
        setSize(200,200);// Establece el tamaño de la ventana
        setLocationRelativeTo(null);/*La ventana se posiciona en el centro de la pantalla*/
        //Establece que el Boton de cerrar permitira salir de la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);/* Establece que el tamaño de la ventana no se puede cambiar*/
        setVisible(true);
        
    }
    
}
