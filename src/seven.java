import javafx.application.Application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.util.Stack;

import static javafx.application.Application.launch;

public class seven extends Application{
    Stage window;
    Button button;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("seven");

        window.setOnCloseRequest(e ->{
            e.consume();
            closeProgram();
        });
        Button button = new Button("close prog");
        button.setOnAction(e -> closeProgram());
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();
    }

    private void closeProgram(){
        Boolean answer =  six_confirmBox.display("title", "sure you want to exit");

        if(answer == true){
            window.close();
        }

    }

}
