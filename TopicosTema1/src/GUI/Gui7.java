
package GUI;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class Gui7 extends JFrame{
    
    //constantes y componentes(objeto)
    public Gui7(){
    super("Ventana/Herencia"); // Establece el titulo de la ventana
    setLayout(new BorderLayout(5,10));
    add(new JButton("1"),BorderLayout.EAST);
    add(new JButton("2"),BorderLayout.SOUTH);
    add(new JButton("3"),BorderLayout.WEST);
    add(new JButton("4"),BorderLayout.NORTH);
    add(new JButton("5"),BorderLayout.CENTER);
    
    setLocationRelativeTo(null);/*La ventana se posiciona en el centro de la pantalla*/
    //Establece que el boton de cerrar permitira salir de la aplicacion
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setResizable(false);//Establece que el tamaño de la ventana no se puede cambiar
    pack(); // presenta una ventana con el tamaño necesario para mostrar los componentes que hay en ella
    setVisible(true);
    }
    
}
