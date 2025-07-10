package paquete.animales;

class Animal {
    protected String nombre;
    protected int edad;
    protected String alimento;

    public Animal(String nombre, int edad, String alimento) {
        this.nombre = nombre;
        this.edad = edad;
        this.alimento = alimento;
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Alimento: " + alimento);
    }
}

class Gallo extends Animal {
    private String colorPlumas;

    public Gallo(String nombre, int edad, String alimento, String colorPlumas) {
        super(nombre, edad, alimento);
        this.colorPlumas = colorPlumas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de plumas: " + colorPlumas);
        System.out.println("-----------------------------");
    }
}

class Perro extends Animal {
    private String colorPelaje;

    public Perro(String nombre, int edad, String alimento, String colorPelaje) {
        super(nombre, edad, alimento);
        this.colorPelaje = colorPelaje;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de pelaje: " + colorPelaje);
        System.out.println("-----------------------------");
    }
}

class Gato extends Animal {
    private String colorOjos;

    public Gato(String nombre, int edad, String alimento, String colorOjos) {
        super(nombre, edad, alimento);
        this.colorOjos = colorOjos;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Color de ojos: " + colorOjos);
        System.out.println("-----------------------------");
    }
}

class Hamster extends Animal {
    private int cantidadPulgas;

    public Hamster(String nombre, int edad, String alimento, int cantidadPulgas) {
        super(nombre, edad, alimento);
        this.cantidadPulgas = cantidadPulgas;
    }

    @Override
    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de pulgas: " + cantidadPulgas);
        System.out.println("-----------------------------");
    }
}

public class RegistroAnimales {
    public static void main(String[] args) {
        Gallo gallo = new Gallo("Kiko", 2, "Maíz", "Rojo");
        Perro perro = new Perro("Max", 5, "Croquetas", "Marrón");
        Gato gato = new Gato("Luna", 3, "Pescado", "Verde");
        Hamster hamster = new Hamster("Pelusa", 1, "Semillas", 4);

        gallo.mostrarDatos();
        perro.mostrarDatos();
        gato.mostrarDatos();
        hamster.mostrarDatos();
    }
}
