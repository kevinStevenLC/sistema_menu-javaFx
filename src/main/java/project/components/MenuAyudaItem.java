package project.components;

import java.util.ArrayList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.SeparatorMenuItem;

public class MenuAyudaItem {
    private Menu menu_ayuda;

    public MenuAyudaItem() {
        menu_ayuda = new Menu("Editar");
        menu_ayuda.getItems().addAll(crearMenuItem());
    }

    private ArrayList<MenuItem> crearMenuItem() {

        MenuItem preguntas_frecuentes = new MenuItem("Preguntas frecuentes");
        preguntas_frecuentes.setOnAction(e -> {
            System.out.println("Muestra las preguntas frecuentes de los usuarios XD");
        });
        MenuItem informacionA = new MenuItem("Información de la aplicación");
        informacionA.setOnAction(e -> {
            System.out.println("Informacion Adicional de la Aplicacion.");
        });
        SeparatorMenuItem separator1 = new SeparatorMenuItem();

        ArrayList<MenuItem> listaSubmenuEditar = new ArrayList<>();

        listaSubmenuEditar.add(preguntas_frecuentes);
        listaSubmenuEditar.add(separator1);
        listaSubmenuEditar.add(informacionA);

        return listaSubmenuEditar;
    }

    public Menu getayuda() {
        return menu_ayuda;
    }
}