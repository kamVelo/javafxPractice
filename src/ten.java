import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class ten extends Application{
    Stage window;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo");

        TextField nameInput = new TextField();
        nameInput.setPromptText("username");

        Button button = new Button("click me");

        button.setOnAction(e -> isInt(nameInput, nameInput.getText()));

        VBox layout = new VBox(10);

        layout.setPadding(new Insets(20,20,20,20));
        layout.getChildren().addAll(nameInput, button);

        Scene scene = new Scene(layout, 300, 250);

        window.setScene(scene);

        window.show();
    }
    private boolean isInt(TextField field, String text){
        try{
            int age = Integer.parseInt(text);
            System.out.println("The User: is " + age);
            return true;
        }catch(NumberFormatException e){
            System.out.println("ERROR: Please enter an age in number format");
            return false;
        }
    }
}
