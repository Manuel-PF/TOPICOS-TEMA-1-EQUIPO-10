
package GUI;

import javax.swing.JFrame;


public class Gui1 extends JFrame{
    //constantes y componentes(objeto)
    public Gui1(){
        super("Ventana usando Herencia"); // Establece titulo a la ventana
        setSize(370,450);//Establece tamaño de la ventana
        setLocationRelativeTo(null);/* La ventana se posiciona en el centro de la pantalla*/
        //Establece que el boton de cerrar permitira salir de la aplicacion
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);/*Establece que el tamaño de la ventana no
        se puede cambiar*/
        setVisible(true);
        
    }
}
