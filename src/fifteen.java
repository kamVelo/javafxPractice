import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class fifteen extends Application{
    Stage window;
    ListView<String> listView;
    public static void main(String[] args){
        launch(args);
    }

    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo-listView");

        Button button = new Button("submit");
        button.setOnAction(e->buttonClick());
        listView = new ListView<>();

        listView.getItems().addAll("apple","bannana","pear"); //this allows you to add multiple items to the list
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE); //this allows you to select multiple values from the menu

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(button,listView);

        Scene scene = new Scene(layout, 300,250);

        window.setScene(scene);
        window.show();

    }

    private void buttonClick(){
        String message = "";
        ObservableList<String> movies;
        movies = listView.getSelectionModel().getSelectedItems();

        for(String m: movies){
            message += m + "\n";
        }
        System.out.println(message);
    }
}
