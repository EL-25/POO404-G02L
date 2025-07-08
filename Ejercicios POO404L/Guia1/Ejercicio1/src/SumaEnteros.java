//Este es el ejericio 3 ya modificado como dice el primer punto de los ejercicicios complementarios de la guia1.

import javax.swing.JOptionPane;

public class SumaEnteros {
    public static void main(String[] args) {
        String primernumero;
        String segundonumero;
        int numero1;
        int numero2;

        primernumero = JOptionPane.showInputDialog("Digite el primer número:");
        segundonumero = JOptionPane.showInputDialog("Digite el segundo número:");

        numero1 = Integer.parseInt(primernumero);
        numero2 = Integer.parseInt(segundonumero);

        if (numero1 < 0 || numero2 < 0) {
            JOptionPane.showMessageDialog(null, "No se permiten números negativos.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            int suma = numero1 + numero2;
            JOptionPane.showMessageDialog(null, "La suma es: " + suma, "Resultado", JOptionPane.PLAIN_MESSAGE);
        }

        System.exit(0);
    }
}
