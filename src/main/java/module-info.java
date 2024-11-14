module dk.easv.wow.gitopgave {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.wow.gitopgave to javafx.fxml;
    exports dk.easv.wow.gitopgave;
}