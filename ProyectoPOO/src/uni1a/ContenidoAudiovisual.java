package uni1a;

public abstract class ContenidoAudiovisual {

    protected String titulo;
    protected int duracion;
    protected String genero;

    public ContenidoAudiovisual(String titulo, int duracion, String genero) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getGenero() {
        return genero;
    }

    public abstract void mostrarDetalles();
}