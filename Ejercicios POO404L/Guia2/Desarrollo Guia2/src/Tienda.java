//Ejercicio Complementario 2 (Guia2)

import javax.swing.JOptionPane;

public class Tienda {
    public static void main(String[] args) {
        // Capturar el monto de la compra
        String entradaMonto = JOptionPane.showInputDialog("Ingrese el monto de su compra:");
        double monto = Double.parseDouble(entradaMonto);

        // Seleccionar el color de la bolita
        String color = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione el color de la bolita que ha sacado:",
                "Color de la Bolita",
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[] { "Roja", "Verde", "Blanca" },
                "Blanca"
        );

        double descuento = 0;

        // Evaluar color y aplicar descuento
        if (color.equals("Roja")) {
            descuento = monto * 0.10;
        } else if (color.equals("Verde")) {
            descuento = monto * 0.05;
        } // Si es blanca, el descuento queda en 0

        double totalPagar = monto - descuento;

        // Mensaje final
        String mensaje = "";
        if (color.equals("Blanca")) {
            mensaje = "Gracias por participar. No se aplicó descuento.\nTotal a pagar: $" + totalPagar;
        } else {
            mensaje = "Se ha aplicado un descuento de $" + descuento + " por bolita " + color.toLowerCase() +
                    "\nTotal a pagar: $" + totalPagar;
        }

        JOptionPane.showMessageDialog(null, mensaje, "Detalle de la Compra", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}


