package paquete.estudiante;

import javax.swing.JOptionPane;

public class Estudiante1 {
    private String nombre;
    private String apellido;
    private String carnet;
    private String[] materias = new String[5];

    // Constructor que pide los datos personales al usuario
    public Estudiante1() {
        nombre = JOptionPane.showInputDialog("Ingrese el nombre del estudiante");
        apellido = JOptionPane.showInputDialog("Ingrese el apellido del estudiante");
        carnet = JOptionPane.showInputDialog("Ingrese el número de carnet");
    }

    // Método para ingresar las materias
    public void ingresarMaterias() {
        for (int i = 0; i < materias.length; i++) {
            materias[i] = JOptionPane.showInputDialog("Ingrese la materia #" + (i + 1));
        }
    }

    // Método para mostrar toda la información
    public void mostrarInformacion() {
        String info = "Nombre: " + nombre +
                "\nApellido: " + apellido +
                "\nCarnet: " + carnet +
                "\nMaterias:\n";

        for (int i = 0; i < materias.length; i++) {
            info += "- " + materias[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, info, "Datos del Estudiante", JOptionPane.INFORMATION_MESSAGE);
    }
}