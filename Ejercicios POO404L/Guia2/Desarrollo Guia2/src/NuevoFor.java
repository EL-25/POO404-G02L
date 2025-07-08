public class NuevoFor {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int Suma = 0;

        // for clásico
        for (int indice = 0; indice < 10; indice++) {
            Suma = Suma + Numero[indice];
        }

        System.out.println("Total con for clásico: " + Suma);

        Suma = 0;
        System.out.println("Suma reinicializada vale: " + Suma);

        // for mejorado (for-each)
        for (int valor : Numero) {
            Suma += valor;
        }

        System.out.println("Total con for mejorado: " + Suma);
    }
}
