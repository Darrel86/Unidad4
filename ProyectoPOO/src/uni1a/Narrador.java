package uni1a;

public class Narrador {
    private String nombre;

    public Narrador(String nombre) {
        this.nombre = nombre;
    }

    public void mostrar() {
        System.out.println("Narrador: " + nombre);
    }
}