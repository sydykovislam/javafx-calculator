package  sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("Calculator");
        stage.setResizable(false);

        Menu menu1 = new Menu("Menu 1");

        MenuBar menuBar = new MenuBar();
        Scene scene = new Scene(root);
//        VBox vBox = new VBox(menuBar);
        menuBar.getMenus().add(menu1);
        stage.setScene(scene);
        stage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}