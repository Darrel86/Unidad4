package uni1a;

public class AudioLibro extends ContenidoAudiovisual {

    private String autor;
    private Narrador narrador;

    public AudioLibro(String titulo, int duracion, String genero, String autor, Narrador narrador) {
        super(titulo, duracion, genero);
        this.autor = autor;
        this.narrador = narrador;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Audiolibro:");
        System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Autor: " + autor);

        narrador.mostrar();

        System.out.println();
    }
}
