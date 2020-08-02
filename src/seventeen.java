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
public class seventeen extends Application{

    Stage window;
    TableView<product> table;
    TextField nameInput, priceInput, quantityInput;

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        window=primaryStage;
        window.setTitle("kamVelo-TableView_1");

        //Name Column
        TableColumn<product,String> nameCol = new TableColumn<>("name");
        nameCol.setMinWidth(200);
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        //price Column
        TableColumn<product, Double> priceCol = new TableColumn<product, Double>("price");
        priceCol.setMinWidth(200);
        priceCol.setCellValueFactory(new PropertyValueFactory<>("price"));

        //quantity column
        TableColumn<product, String> quanCol = new TableColumn<>("quantity");
        quanCol.setMinWidth(200);
        quanCol.setCellValueFactory(new PropertyValueFactory<>("quantity"));
        //nameInput
        nameInput = new TextField();
        nameInput.setPromptText("Name");
        nameInput.setMinWidth(200);

        //price input
        priceInput = new TextField();
        priceInput.setPromptText("price");
        priceInput.setMinWidth(200);

        //quantity input
        quantityInput = new TextField();
        quantityInput.setPromptText("quantity");
        quantityInput.setMinWidth(200);

        //buttons
        Button addButton = new Button("add");
        addButton.setOnAction(e -> addButtonClicked());

        Button delButton = new Button("delete");
        delButton.setOnAction(e->delButtonClicked());

        HBox hbox = new HBox();
        hbox.setPadding(new Insets(20));
        hbox.setSpacing(10);
        hbox.getChildren().addAll(nameInput, priceInput, quantityInput, addButton, delButton);



        table = new TableView<>();
        table.setItems(getProducts());
        table.getColumns().addAll(nameCol,priceCol,quanCol);


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(table, hbox);

        Scene scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    //get all the products
    public ObservableList<product> getProducts(){
        ObservableList<product> products = FXCollections.observableArrayList();
        products.add(new product("toyota prius", 25000.00,10));
        products.add(new product("ball",2.99,100));
        products.add(new product("Bose headphones", 99.99,50));
        return products;
    }
    public void addButtonClicked(){
        product prod = new product();
        prod.setName(nameInput.getText());
        prod.setPrice(Double.parseDouble(priceInput.getText()));
        prod.setQuantity(Integer.parseInt(quantityInput.getText()));
        table.getItems().add(prod);
        nameInput.clear();
        priceInput.clear();
        quantityInput.clear();
    }
    public void delButtonClicked(){
        ObservableList<product> productSelected, allProducts;
        allProducts = table.getItems();
        productSelected = table.getSelectionModel().getSelectedItems();
        productSelected.forEach(allProducts::remove);
    }

}
