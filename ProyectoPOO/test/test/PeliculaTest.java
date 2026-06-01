package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import uni1a.Pelicula;

public class PeliculaTest {

    @Test
    void testTituloPelicula() {

        Pelicula pelicula = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios"
        );

        assertEquals("Avatar", pelicula.getTitulo());
    }

    @Test
    void testGeneroPelicula() {

        Pelicula pelicula = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios"
        );

        assertEquals("Accion", pelicula.getGenero());
    }

    @Test
    void testEstudio() {

        Pelicula pelicula = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios"
        );

        assertEquals("20th Century Studios", pelicula.getEstudio());
    }
}