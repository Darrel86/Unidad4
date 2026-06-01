package poo;
import uni1a.*;
public class PruebaAudioVisual {
    public static void main(String[] args) {

        System.out.println("Hello from Eclipse!");

        // Película
        Pelicula p = new Pelicula("Avatar", 125, "Accion", "20th Century Studios");
        p.agregarActor(new Actor("Sam Worthington", 45));
        p.agregarActor(new Actor("Zoe Saldana", 44));

        // Serie
        SerieDeTV s = new SerieDeTV("Game of Thrones", 60, "Fantasy", 8);
        s.agregarTemporada(1, 10);
        s.agregarTemporada(2, 10);

        // Documental
        Documental d = new Documental("Cosmos", 45, "Science", "Astronomy");
        d.agregarInvestigador(new Investigador("Carl Sagan", "Astrofisica"));

        // Mostrar todo
        p.mostrarDetalles();
        p.mostrarActores();

        s.mostrarDetalles();
        s.mostrarTemporadas();

        d.mostrarDetalles();
        d.mostrarInvestigadores();
     

        // Audiolibro
        Narrador n = new Narrador("Juan Pérez");
        AudioLibro audio = new AudioLibro("El Quijote", 300, "Literatura", "Cervantes", n);

        // Mostrar
       
        audio.mostrarDetalles();
    }



    }
