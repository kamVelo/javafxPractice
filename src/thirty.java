import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class thirty extends Application{
    public static void main(String[] args){
        launch(args);
    }
    Stage window;

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("lesson 30");

        //input
        TextField input = new TextField();
        input.setPromptText("Username");
        input.setMaxWidth(200);


        //label
        Label first = new Label("Welcome to the site ");
        Label second = new Label("");

        HBox hBox = new HBox(first,second);
        hBox.setAlignment(Pos.CENTER);

        VBox layout = new VBox(10,input, hBox);
        layout.setAlignment(Pos.CENTER);

        second.textProperty().bind(input.textProperty());

        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();
    }
}
