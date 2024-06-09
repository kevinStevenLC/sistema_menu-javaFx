package project.components;

import java.util.ArrayList;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

public class MenuEditarItem {
    private Menu edit;

    public MenuEditarItem() {
        edit = new Menu("Editar");
        edit.getItems().addAll(crearMenuItem());
    }

    private ArrayList<MenuItem> crearMenuItem() {

        MenuItem Modificar = new MenuItem("Modificar");
        Modificar.setOnAction(e -> {
            System.out.println("Modificacion Activada");
        });

        ArrayList<MenuItem> listaSubmenuEditar = new ArrayList<>();
        listaSubmenuEditar.add(Modificar);
        return listaSubmenuEditar;
    }

    public Menu getEdit() {
        return edit;
    }
}
