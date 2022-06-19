package pl.sebastianklimas.countries.controllers;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import pl.sebastianklimas.countries.model.Game;
import pl.sebastianklimas.countries.model.Score;

import java.io.IOException;
import java.util.List;

public class ScoreboardPaneController extends Controller {

    @FXML
    private Button backButton;

    @FXML
    private Label eighthLabel;

    @FXML
    private Label fifthLabel;

    @FXML
    private Label firstLabel;

    @FXML
    private Label fourthLabel;

    @FXML
    private Label ninthLabel;

    @FXML
    private Label secondLabel;

    @FXML
    private Label seventhLabel;

    @FXML
    private Label sixthLabel;

    @FXML
    private Label tenthLabel;

    @FXML
    private Label thirdLabel;

    private Game game;

    public void initialize() {

    }

    public void switchToMainScene(Event event) throws IOException {
        passGameToMainScene(game, event);
    }

    public void passGame(Game game) {
        this.game = game;
        fillScoreboard();
    }

    private void fillScoreboard() {
        List<Score> scoreboardList = game.getScoreboardList();
        if(scoreboardList.size() < 1) firstLabel.setText("----");
            else firstLabel.setText(scoreboardList.get(0).toString());
        if(scoreboardList.size() < 2) secondLabel.setText("----");
            else secondLabel.setText(scoreboardList.get(1).toString());
        if(scoreboardList.size() < 3) thirdLabel.setText("----");
            else thirdLabel.setText(scoreboardList.get(2).toString());
        if(scoreboardList.size() < 4) fourthLabel.setText("----");
            else fourthLabel.setText(scoreboardList.get(3).toString());
        if(scoreboardList.size() < 5) fifthLabel.setText("----");
            else fifthLabel.setText(scoreboardList.get(4).toString());
        if(scoreboardList.size() < 6) sixthLabel.setText("----");
            else sixthLabel.setText(scoreboardList.get(5).toString());
        if(scoreboardList.size() < 7) seventhLabel.setText("----");
            else seventhLabel.setText(scoreboardList.get(6).toString());
        if(scoreboardList.size() < 8) eighthLabel.setText("----");
            else eighthLabel.setText(scoreboardList.get(7).toString());
        if(scoreboardList.size() < 9) ninthLabel.setText("----");
            else ninthLabel.setText(scoreboardList.get(8).toString());
        if(scoreboardList.size() < 10) tenthLabel.setText("----");
            else tenthLabel.setText(scoreboardList.get(9).toString());
    }
}
