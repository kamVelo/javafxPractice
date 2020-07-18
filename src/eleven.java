import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class eleven extends Application{
    Stage window;
    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo's meat hogies");

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Lettuce");

        box2.setSelected(true);

        Button button = new Button("order now");
        button.setOnAction(e -> handleOrder(box1, box2));

        VBox layout = new VBox(10);

        layout.getChildren().addAll(box1,box2, button);

        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();

    }
    private void handleOrder(CheckBox box1, CheckBox box2){
        String message = "Users's Order: \n";
        if(box1.isSelected() == true) message += "\tBacon\n";
        if(box2.isSelected() == true) message+= "\tTuna";
        System.out.println(message);
    }

}
