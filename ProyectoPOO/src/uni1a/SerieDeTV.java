package uni1a;

import java.util.ArrayList;

public class SerieDeTV extends ContenidoAudiovisual {

    private int numeroTemporadas;

    // Lista de temporadas (composición)
    private ArrayList<Temporada> listaTemporadas = new ArrayList<>();

    public SerieDeTV(String titulo, int duracionEnMinutos, String genero, int numeroTemporadas) {
        super(titulo, duracionEnMinutos, genero);
        this.numeroTemporadas = numeroTemporadas;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Detalles de la serie:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("Número de temporadas: " + this.numeroTemporadas);
        System.out.println();
    }

    // Métodos de composición
    public void agregarTemporada(int numero, int episodios) {
        listaTemporadas.add(new Temporada(numero, episodios));
    }

    public void mostrarTemporadas() {
        for (Temporada t : listaTemporadas) {
            t.mostrarInfo();
        }
    }
}
