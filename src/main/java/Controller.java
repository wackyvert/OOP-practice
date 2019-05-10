import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.GridPane;

public class Controller {
    @FXML
    GridPane grid = new GridPane();
    @FXML
    protected void handleSubmitButtonAction(ActionEvent event) {
        System.out.println("Sus");
    }
    @FXML
    protected void Horsebutton (ActionEvent event) {
        HorseBehavior.HorseGUI();
    }
}
