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
public class nine extends Application{
    Stage window;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo");

        GridPane grid = new GridPane();

        grid.setPadding(new Insets(10,10,10,10));
        //an inset is an object that allows you to set the padding of every side.

        grid.setVgap(8);
        grid.setHgap(10);
        //this sets the vertical spacing to eight
        // this sets the horizontal spacing to 10.

        //name label

        Label name = new Label("Username");
        GridPane.setConstraints(name, 0, 0);

        //name input

        TextField nameInput = new TextField("camel");
        GridPane.setConstraints(nameInput,1,0);


        //pass label
        Label passLabel = new Label("Password");
        GridPane.setConstraints(passLabel, 0,1);

        //password input
        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1,1);

        Button logBtn = new Button("Log In");

        GridPane.setConstraints(logBtn,1,2);
        grid.getChildren().addAll(name, nameInput,passInput,passLabel,logBtn);

        Scene scene = new Scene(grid, 300,250);
        window.setScene(scene);

        window.show();
    }
}
