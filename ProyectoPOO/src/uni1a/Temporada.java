package uni1a;

public class Temporada {
    private int numero;
    private int episodios;

    public Temporada(int numero, int episodios) {
        this.numero = numero;
        this.episodios = episodios;
    }

    public void mostrarInfo() {
        System.out.println("Temporada " + numero + " | Episodios: " + episodios);
    }
}