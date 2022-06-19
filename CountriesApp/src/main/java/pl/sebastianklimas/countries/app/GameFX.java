package pl.sebastianklimas.countries.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class GameFX extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Countries Guesser");
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/selectLanguagePane.fxml"));
        BorderPane pane = loader.load();
        stage.setScene(new Scene(pane));
        stage.show();
    }
}
