import javafx.scene.control.TextInputDialog;

import java.util.Optional;

public class HorseBehavior {
    public static void HorseGUI(){
    TextInputDialog nameInput = new TextInputDialog("Sus");
    nameInput.setTitle("Please name your horse");
    nameInput.setHeaderText("What will the horse's name be?");
    nameInput.setContentText("Name the horse! Do it!");
    Optional<String> result = nameInput.showAndWait();
    Horse userHorse = new Horse(result.get());
    if (result.isPresent()){

    }

    }

}
