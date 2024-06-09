package test;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import project.components.MenuArchivoItem;
import project.components.MenuAyudaItem;
import project.components.MenuBr;
import project.components.MenuEditarItem;

import java.io.IOException;

public class App extends Application {

    @Override
    public void start(@SuppressWarnings("exports") Stage stage) throws IOException {
        Button btn = new Button("Soy un Boton :)");

        BorderPane scena = new BorderPane();
        Scene root = new Scene(scena);
        MenuBr brMenu = new MenuBr();
        MenuArchivoItem menuArchivo = new MenuArchivoItem();
        MenuEditarItem menuEditar = new MenuEditarItem();
        MenuAyudaItem menuAyuda = new MenuAyudaItem();
        MenuBar menuBar = brMenu.getBdMenuPrincipal();

        btn.getStyleClass().addAll("btn_style");
        menuBar.getStyleClass().addAll("menubr_style");
        scena.getStyleClass().addAll("fondo_gn");

        scena.setPrefSize(420, 450);
        menuBar.getMenus().addAll(menuArchivo.getArchv(), menuEditar.getEdit(), menuAyuda.getayuda());
        scena.setTop(menuBar);
        scena.setCenter(btn);

        root.getStylesheets().addAll(getClass().getResource("/project/resources/css/main.css").toExternalForm());
        stage.setTitle("Menu Bar");
        stage.setScene(root);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

}