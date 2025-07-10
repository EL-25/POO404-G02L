// Declaración de la clase Tiempo1 que mantiene la hora en formato de 24 horas.
import java.text.DecimalFormat;

public class Tiempo1 {
    private int hora;    // 0 - 23
    private int minuto;  // 0 - 59
    private int segundo; // 0 - 59

    // Constructor que inicializa la hora en 00:00:00
    public Tiempo1() {
        establecerHora(0, 0, 0);
    }

    // Método para establecer la hora validando los datos
    public void establecerHora(int h, int m, int s) {
        hora = (h >= 0 && h < 24) ? h : 0;
        minuto = (m >= 0 && m < 60) ? m : 0;
        segundo = (s >= 0 && s < 60) ? s : 0;
    }

    // Devuelve la hora en formato de 24 horas (HH:MM:SS)
    public String aStringUniversal() {
        DecimalFormat dosDigitos = new DecimalFormat("00");
        return dosDigitos.format(hora) + ":" +
                dosDigitos.format(minuto) + ":" +
                dosDigitos.format(segundo);
    }

    // Devuelve la hora en formato estándar (HH:MM:SS AM/PM)
    public String aStringEstandar() {
        DecimalFormat dosDigitos = new DecimalFormat("00");
        int horaEstandar = (hora == 0 || hora == 12) ? 12 : hora % 12;
        String periodo = (hora < 12) ? " AM" : " PM";
        return horaEstandar + ":" +
                dosDigitos.format(minuto) + ":" +
                dosDigitos.format(segundo) + periodo;
    }
}

