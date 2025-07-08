import javax.swing.JOptionPane;

public class CuadroDialog1 {
    public static void main(String[] args) {
        while (true) {
            try {
                String nombre = JOptionPane.showInputDialog("¿Cómo te llamas?");
                String entrada = JOptionPane.showInputDialog("¿Cuántos años tienes?");
                int edad = Integer.parseInt(entrada);

                JOptionPane.showMessageDialog(
                        null,
                        "Hola, " + nombre + ". El año que viene tendrás " + (edad + 1) + " años.",
                        "Resultado",
                        JOptionPane.INFORMATION_MESSAGE
                );
            } catch (Exception e) {
                System.out.println("Error en algún dato de entrada.");

                JOptionPane.showMessageDialog(
                        null,
                        "Error en algún dato de entrada",
                        "Error",
                        JOptionPane.ERROR_MESSAGE
                );

                String seleccion = (String) JOptionPane.showInputDialog(
                        null,
                        "¿Desea salir?",
                        "Seleccione una opción",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        new Object[] { "Si", "No" },
                        "No"
                );

                if (seleccion != null && seleccion.equals("Si")) {
                    break;
                }
            }
        }
        System.exit(0);
    }
}
