//Ejercicio complementario punto 2 (Crear un programa en java que solicite la información básica)

import java.util.Scanner;

public class InformaciónBasica {
    public static void main(String[] args) {
        // Crear objeto Scanner para leer datos desde el teclado
        Scanner entrada = new Scanner(System.in);

        // Declaración de variables
        String nombres;
        String apellidos;
        int edad;
        String carrera;

        // Solicitar los datos al usuario
        System.out.print("Ingrese sus nombres: ");
        nombres = entrada.nextLine();

        System.out.print("Ingrese sus apellidos: ");
        apellidos = entrada.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = entrada.nextInt();
        entrada.nextLine(); // Limpiar el buffer antes de leer la siguiente cadena

        System.out.print("Ingrese su carrera: ");
        carrera = entrada.nextLine();

        // Mostrar la información en consola
        System.out.println("\n=== Información Registrada ===");
        System.out.println("Nombres: " + nombres);
        System.out.println("Apellidos: " + apellidos);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);

        entrada.close();
    }
}

