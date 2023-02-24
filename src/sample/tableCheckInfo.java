package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import sample.javaTables.table;

import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

import static sample.tableController.vT;

public class tableCheckInfo implements Initializable {
    public static void setCurrentTable(String currentTable) {
        tableCheckInfo.currentTable = currentTable;
    }


    private static String currentTable = "";

    @FXML
    private Button close;

    @FXML
    private TableView<tableModel> tablePositions;

    @FXML
    private  TableColumn<tableModel, Integer> count = new TableColumn<>();

    @FXML
    private  TableColumn<tableModel, String>  position = new TableColumn<>();

    @FXML
    private  TableColumn<tableModel,Integer> sum = new TableColumn<>();
    @FXML
    private  TableColumn<tableModel,Integer> price = new TableColumn<>() ;


    @FXML
    void closeCheck(ActionEvent event) {
//        Stage stage = (Stage) close.getScene().getWindow();
//        stage.close();
//        tablePositions.getItems().clear();
        System.out.println(table.getTable("1")+ " -  is the firstTable ");

        System.out.println(table.getTable("2")+ " -  is the secTable ");
        System.out.println(table.getTable("3")+ " -  is the thTable ");
        System.out.println(table.getTable("4")+ " -  is the FTable ");
        System.out.println(table.getTable("VIP") + " - is VIP table");
        System.out.println(currentTable.equals( "1") && !tableController.fT.getTable("1").isEmpty());


    }
public static void clearTable (){


    }


    ObservableList<tableModel> list = FXCollections.observableArrayList();


    public  void setPositions() {
        ObservableList<tableModel> lis = FXCollections.observableArrayList();
        if (currentTable.equals( "1") && !tableController.fT.getTable("1").isEmpty() ) {
           for (int i = 0; i< (tableController.fT.getTable("1").size()); i++){
              lis.add(new tableModel((tableController.fT.getTable("1")).get(i).getPos(), String.valueOf(tableController.fT.getTable("1").get(i).getAmount()), String.valueOf(tableController.fT.getTable("1").get(i).getPrice()), String.valueOf(Objects.requireNonNull(tableController.fT.getTable("1")).get(i).getPrice()* (tableController.fT.getTable("1")).get(i).getAmount())));
           }
        }
        if (currentTable.equals("2") && !tableController.sT.getTable("2").isEmpty()) {
            for (int i = 0; i< (tableController.sT.getTable("2")).size(); i++){
                lis.add(new tableModel(Objects.requireNonNull(tableController.sT.getTable("2")).get(i).getPos(), String.valueOf(tableController.sT.getTable("2").get(i).getAmount()), String.valueOf(tableController.sT.getTable("2").get(i).getPrice()), String.valueOf(tableController.sT.getTable("2").get(i).getPrice()* (tableController.sT.getTable("2")).get(i).getAmount())));
            }
        }
        if (currentTable.equals("3") && !Objects.requireNonNull(tableController.tT.getTable("3")).isEmpty()) {
            for (int i = 0; i< (tableController.tT.getTable("3")).size(); i++){
                lis.add(new tableModel((tableController.tT.getTable("3")).get(i).getPos(), String.valueOf(tableController.tT.getTable("3").get(i).getAmount()), String.valueOf(tableController.tT.getTable("3").get(i).getPrice()), String.valueOf(tableController.tT.getTable("3").get(i).getPrice()* (tableController.tT.getTable("3")).get(i).getAmount())));
            }
        }
        if (currentTable.equals("4") && !Objects.requireNonNull(tableController.foT.getTable("4")).isEmpty()) {
            for (int i = 0; i< (tableController.foT.getTable("4")).size(); i++){
                lis.add(new tableModel((tableController.foT.getTable("4")).get(i).getPos(), String.valueOf(tableController.foT.getTable("4").get(i).getAmount()),
                        String.valueOf(tableController.foT.getTable("4").get(i).getPrice()), String.valueOf(tableController.foT.getTable("4").get(i).getPrice()* Objects.requireNonNull(tableController.foT.getTable("4")).get(i).getAmount())));
            }
            }

        if (currentTable.equals("VIP") && Objects.requireNonNull(vT.getTable("VIP")).get(0) != null) {
            for (int i = 0; i< Objects.requireNonNull(vT.getTable("VIP")).size(); i++){
                lis.add(new tableModel(Objects.requireNonNull(vT.getTable("VIP")).get(i).getPos(), String.valueOf(vT.getTable("VIP").get(i).getAmount()), String.valueOf(vT.getTable("VIP").get(i).getPrice()), String.valueOf(vT.getTable("VIP").get(i).getPrice()* Objects.requireNonNull(vT.getTable("VIP")).get(i).getAmount())));
            }
            }
list = lis;
        tablePositions.setItems(lis);
}
public void updateTable(){

}

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        position.setCellValueFactory(new PropertyValueFactory<>("position"));
        count.setCellValueFactory(new PropertyValueFactory<>("count"));
        price.setCellValueFactory(new PropertyValueFactory<>("price"));
        sum.setCellValueFactory(new PropertyValueFactory<>("sum"));
        setPositions();



}
}