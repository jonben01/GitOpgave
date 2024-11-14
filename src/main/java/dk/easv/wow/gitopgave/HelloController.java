package dk.easv.wow.gitopgave;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    private Label getWelcomeText() {
        return welcomeText;
    }

    private void setWelcomeText(Label welcomeText) {
        this.welcomeText = welcomeText;
    }

    @FXML
    private Label welcomeText;

    private HelloController(Label welcomeText) {
        this.welcomeText = welcomeText;
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}