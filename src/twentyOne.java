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


        //help menu
        Menu helpMenu = new Menu("helpMenu");
        CheckMenuItem showLines = new CheckMenuItem("show line numbers");
        showLines.setOnAction(e->{
            if(showLines.isSelected()) System.out.println("Showing line numbers");
            else System.out.println("hiding line numbers");
        });
        CheckMenuItem autoSave = new CheckMenuItem("auto save");
        autoSave.setSelected(true);
        autoSave.setOnAction(e->{
            if(autoSave.isSelected())System.out.println("auto save is on");
            else System.out.println("auto save is off");
        });

        helpMenu.getItems().addAll(showLines,autoSave);


        //difficulty menu
        Menu difMenu = new Menu("difficulty");
        ToggleGroup group = new ToggleGroup();
        RadioMenuItem easy = new RadioMenuItem("easy");
        RadioMenuItem medium = new RadioMenuItem("medium");
        RadioMenuItem hard = new RadioMenuItem("hard");
        easy.setToggleGroup(group);
        medium.setToggleGroup(group);
        hard.setToggleGroup(group);
        difMenu.getItems().addAll(easy,medium,hard);

        //main menu bar
        MenuBar menuBar = new MenuBar();
        menuBar.getMenus().addAll(file,editMenu, helpMenu,difMenu);
        BorderPane layout = new BorderPane();
        layout.setTop(menuBar);

        Scene scene = new Scene(layout, 300,250);
        window.setScene(scene);
        window.show();
    }
}
