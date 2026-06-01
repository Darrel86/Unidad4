package controller;

import uni1a.*;
import view.ConsolaView;
import dao.ArchivoManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ContenidoController {

    private ConsolaView view;
    private ArchivoManager archivoManager;
    private List<ContenidoAudiovisual> lista;

    public ContenidoController(ConsolaView view, ArchivoManager archivoManager) {
        this.view = view;
        this.archivoManager = archivoManager;
        this.lista = new ArrayList<>();
    }

    public void iniciar() {

        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\n===== SISTEMA AUDIOVISUAL =====");
            System.out.println("1. Mostrar contenido");
            System.out.println("2. Agregar película");
            System.out.println("3. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    mostrarContenido();
                    break;

                case 2:
                    agregarDatosPrueba();
                    break;

                case 3:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida");
            }

        } while (opcion != 3);
    }

    public void mostrarContenido() {

        if (lista.isEmpty()) {
            System.out.println("No hay contenido");
            return;
        }

        for (ContenidoAudiovisual c : lista) {
            c.mostrarDetalles();
        }
    }

    public void agregarDatosPrueba() {

        Pelicula peli = new Pelicula(
                "Avatar",
                125,
                "Accion",
                "20th Century Studios"
        );

        lista.add(peli);

        System.out.println("Película agregada correctamente");
    }
}