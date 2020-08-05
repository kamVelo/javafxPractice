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
        MenuItem newFile = new MenuItem("new file...");
        newFile.setOnAction(e-> System.out.println("new file"));
        file.getItems().add(newFile);
        file.getItems().add( new MenuItem("open..."));
        file.getItems().add( new MenuItem("save..."));
        file.getItems().add(new SeparatorMenuItem());
        file.getItems().add( new MenuItem("settings..."));
        file.getItems().add(new SeparatorMenuItem());
        file.getItems().add( new MenuItem("exit"));

        //edit menu
        Menu editMenu = new Menu("_edit");
        MenuItem paste = new MenuItem("Paste");
        paste.setDisable(true);
        editMenu.getItems().addAll(new MenuItem("cut"), new MenuItem("copy"),paste);


        //main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(file,editMenu);
        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();
    }
}
