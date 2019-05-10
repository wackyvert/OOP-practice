import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.StackPane;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.util.Optional;

public class GUITest extends Application implements EventHandler<ActionEvent>{
    Stage window;
    Button b;
    public static void main(String[] args){

        launch(args);
    }

    @Override
    public void start (Stage primaryStage) throws Exception{
        window = primaryStage;
        primaryStage.setTitle("Create an Animal");
        b = new Button("Horse");
        b.setOnAction(this);
        StackPane layout = new StackPane();
        layout.getChildren().add(b);
        StackPane layout2 = new StackPane();
        Scene animalSelect = new Scene(layout2, 300, 250);
        primaryStage.setScene(animalSelect);
        primaryStage.show();
        Button eat = new Button("Eat");
        eat.setOnAction(this);
        Button sleep = new Button("Sleep");
        sleep.setOnAction(this);
        Button walk = new Button("Walk");
        walk.setOnAction(this);
        layout2.getChildren().addAll(eat, sleep, walk);

    }

    public void handle(ActionEvent event) {
        if(event.getSource()==b){
           HorseBehavior.HorseGUI();
           window.setTitle("What should tht horse do?");
            StackPane layout2 = new StackPane();
            Scene horseBehavior = new Scene(layout2, 300, 250);
           window.setScene(horseBehavior);
        }
    }
}
