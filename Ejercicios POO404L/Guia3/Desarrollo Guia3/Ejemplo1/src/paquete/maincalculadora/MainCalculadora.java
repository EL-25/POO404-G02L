package paquete.maincalculadora;

import paquete.calculadora.Calculadora;
import javax.swing.JOptionPane;

public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        String operacion = JOptionPane.showInputDialog(
                "Seleccione la operación:\n" +
                        "+ para suma\n" +
                        "- para resta\n" +
                        "* para multiplicación\n" +
                        "/ para división\n" +
                        "^ para potencia\n" +
                        "! para factorial\n" +
                        "~ para opuesto"
        );

        double resultado = 0;

        switch (operacion) {
            case "+":
                double suma1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                double suma2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                resultado = calc.sumar(suma1, suma2);
                break;

            case "-":
                double resta1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                double resta2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                resultado = calc.restar(resta1, resta2);
                break;

            case "*":
                double multi1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                double multi2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                resultado = calc.multiplicar(multi1, multi2);
                break;

            case "/":
                double div1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer número"));
                double div2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo número"));
                resultado = calc.dividir(div1, div2);
                break;

            case "^":
                double base = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la base"));
                double exponente = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exponente"));
                resultado = calc.potencia(base, exponente);
                break;

            case "!":
                int n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número entero positivo"));
                long res = calc.factorial(n);
                JOptionPane.showMessageDialog(null, "Resultado: " + res);
                return;

            case "~":
                double num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el número"));
                resultado = calc.opuesto(num);
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operación inválida.");
                return;
        }

        JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
    }
}
