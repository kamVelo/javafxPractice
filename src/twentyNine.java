import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class twentyNine extends Application{
    public static void main(String[] args){
        launch(args);
    }
    Stage window;

    @Override
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("lesson 29");

        IntegerProperty x = new SimpleIntegerProperty(3);
        IntegerProperty y = new SimpleIntegerProperty();

        y.bind(x.multiply(10));
        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue() + "\n");

        x.setValue(9);

        System.out.println("x: " + x.getValue());
        System.out.println("y: " + y.getValue() + "\n");

        Button button = new Button("submit");

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300,300);
        window.setScene(scene);
        window.show();
    }
}
