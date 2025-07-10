// PruebaTiempo1.java
// Clase PruebaTiempo1 que utiliza la clase Tiempo1

import javax.swing.JOptionPane;
public class PruebaTiempo1 {
    public static void main(String args[]) {
        Tiempo1 tiempo = new Tiempo1(); // llamar al constructor de Tiempo1

        // Anexar versión String de tiempo a salida String
        String salida = "La hora universal inicial es: " +
                tiempo.aStringUniversal() + "\nLa hora estándar inicial es: " +
                tiempo.aStringEstandar();

        // Cambiar tiempo y anexar hora actualizada a salida
        tiempo.establecerHora(13, 27, 6);
        salida += "\n\nLa hora universal después de establecerHora es: " +
                tiempo.aStringUniversal() +
                "\nLa hora estándar después de establecerHora es: " +
                tiempo.aStringEstandar();

        // Establecer tiempo con valores inválidos; anexar hora actualizada a salida
        tiempo.establecerHora(99, 99, 99);
        salida += "\n\nDespués de intentar ajustes inválidos: " +
                "\nHora universal: " + tiempo.aStringUniversal() +
                "\nHora estándar: " + tiempo.aStringEstandar();

        JOptionPane.showMessageDialog(null, salida,
                "Prueba de la clase Tiempo1", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}
