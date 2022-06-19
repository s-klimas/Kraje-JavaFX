package pl.sebastianklimas.countries.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import pl.sebastianklimas.countries.model.Game;
import pl.sebastianklimas.countries.model.Score;

import java.io.IOException;
import java.util.List;

public class ScorePaneController extends Controller {

    @FXML
    private BorderPane classifiedBorderPane;

    @FXML
    private Button continueButton;

    @FXML
    private Label scoreLabel;

    @FXML
    private TextField signatureTextField;

    private Game game;
    private Score score;

    public void initialize() {
    }

    private boolean qualified(Score score) {
        return game.getScoreboardList().get(9).getScore() > score.getScore();
    }

    public void passGame(Game game, Score score) {
        this.game = game;
        this.score = score;
        setScore();
        signatureTextField.addEventFilter(KeyEvent.KEY_PRESSED, keyEvent -> {
            KeyCode typed = keyEvent.getCode();
            if (typed.equals(KeyCode.ENTER)) {
                try {
                    goToMainPane(keyEvent);
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
    }

    private void setScore() {
        scoreLabel.setText(Double.toString(score.getScore()));
        List<Score> scoreboardList = game.getScoreboardList();
        if (scoreboardList.size() < 10) {
            game.getScoreboard().addScore(score);
            classifiedBorderPane.setVisible(true);
        }
        else if (qualified(score)) {
            game.getScoreboard().replaceLast(score);
            classifiedBorderPane.setVisible(true);
        }
    }

    public void goToMainPane(Event event) throws IOException {
        if(classifiedBorderPane.isVisible()) {
            String signature = signatureTextField.getText();
            score.setName(signature);
        }
        switchToMainScene(event);
    }

    private void switchToMainScene(Event event) throws IOException {
        passGameToMainScene(game, event);
    }
}
