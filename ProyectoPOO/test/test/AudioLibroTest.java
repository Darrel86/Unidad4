package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import uni1a.AudioLibro;
import uni1a.Narrador;

public class AudioLibroTest {

    @Test
    void testTituloAudioLibro() {

        Narrador narrador = new Narrador("Juan Perez");

        AudioLibro audioLibro = new AudioLibro(
                "El Quijote",
                300,
                "Literatura",
                "Cervantes",
                narrador
        );

        assertEquals(
                "El Quijote",
                audioLibro.getTitulo()
        );
    }

    @Test
    void testGeneroAudioLibro() {

        Narrador narrador = new Narrador("Juan Perez");

        AudioLibro audioLibro = new AudioLibro(
                "El Quijote",
                300,
                "Literatura",
                "Cervantes",
                narrador
        );

        assertEquals(
                "Literatura",
                audioLibro.getGenero()
        );
    }
}