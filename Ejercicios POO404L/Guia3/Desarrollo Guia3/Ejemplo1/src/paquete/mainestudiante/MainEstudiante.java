package paquete.mainestudiante;

import paquete.estudiante.Estudiante1;

public class MainEstudiante {
    public static void main(String[] args) {
        Estudiante1 alumno = new Estudiante1();  // Datos ingresados por el usuario
        alumno.ingresarMaterias();
        alumno.mostrarInformacion();
    }
}
