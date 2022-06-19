package pl.sebastianklimas.countries.controllers;

import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.sebastianklimas.countries.model.Game;

import java.io.IOException;

public abstract class Controller {
    public void passGameToMainScene(Game game, Event event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/mainPane.fxml"));
        BorderPane mainPane = loader.load();
        MainPaneController mainPaneController = loader.getController();

        mainPaneController.passGame(game);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPane));
        stage.show();
    }
}
