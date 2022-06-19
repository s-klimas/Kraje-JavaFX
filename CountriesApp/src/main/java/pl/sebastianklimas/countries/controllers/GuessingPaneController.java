package pl.sebastianklimas.countries.controllers;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.sebastianklimas.countries.model.Country;
import pl.sebastianklimas.countries.model.Game;
import pl.sebastianklimas.countries.model.Score;
import pl.sebastianklimas.countries.model.enums.NewColor;

import java.io.IOException;
import java.time.Duration;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.Set;

public class GuessingPaneController extends Controller {

    @FXML
    private Button giveUpButton;

    @FXML
    private TextField guessingTextField;

    @FXML
    private WorldPaneController worldPaneController;

    private Game game;
    private Instant timeStart;
    private Instant timeEnd;

    public void initialize() {

//
//        Group root = new Group();
//        FileInputStream input_background_template = new FileInputStream("world_old.svg");
//        ImageView img_background_template = new ImageView(new Image(input_background_template));
//
//        root.getChildren().addAll(img_background_template);
//        SVGPath
    }

//    private void switchToMainScene(Event event) throws IOException {
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/mainPane.fxml"));
//        BorderPane mainPane = loader.load();
//        MainPaneController mainPaneController = loader.getController();
//
//        mainPaneController.passGame(game);
//
//        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
//        stage.setScene(new Scene(mainPane));
//        stage.show();
//    }

    private void switchToScoreScene(Event event, Score score) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/scorePane.fxml"));
        BorderPane scorePane = loader.load();
        ScorePaneController scorePaneController = loader.getController();

        scorePaneController.passGame(game, score);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(scorePane));
        stage.show();
    }

    public void giveUp(ActionEvent event) throws IOException {
        this.timeEnd = Instant.now();
        Score score = calculateScore();
        switchToScoreScene(event, score);
    }

    private Score calculateScore() {
        return createScore(timeStart, timeEnd, game.getGuessed());
    }

    private Score createScore(Instant timeStart, Instant timeEnd, int guessed) {
        Score score = new Score(calculateTimeToMillis(timeStart, timeEnd));
        score.calculateScore(guessed);
        return score;
    }

//    private void qualifiedScore(Score score) {
//        signScore(score);
//        if (scoreboardControl.getScoreboardList().size() < 10)
//            scoreboardControl.addScore(score);
//        else if (qualified(score))
//            scoreboardControl.replaceLast(score);
//    }

    private long calculateTimeToMillis(Instant timeStart, Instant timeEnd) {
        return Duration.between(timeStart, timeEnd).toMillis();
    }

    private Optional<Country> submit(String countryName) {
        Set<Country> countries = game.getGameContainer().keySet();
        for (Country country : countries) {
            for (String name : country.getNames())
                if (name.equalsIgnoreCase(countryName)) {
                    if(!game.getGameContainer().get(country)) {
                        game.getGameContainer().replace(country, true);
                        return Optional.of(country);
                    }
                }
        }
        return Optional.empty();
    }

    public void paintGreen(String countryCode) {
        worldPaneController.setNewColor(countryCode, NewColor.GREEN);
    }

    public void passGame(Game game) {
        this.game = game;
        this.game.clear();
        prepareScene();
        startGuessing();
    }

    private void prepareScene() {
        Map<Country, Boolean> gameContainer = game.getGameContainer();
        for(Country country: gameContainer.keySet()) {
            worldPaneController.setNewColor(country.getCode(), NewColor.RED);
        }
    }


    private void startGuessing() {
        guessingTextField.requestFocus();

        this.timeStart = Instant.now();

        guessingTextField.addEventFilter(KeyEvent.KEY_PRESSED, keyEvent -> {
            KeyCode typed = keyEvent.getCode();
            if (typed.equals(KeyCode.ENTER)) {
                String guess = guessingTextField.getText().trim();
                Country country = submit(guess).orElse(null);
                if (country != null) {
                    game.guessed();
                    paintGreen(country.getCode());
                    if (game.getGuessed() == game.getGameContainer().size()) {
                        this.timeEnd = Instant.now();
                        Score score = calculateScore();
                        try {
                            switchToScoreScene(keyEvent, score);
                        } catch (IOException e) {
                            throw new RuntimeException(e);
                        }

                    }
                }
                guessingTextField.clear();
            }
        });
    }
}
