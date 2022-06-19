package pl.sebastianklimas.countries.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import pl.sebastianklimas.countries.model.enums.Language;

import java.io.IOException;

public class SelectLanguagePaneController extends Controller {

    @FXML
    private Button englishButton;

    @FXML
    private Button polishButton;

    public void initialize() {
    }

    public void selectPolish(ActionEvent event) throws IOException {
        selectLanguage(event, Language.POLISH);
    }

    public void selectEnglish(ActionEvent event) throws IOException {
        selectLanguage(event, Language.ENGLISH);
    }

    public void selectLanguage(ActionEvent event, Language language) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/mainPane.fxml"));
        BorderPane manageCountriesPane = loader.load();
        MainPaneController mainPaneController = loader.getController();

        mainPaneController.startGame(language);

        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(manageCountriesPane));
        stage.show();
    }

    public void request() {
        englishButton.requestFocus();
    }
}
