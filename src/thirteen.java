import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.awt.*;

public class thirteen extends Application{

    Stage window;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;

        window.setTitle("kamVelo");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Apples","Bannanas","Pears");

        choiceBox.setValue(choiceBox.getItems().get(0));

        //listen for selection changes:
        choiceBox.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> System.out.println(newValue));

        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox);

        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();
    }
}
