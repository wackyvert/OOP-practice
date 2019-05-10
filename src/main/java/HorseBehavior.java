import javafx.scene.control.TextInputDialog;
import javafx.scene.control.Dialog;
import jdk.nashorn.internal.scripts.JO;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javafx.*;

import java.util.Optional;

public class HorseBehavior {
    public static void HorseGUI(){
    TextInputDialog nameInput = new TextInputDialog("Sus");
    nameInput.setTitle("Please name your horse");
    nameInput.setHeaderText("What will the horse's name be?");
    nameInput.setContentText("Name the horse! Do it!");
    Optional<String> result = nameInput.showAndWait();
    Horse userHorse = new Horse(result.get());

    }

}
