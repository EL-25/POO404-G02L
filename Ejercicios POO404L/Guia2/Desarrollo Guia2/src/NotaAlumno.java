//Ejercicio Complementario 1 (Guia2)

import javax.swing.JOptionPane;

public class NotaAlumno {
    public static void main(String[] args) {
        // Captura de nota
        String entrada = JOptionPane.showInputDialog("Ingrese la nota del alumno:");
        double nota = Double.parseDouble(entrada);

        String mensaje;

        if (nota >= 7.0) {
            mensaje = "¡Aprobado! 🎉";
        } else if (nota >= 6.5 && nota <= 6.99) {
            mensaje = "Tiene derecho a realizar un examen de suficiencia.";
        } else {
            mensaje = "Reprobado. 😔";
        }

        // Mostrar resultado
        JOptionPane.showMessageDialog(
                null,
                mensaje,
                "Resultado de Evaluación",
                JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}

