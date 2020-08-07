import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class twentyEight extends Application{
    public static void main(String[] args){
        launch(args);
    }
    Stage window;
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("lesson 28");

        person ali = new person();
        ali.firstNameProperty().addListener((v,oldVal, newVal)->{
            System.out.println("Name Changed to: " + newVal);
            System.out.println("firstNameProperty(): " + ali.firstNameProperty());
            System.out.println("getFirstName(): " + ali.getFirstName());
        });

        Button button = new Button("submit");
        button.setOnAction(e->{
            ali.setFirstName("Ali");
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);


        Scene scene = new Scene(layout,300,300);
        window.setScene(scene);
        window.show();

    }
}
