package pl.sebastianklimas.countries.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import pl.sebastianklimas.countries.model.Game;
import pl.sebastianklimas.countries.model.enums.Language;

import java.io.IOException;

public class MainPaneController extends Controller {

        @FXML
        private Button addCountriesButton;

        @FXML
        private Button deleteCountriesButton;

        @FXML
        private Button exitButton;

        @FXML
        private BorderPane mainBorderPane;

        @FXML
        private Button playButton;

        @FXML
        private Button seeSelectedButton;

        @FXML
        private Button showScoreboardButton;

        private Game game;

        public void initialize() {

        }

        public void switchToGuessingScene(ActionEvent event) throws IOException {
                if(!game.getGameContainer().isEmpty()) {
                        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/guessingPane.fxml"));
                        BorderPane guessingPane = loader.load();
                        GuessingPaneController guessingPaneController = loader.getController();

                        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        stage.setScene(new Scene(guessingPane));

                        guessingPaneController.passGame(game);

                        stage.show();
                }
        }

        public void switchToManageCountriesScene(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/manageCountriesPane.fxml"));
                BorderPane manageCountriesPane = loader.load();
                ManageCountriesPaneController manageCountriesPaneController = loader.getController();

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(manageCountriesPane));

                manageCountriesPaneController.passGame(game);

                stage.show();
        }

        public void switchToScoreboardScene(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/scoreboardPane.fxml"));
                BorderPane scoreboardPane = loader.load();
                ScoreboardPaneController scoreboardPaneController = loader.getController();

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(scoreboardPane));

                scoreboardPaneController.passGame(game);

                stage.show();
        }

        public void switchToSeeSelectedCountriesScene(ActionEvent event) throws IOException {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/seeSelectedCountriesPane.fxml"));
                VBox seeSelectedCountriesPane = loader.load();
                SeeSelectedCountriesPaneController seeSelectedCountriesPaneController = loader.getController();

                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.setScene(new Scene(seeSelectedCountriesPane));

                seeSelectedCountriesPaneController.passGame(game);

                stage.show();
        }

        public void exit(ActionEvent event) {
                game.saveScoreboard();
                Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                stage.close();
        }

        public void startGame(Language language) {
                game = new Game();
                game.setLanguage(language);
                game.initializeScoreboardFromDisc();
        }

        public void passGame(Game game) {
                this.game = game;
        }
}
