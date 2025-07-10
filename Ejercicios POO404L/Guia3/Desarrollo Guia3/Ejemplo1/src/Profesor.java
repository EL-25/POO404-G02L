import javax.swing.JOptionPane;

public class Profesor extends Empleado {
    int sueldo;

    public void mostrar2() {
        mostrarDatos(); // Método heredado de Empleado
        JOptionPane.showMessageDialog(null, "Sueldo: " + sueldo);
    }

    public void ingreso2() {
        ingresoDatos(); // Método heredado de Empleado
        String s = JOptionPane.showInputDialog("Ingrese el sueldo");
        sueldo = Integer.parseInt(s);
    }
}
