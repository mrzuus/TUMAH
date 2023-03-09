package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import sample.javaTables.*;

public class confirmDelete {
static String currentTable = "";
    @FXML
    private Button close;

    @FXML
    private Button deleteTable;

    @FXML
    void closeConfirm(ActionEvent event) {
        Stage stage = (Stage) close.getScene().getWindow();
        stage.close();
    }

    @FXML
    void delTab(ActionEvent event) {
        if (currentTable == "1")
        {
            firstTable.getTable("1").clear();


        }
        if (currentTable == "2"){
           secondTable.getTable("2").clear();
        }
        if (currentTable=="3"){
            thirdTable.getTable("3").clear();
        }
        if (currentTable=="4"){
            fouthTable.getTable("4").clear();
        }
        if (currentTable == "VIP"){
           vip.getTable("VIP").clear();
        }
    }

}
