module CountriesApp {
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    exports pl.sebastianklimas.countries.app to javafx.graphics;
    opens pl.sebastianklimas.countries.controllers to javafx.fxml;
}