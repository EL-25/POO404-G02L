package paquete.calculadora;

public class Calculadora {

    // Operaciones básicas
    public double sumar(double a, double b) {
        return a + b;
    }

    public double restar(double a, double b) {
        return a - b;
    }

    public double multiplicar(double a, double b) {
        return a * b;
    }

    public double dividir(double a, double b) {
        if (b == 0) {
            System.out.println("Error: No se puede dividir entre cero.");
            return 0;
        }
        return a / b;
    }

    // Operaciones avanzadas
    public double potencia(double base, double exponente) {
        return Math.pow(base, exponente);
    }

    public double opuesto(double numero) {
        return -numero;
    }

    public long factorial(int n) {
        if (n < 0) {
            System.out.println("Error: El factorial no está definido para números negativos.");
            return -1;
        }

        long resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }
}
