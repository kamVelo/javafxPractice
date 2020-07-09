import javafx.application.Application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class six extends Application{
    Stage window;
    Button button;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo");

        button = new Button("click me");
        button.setOnAction(e -> {
            boolean result = six_confirmBox.display("confirmBox", "You sure?");
            System.out.println(result);
        });
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();

    }
}
