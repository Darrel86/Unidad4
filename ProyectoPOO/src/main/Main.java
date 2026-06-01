package main;

import controller.ContenidoController;
import view.ConsolaView;
import dao.ArchivoManager;

public class Main {

    public static void main(String[] args) {

        ConsolaView view = new ConsolaView();
        ArchivoManager archivoManager = new ArchivoManager();

        ContenidoController controller =
                new ContenidoController(view, archivoManager);

        controller.iniciar();
    }
}