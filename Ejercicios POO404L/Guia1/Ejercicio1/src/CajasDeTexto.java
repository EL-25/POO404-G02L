import javax.swing.JOptionPane;

public class CajasDeTexto {
    public static void main(String[] args) {
        // Captura de datos usando cuadros de entrada
        String nombres = JOptionPane.showInputDialog("Ingrese sus nombres:");
        String apellidos = JOptionPane.showInputDialog("Ingrese sus apellidos:");
        String edad = JOptionPane.showInputDialog("Ingrese su edad:");
        String carrera = JOptionPane.showInputDialog("Ingrese su carrera:");

        // Construcción del mensaje de salida con saltos de línea
        String mensaje = "=== Información Registrada ===\n";
        mensaje += "Nombres: " + nombres + "\n";
        mensaje += "Apellidos: " + apellidos + "\n";
        mensaje += "Edad: " + edad + "\n";
        mensaje += "Carrera: " + carrera;

        // Impresión del mensaje en una sola caja de diálogo
        JOptionPane.showMessageDialog(null, mensaje, "Datos Personales", JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);
    }
}

