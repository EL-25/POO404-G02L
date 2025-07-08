import javax.swing.JOptionPane;

public class TiposIcono {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Mensaje con ícono de información
        JOptionPane.showMessageDialog(
                null,
                "Información",
                "Mensaje de Información",
                JOptionPane.INFORMATION_MESSAGE
        );

        // Mensaje con ícono de advertencia
        JOptionPane.showMessageDialog(
                null,
                "Advertencia",
                "Mensaje de Advertencia",
                JOptionPane.WARNING_MESSAGE
        );

        // Mensaje con ícono de error
        JOptionPane.showMessageDialog(
                null,
                "Error",
                "Mensaje de Error",
                JOptionPane.ERROR_MESSAGE
        );

        // Mensaje sin ícono (texto plano)
        JOptionPane.showMessageDialog(
                null,
                "Sin Icono",
                "Mensaje de Texto Plano",
                JOptionPane.PLAIN_MESSAGE
        );
    }
}
