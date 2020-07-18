import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/*
in the tutorial thenewboston declares the treeView as such:

treeView<String> tree = new treeView<>();

however the use of "<String>" is not actually necessary nor is "<>" in the assignment

as such i have not done this in the actual code

 */
public class sixteen extends Application{
    Stage window;
    TreeView<String> treeView;

    public static void main(String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage){
        window = primaryStage;
        window.setTitle("kamVelo-ListView");

        TreeItem root, ali,keira;

        //Root
        root = new TreeItem();
        root.setExpanded(true);

        //Bucky
        ali = makeBranch("ali",root);
        makeBranch("Uncut Gems 2019", ali);
        makeBranch("the irrepressibles - in this shirt", ali);

        keira = makeBranch("keira", root);
        makeBranch("nirvana", keira);

        //Create Tree
        treeView = new TreeView(root);

        //if this was not set to false when the program ran it would show an empty root
        treeView.setShowRoot(false);


        treeView.getSelectionModel().selectedItemProperty()
                .addListener((v, oldValue,newValue) -> {
                    if(newValue != null){
                        System.out.println(newValue.getValue());
                    }
                });
        StackPane layout = new StackPane();
        layout.getChildren().add(treeView);


        Scene scene = new Scene(layout,300,250);

        window.setScene(scene);
        window.show();
    }

    //create branches
    public TreeItem makeBranch(String name, TreeItem parent){
        TreeItem item = new TreeItem(name); //this creates the item usign the given title
        item.setExpanded(true); //this means that when the program runs it will
        // automatically show the child items
        parent.getChildren().add(item); //this adds the item to the parent passed in
        return item; //this returns the item for further use.
    }
}
