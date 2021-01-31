package com.pooespol.proy2p;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * JavaFX App
 */
public class App extends Application {

    public static Scene scene;

    @Override
    public void start(Stage stage) throws IOException {
<<<<<<< Updated upstream
         FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("bebidas.fxml"));
            Parent root = fxmlLoader.load();
        //scene = new Scene(loadFXML("primary"), 640, 480);
=======
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("bebidas.fxml"));
        Parent root = fxmlLoader.load();
>>>>>>> Stashed changes
        scene= new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    static void setRoot(String fxml) throws IOException {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }

}