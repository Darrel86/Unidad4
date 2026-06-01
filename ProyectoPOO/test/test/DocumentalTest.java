package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import uni1a.Documental;

public class DocumentalTest {

    @Test
    void testTemaDocumental() {

        Documental documental = new Documental(
                "Cosmos",
                45,
                "Science",
                "Astronomia"
        );

        assertEquals(
                "Astronomia",
                documental.getTema()
        );
    }

    @Test
    void testGeneroDocumental() {

        Documental documental = new Documental(
                "Cosmos",
                45,
                "Science",
                "Astronomia"
        );

        assertEquals(
                "Science",
                documental.getGenero()
        );
    }
}