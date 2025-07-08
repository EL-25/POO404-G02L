//Ejercicio Complementario 4 (Guia2)

import javax.swing.*;
import java.util.HashMap;

public class AplicaciónHashMap {
    public static void main(String[] args) {
        HashMap<String, String> estudiantes = new HashMap<>();

        String menu = """
            ==== MENÚ DE OPCIONES ====
            1. Ingreso de estudiante
            2. Ver estudiantes
            3. Buscar estudiante
            4. Salir
            5. Editar nombre de estudiante
            6. Eliminar estudiante
            -----------------------------
            Elige una opción (1-6):
            """;

        while (true) {
            String opcion = JOptionPane.showInputDialog(menu);
            if (opcion == null) break;

            switch (opcion) {
                case "1" -> {
                    String carnet = JOptionPane.showInputDialog("Ingrese el CARNET del estudiante:");
                    if (estudiantes.containsKey(carnet)) {
                        JOptionPane.showMessageDialog(null, "⚠️ Este carnet ya existe.");
                        break;
                    }
                    String nombre = JOptionPane.showInputDialog("Ingrese el NOMBRE del estudiante:");
                    estudiantes.put(carnet, nombre);
                    JOptionPane.showMessageDialog(null, "✅ Estudiante registrado con éxito.");
                }

                case "2" -> {
                    if (estudiantes.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "📭 No hay estudiantes registrados.");
                    } else {
                        StringBuilder lista = new StringBuilder("📋 Lista de Estudiantes:\n\n");
                        estudiantes.forEach((carnet, nombre) ->
                                lista.append("🎓 ").append(nombre).append(" - ").append(carnet).append("\n"));
                        JOptionPane.showMessageDialog(null, lista.toString());
                    }
                }

                case "3" -> {
                    String buscado = JOptionPane.showInputDialog("Ingrese el CARNET a buscar:");
                    if (estudiantes.containsKey(buscado)) {
                        JOptionPane.showMessageDialog(null,
                                "🔍 Estudiante encontrado:\nNombre: " +
                                        estudiantes.get(buscado) + "\nCarnet: " + buscado);
                    } else {
                        JOptionPane.showMessageDialog(null, "❌ Estudiante no encontrado.");
                    }
                }

                case "4" -> {
                    JOptionPane.showMessageDialog(null, "👋 ¡Gracias por usar el gestor de POO!");
                    System.exit(0);
                }

                case "5" -> {
                    String carnet = JOptionPane.showInputDialog("Ingrese el CARNET del estudiante a editar:");
                    if (estudiantes.containsKey(carnet)) {
                        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre:");
                        estudiantes.put(carnet, nuevoNombre);
                        JOptionPane.showMessageDialog(null, "✅ Nombre actualizado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "❌ Carnet no encontrado.");
                    }
                }

                case "6" -> {
                    String carnet = JOptionPane.showInputDialog("Ingrese el CARNET del estudiante a eliminar:");
                    if (estudiantes.containsKey(carnet)) {
                        estudiantes.remove(carnet);
                        JOptionPane.showMessageDialog(null, "🗑 Estudiante eliminado con éxito.");
                    } else {
                        JOptionPane.showMessageDialog(null, "❌ Carnet no encontrado.");
                    }
                }

                default -> {
                    JOptionPane.showMessageDialog(null, "⚠️ Opción no válida. Intente de nuevo.");
                }
            }
        }
    }
}

