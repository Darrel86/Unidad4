package uni1a;

public class Pelicula extends ContenidoAudiovisual {

    private String estudio;

    public Pelicula(String titulo, int duracion, String genero, String estudio) {
        super(titulo, duracion, genero);
        this.estudio = estudio;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("=== PELICULA ===");
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Duracion: " + getDuracion() + " min");
        System.out.println("Genero: " + getGenero());
        System.out.println("Estudio: " + estudio);
    }
}