package pl.sebastianklimas.countries.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import pl.sebastianklimas.countries.model.Country;
import pl.sebastianklimas.countries.model.Game;

import java.io.IOException;
import java.util.Map;

public class SeeSelectedCountriesPaneController extends Controller {

    @FXML
    private Button backButton;

    @FXML
    private Label printLabel;

    private Game game;

    public void initialize() {
    }

    public void switchToMainScene(ActionEvent event) throws IOException {
        passGameToMainScene(game, event);
    }

    public void passGame(Game game) {
        this.game = game;
        StringBuilder sb = new StringBuilder();
        Map<Country, Boolean> gameContainer = this.game.getGameContainer();
        for (Country country: gameContainer.keySet()) {
            sb.append(country).append(", ");
        }
        printLabel.setText(sb.toString());
    }
}
