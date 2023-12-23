package ua.delsix.clickbpmtool;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class ClickController {
    @FXML
    private Label bpmText;
    private static int counter = -1;

    @FXML
    protected void onClick() {
        if(!Timer.isRunning()) {
            new Timer();
        }
        double passedTime = Timer.getPassedTime();
        System.out.println(passedTime);
        counter++;

        if (counter > 3) {
            bpmText.setText(String.format("%.1f BPM", (counter / passedTime) * 60));
        }
    }

    @FXML
    protected void onStop() {
        if(Timer.isRunning()) {
            Timer.stop();
            counter = -1;
        }
    }


}