//Ejercicio Complementario 3 (Guia2)

import javax.swing.JOptionPane;

public class NumeroEmpleados {
    public static void main(String[] args) {
        // Pedir el número de empleados
        String entrada = JOptionPane.showInputDialog("¿Cuántos empleados desea registrar?");
        int cantidad = Integer.parseInt(entrada);

        double[] sueldos = new double[cantidad];
        double sumaTotal = 0;

        for (int i = 0; i < cantidad; i++) {
            double sueldo = -1;
            // Repetir mientras el sueldo sea negativo
            while (sueldo < 0) {
                String sueldoStr = JOptionPane.showInputDialog("Ingrese el sueldo del empleado #" + (i + 1));
                sueldo = Double.parseDouble(sueldoStr);

                if (sueldo < 0) {
                    JOptionPane.showMessageDialog(null, "Error: No se permiten sueldos negativos. Intente de nuevo.");
                }
            }

            sueldos[i] = sueldo;
            sumaTotal += sueldo;
        }

        // Mostrar resultados
        JOptionPane.showMessageDialog(null,
                "Se ingresaron " + cantidad + " empleados.\n" +
                        "Suma total de sueldos: $" + sumaTotal,
                "Resultado Final",
                JOptionPane.INFORMATION_MESSAGE
        );

        System.exit(0);
    }
}

