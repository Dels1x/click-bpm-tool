module ua.delsix.clickbpmtool {
    requires javafx.controls;
    requires javafx.fxml;


    opens ua.delsix.clickbpmtool to javafx.fxml;
    exports ua.delsix.clickbpmtool;
}