package dao;

import java.io.*;

import uni1a.Pelicula;

public class ArchivoManager {

    public void guardarPelicula(Pelicula pelicula)
            throws IOException {

        FileWriter writer =
                new FileWriter("peliculas.csv", true);

        writer.write(
                pelicula.getTitulo() + "," +
                pelicula.getGenero() + "\n"
        );

        writer.close();
    }
}