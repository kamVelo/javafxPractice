import javafx.application.Application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class four extends Application{
    Stage window;
    Scene scene1, scene2;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage)throws  Exception {
        window = primaryStage;

        Label label1 = new Label("Welcome to the first scene");
        Button button1 = new Button("Click to go to scene 2");
        button1.setOnAction(e -> window.setScene(scene2));

        //layout 1 - children are layed out in a vertical column
        VBox layout1 = new VBox(20);
        layout1.getChildren().addAll(label1,button1);
        scene1 = new Scene(layout1, 300,300);

        //button2
        Button button2 = new Button("this scene sucks go back to one");
        button2.setOnAction(e -> window.setScene(scene1));

        //layout 2
        StackPane layout2 = new StackPane();
        layout2.getChildren().add(button2);
        scene2 = new Scene(layout2, 350,350);

        window.setScene(scene1);
        window.setTitle("Title Here");
        window.show();

    }
}
