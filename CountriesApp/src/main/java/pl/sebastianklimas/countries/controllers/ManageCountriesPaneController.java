package pl.sebastianklimas.countries.controllers;

import javafx.css.Stylesheet;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.sebastianklimas.countries.model.Game;
import pl.sebastianklimas.countries.model.enums.Continent;
import pl.sebastianklimas.countries.model.enums.Language;

import java.io.IOException;
import java.util.Set;

import static pl.sebastianklimas.countries.model.enums.Continent.*;

public class ManageCountriesPaneController extends Controller {

    @FXML
    private Button africaButton;

    @FXML
    private CheckBox africaCheckBox;

    @FXML
    private Button allCountriesButton;

    @FXML
    private CheckBox allCountriesCheckBox;

    @FXML
    private Button asiaButton;

    @FXML
    private CheckBox asiaCheckBox;

    @FXML
    private Button australiaButton;

    @FXML
    private CheckBox australiaCheckBox;

    @FXML
    private Button backButton;

    @FXML
    private Button europeButton;

    @FXML
    private CheckBox europeCheckBox;

    @FXML
    private BorderPane manageCountriesBorderPane;

    @FXML
    private Button northAmericaButton;

    @FXML
    private CheckBox northAmericaCheckBox;

    @FXML
    private Button southAmericaButton;

    @FXML
    private CheckBox southAmericaCheckBox;

    @FXML
    private Button unrecognizedCountriesButton;

    @FXML
    private CheckBox unrecognizedCountriesCheckBox;

    private Game game;

    public void initialize() {
//        Stylesheet stylesheet
//         europeButton.setStyle("-fx-background-color:" + "black" + ";");
//        europeButton.getStyleClass().add("black-class");
    }

    public void switchToMainScene(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/mainPane.fxml"));
        BorderPane mainPane = loader.load();
        MainPaneController mainPaneController = loader.getController();

        fillGame();
        mainPaneController.passGame(game);

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(mainPane));
        stage.show();
    }

    private void fillGame() {
        game.restart();
        if (africaCheckBox.isSelected())                    game.addContinent(AFRICA);
        if (asiaCheckBox.isSelected())                      game.addContinent(Continent.ASIA);
        if (australiaCheckBox.isSelected())                 game.addContinent(Continent.AUSTRALIA);
        if (europeCheckBox.isSelected())                    game.addContinent(Continent.EUROPE);
        if (northAmericaCheckBox.isSelected())              game.addContinent(Continent.NORTH_AMERICA);
        if (southAmericaCheckBox.isSelected())              game.addContinent(Continent.SOUTH_AMERICA);
        if (unrecognizedCountriesCheckBox.isSelected())     game.addContinent(Continent.UNRECOGNIZED_COUNTRIES);
        if (allCountriesCheckBox.isSelected())              game.addContinent(Continent.ALL_COUNTRIES);
    }

    public void africa(ActionEvent event) {
        if (africaCheckBox.isSelected() || allCountriesCheckBox.isSelected()) africaCheckBox.setSelected(false);
        else africaCheckBox.setSelected(true);
    }

    public void asia(ActionEvent event) {
        if (asiaCheckBox.isSelected() || allCountriesCheckBox.isSelected()) asiaCheckBox.setSelected(false);
        else asiaCheckBox.setSelected(true);
    }

    public void australia(ActionEvent event) {
        if (australiaCheckBox.isSelected() || allCountriesCheckBox.isSelected()) australiaCheckBox.setSelected(false);
        else australiaCheckBox.setSelected(true);
    }

    public void europe(ActionEvent event) {
        if (europeCheckBox.isSelected() || allCountriesCheckBox.isSelected()) europeCheckBox.setSelected(false);
        else europeCheckBox.setSelected(true);
    }

    public void northAmerica(ActionEvent event) {
        if (northAmericaCheckBox.isSelected() || allCountriesCheckBox.isSelected()) northAmericaCheckBox.setSelected(false);
        else northAmericaCheckBox.setSelected(true);
    }

    public void southAmerica(ActionEvent event) {
        if (southAmericaCheckBox.isSelected() || allCountriesCheckBox.isSelected()) southAmericaCheckBox.setSelected(false);
        else southAmericaCheckBox.setSelected(true);
    }

    public void allCountries(ActionEvent event) {
        if (allCountriesCheckBox.isSelected()) allCountriesCheckBox.setSelected(false);
        else allCountriesCheckBox.setSelected(true);
    }

    public void unrecognizedCountries(ActionEvent event) {
        if (unrecognizedCountriesCheckBox.isSelected()) unrecognizedCountriesCheckBox.setSelected(false);
        else unrecognizedCountriesCheckBox.setSelected(true);
    }

    public void passGame(Game game) {
        this.game = game;
        checkLoadedContinents();
    }

    private void checkLoadedContinents() {
        Set<Continent> loadedContinents = game.getLoadedContinents();
        if(loadedContinents.contains(AFRICA))                   africaCheckBox.setSelected(true);
        if(loadedContinents.contains(ASIA))                     asiaCheckBox.setSelected(true);
        if(loadedContinents.contains(AUSTRALIA))                australiaCheckBox.setSelected(true);
        if(loadedContinents.contains(EUROPE))                   europeCheckBox.setSelected(true);
        if(loadedContinents.contains(NORTH_AMERICA))            northAmericaCheckBox.setSelected(true);
        if(loadedContinents.contains(SOUTH_AMERICA))            southAmericaCheckBox.setSelected(true);
        if(loadedContinents.contains(ALL_COUNTRIES))            {
            allCountriesCheckBox.setSelected(true);
            africaCheckBox.setSelected(true);
            asiaCheckBox.setSelected(true);
            australiaCheckBox.setSelected(true);
            europeCheckBox.setSelected(true);
            northAmericaCheckBox.setSelected(true);
            southAmericaCheckBox.setSelected(true);
        }
        if(loadedContinents.contains(UNRECOGNIZED_COUNTRIES))   unrecognizedCountriesCheckBox.setSelected(true);
    }
}
