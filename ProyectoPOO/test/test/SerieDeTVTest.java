package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import uni1a.SerieDeTV;

public class SerieDeTVTest {

    @Test
    void testNumeroTemporadas() {

        SerieDeTV serie = new SerieDeTV(
                "Game of Thrones",
                60,
                "Fantasy",
                8
        );

        assertEquals(8, serie.getNumeroTemporadas());
    }

    @Test
    void testTituloSerie() {

        SerieDeTV serie = new SerieDeTV(
                "Game of Thrones",
                60,
                "Fantasy",
                8
        );

        assertEquals("Game of Thrones", serie.getTitulo());
    }
}