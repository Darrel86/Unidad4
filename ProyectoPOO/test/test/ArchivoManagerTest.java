package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import dao.ArchivoManager;

public class ArchivoManagerTest {

    @Test
    void testCrearArchivoManager() {

        ArchivoManager archivoManager =
                new ArchivoManager();

        assertNotNull(archivoManager);
    }
}