import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.stage.Stage;
public class twentyOne extends Application{
    Stage window;
    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start (Stage primaryStage){
        window = primaryStage;
        window.setTitle("lesson 21");

        //file menu
        Menu file = new Menu("file");

        //file menu items
        file.getItems().add( new MenuItem("new project..."));
        file.getItems().add( new MenuItem("new module..."));
        file.getItems().add( new MenuItem("import project..."));

        //main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(file);
        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();
    }
}
