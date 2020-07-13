import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class twelve extends Application{
    Stage window;
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo");
        Button button = new Button("click me");

        ChoiceBox<String> choiceBox = new ChoiceBox<>();


        //getItems returns the obseravtionList object which you can add items to.
        choiceBox.getItems().addAll("Apples","Bannanas");
        choiceBox.getItems().add("Pears");

        choiceBox.setValue(choiceBox.getItems().get(0));
        button.setOnAction(e->handleChoice(choiceBox));
        VBox layout = new VBox(10);
        layout.getChildren().addAll(choiceBox, button);

        Scene scene = new Scene(layout, 300,250);

        window.setScene(scene);
        window.show();

    }

    private void handleChoice(ChoiceBox<String> box){
        String food = box.getValue();

        System.out.println(String.format("You love %s, i do too!", food));
    }

}
