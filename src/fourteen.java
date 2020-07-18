import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class fourteen extends Application{
    Stage window;
    ComboBox<String> comboBox;


    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo-comboBox");

        Button button = new Button("submit");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll(
                "Goodfellas",
                "good will hunting",
                "The Godfather",
                "The Social network"
        );

        comboBox.setPromptText("Select a Movie");
        button.setOnAction(e->printMovie());

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(comboBox,button);
        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();
    }
    private void printMovie(){
        System.out.println(comboBox.getValue());
    }
}
