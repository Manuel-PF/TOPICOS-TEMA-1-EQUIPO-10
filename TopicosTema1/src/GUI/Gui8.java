package GUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JOptionPane;

public class Gui8 extends JFrame implements ActionListener {

    //Definimos Variables
    private JTextField textfield1;
    private JLabel label1;
    private JButton button1;

    public Gui8() {
        //Configuracion de JFrame
        super("Gui8: Activacion Oyente");// o usar setTitle("Gui8: Activacion Oyente")
        setLayout(null);
        setSize(300, 150);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

/* Etiqueta sirve para escribir texto, adicionalmente puede para mostrar una imagen*/
        label1 = new JLabel("Nombre:");
        label1.setBounds(10, 10, 100, 30);
        add(label1);

       /*Campo de texto */
        textfield1 = new JTextField();
        textfield1.setBounds(80, 10, 150, 30);
        add(textfield1);

     /* Botón de Aceptar, genera un evento(ActionEvent) cuando el usuario hace clic en él y 
       se debe programa para que realice la accion deseada. */
        button1 = new JButton("Saludar");
        button1.setBounds(10, 80, 100, 30);
        add(button1);
 
       /* Activa escuchador del botón */
        button1.addActionListener(this);

        setVisible(true);
    }
/* Método que implementa la acción del botón */
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button1) {
            JOptionPane.showMessageDialog(null, "Hola " + textfield1.getText() + " como estas?");
            //System.out.println("Hola " + textfield1.getText() + " como estas?");
            //Tools.imprimeSalida("Hola " + textfield1.getText() + " como estas?");
        }
    }
}

