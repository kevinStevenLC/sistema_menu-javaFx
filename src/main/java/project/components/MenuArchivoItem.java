package project.components;

import java.util.ArrayList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

//hola

public class MenuArchivoItem {
    private Menu archv;

    public MenuArchivoItem() {
        archv = new Menu("Archivo");
        archv.getItems().addAll(crearMenuItem());
    }

    private ArrayList<MenuItem> crearMenuItem() {

        MenuItem Añadir = new MenuItem("Abrir");
        Añadir.setOnAction(e -> {
            System.out.println("Agregacion Activada");
        });
        MenuItem Eliminar = new MenuItem("Eliminar");
        Eliminar.setOnAction(e -> {
            System.out.println("Eliminacion Activada");
        });
        MenuItem Modificar = new MenuItem("Cerrar");
        Modificar.setOnAction(e -> {
            System.out.println("Cerrando el Documento");
        });
        SeparatorMenuItem separator1 = new SeparatorMenuItem();
        SeparatorMenuItem separator2 = new SeparatorMenuItem();

        ArrayList<MenuItem> listaSubmenuArchivo_a = new ArrayList<>();
        listaSubmenuArchivo_a.add(Añadir);
        listaSubmenuArchivo_a.add(separator1);
        listaSubmenuArchivo_a.add(Eliminar);
        listaSubmenuArchivo_a.add(separator2);
        listaSubmenuArchivo_a.add(Modificar);

        return listaSubmenuArchivo_a;
    }

    public Menu getArchv() {
        return archv;
    }
}
