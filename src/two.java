import javafx.application.Application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class two extends Application implements EventHandler<ActionEvent>{
    Button button;
    public static void main(String[] args){
        launch(args); // this is a method inside application which runs your prog as a javafx application
        //it will run an application from Application class
    }
    @Override
    public void start(Stage primaryStage)throws  Exception{
        primaryStage.setTitle("this is the primary stage");
        button = new Button(); //instantiates nwe button
        button.setText("This is button Text");//gives it text

        button.setOnAction(this);
        StackPane layout = new StackPane(); //makes a layout
        layout.getChildren().add(button);//adds the button to the layout

        Scene scene = new Scene(layout, 200,200); //makes the scene
        primaryStage.setScene(scene);//tells the stage to use the scene
        primaryStage.show(); //shows the stage to the user
    }

    @Override //this implements a handler for the button
    public void handle(ActionEvent event) {
        if(event.getSource()==button){
            System.out.println("OOOOHHHH i love it when u touch me there...");
        }
    }
}
