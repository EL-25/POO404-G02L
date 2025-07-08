import java.util.*;

public class LecturaConsola {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        String nombre = "";
        int edad;

        System.out.print("Ingrese su nombre: ");
        nombre = reader.nextLine();

        System.out.print("Ingrese su edad: ");
        edad = reader.nextInt();

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
