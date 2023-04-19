package EntradaSalida;

import javax.swing.JOptionPane;

public class Tools {
  

    public static String validaName(String msje) {
        String cad;
        boolean band;
        do {
            cad = JOptionPane.showInputDialog(null, msje, "Lectura String", JOptionPane.QUESTION_MESSAGE);
            band = (cad != null && cad.matches("([a-z A-Z]|\\s)+"));
            if (band) {
                return cad;
            } else {
                JOptionPane.showMessageDialog(null, cad + " contiene caracteres no validos");
            }
        } while (!band);

        return cad;
    }

    public static String validaCtrl(String ctrl) {
        String cd;
        boolean bd;
        do {
            cd = JOptionPane.showInputDialog(null, ctrl, "Lectura String", JOptionPane.QUESTION_MESSAGE);
            bd = (cd != null && cd.matches("[0-9]{8}"));
            if (bd) {
                return cd;
            }
            JOptionPane.showMessageDialog((null), ctrl + "Contiene caracteres no validos");
        } while (!bd);

        ctrl = ctrl.trim();
        return cd;
    }

    public static byte validaSemestre() {

        String valores[] = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"};
        return (byte) (JOptionPane.showOptionDialog(null, "Selecciona", "Semestre", JOptionPane.YES_NO_OPTION, JOptionPane.YES_NO_CANCEL_OPTION, null, valores, valores[0])+1 );

    }

    public static byte validaEdad() {
        byte edad;
        do {
            edad = Byte.parseByte(JOptionPane.showInputDialog(null, "Ingresa tu edad"));

            if (edad >= 18 && edad <= 60) {
                return edad;
            } else {
                JOptionPane.showMessageDialog((null), "Ingresa una edad valida");
            }
        } while (true);
    }

}

