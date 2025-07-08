//Este ejercicio ya esta modificado como pide el punto 4 de los ejercicios complementarios
//de la guia1

public class LecturaParametros {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Error: Debes ingresar al menos dos parámetros.");
        } else {
            System.out.println("Parametro 1: " + args[0]);
            System.out.println("Parametro 2: " + args[1]);
        }
    }
}
