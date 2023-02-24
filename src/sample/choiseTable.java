package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class choiseTable implements Initializable {

    @FXML
    private Button Fifth;

    @FXML
    private Button firstTable;

    @FXML
    private Button fourth;

    @FXML
    private Button secondTable;

    @FXML
    private Button thirdTable;

    @FXML
    private Button vipTable;

    @FXML
    private Button cancel;

    public static String currentTabel = "";
public String getCurrentTabel(){
    return currentTabel;
}
public void setCurrentTabel (String str){
    currentTabel = str;
}

    private void openNewScene(String window, String Title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(window));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(Title);
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.show();
        stage.setResizable(false);

    }
@FXML
void openVip (ActionEvent actionEvent) {
        vipTable.setOnAction(event -> {
            try {
                openNewScene("/sample/tables.fxml","Вип");
            } catch (IOException e) {
                e.printStackTrace();
            }
            tableCheckInfo.clearTable();
        });

currentTabel = "VIP";
}
    @FXML
    public static Text numberTable;
    @FXML
    void openFifth (ActionEvent actionEvent) {
Fifth.setOnAction(event -> {
    try {
        openNewScene("/sample/tables.fxml","Пятый стол");
    } catch (IOException e) {
        e.printStackTrace();
    }
    tableCheckInfo.clearTable();
});
currentTabel = "5";
    }

    @FXML
    void openFirst(ActionEvent actionEvent) {
firstTable.setOnAction(event -> {
    try {
        openNewScene("/sample/tables.fxml","Первый стол");
    } catch (IOException e) {
        e.printStackTrace();
    } });
currentTabel = "1";
//        tableCheckInfo.clearTable();
    }

    @FXML
    void openFouth(ActionEvent actionEvent) {
        fourth.setOnAction(event -> {
            try {
                openNewScene("/sample/tables.fxml", "Коктейльная карта");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
//        tableCheckInfo.clearTable();
currentTabel = "4";
    }

    @FXML
    void openSecond(ActionEvent actionEvent) {
        secondTable.setOnAction(event -> {
            try {
                openNewScene("/sample/tables.fxml","Второй стол");
            } catch (IOException e) {
                e.printStackTrace();
            } });
//        tableCheckInfo.clearTable();
        currentTabel = "2";
    }

    @FXML
    void openThird(ActionEvent actionEvent) {
thirdTable.setOnAction(event -> {
    try {
        openNewScene("/sample/tables.fxml","Третий стол");
    } catch (IOException e) {
        e.printStackTrace();
    }
});
//        tableCheckInfo.clearTable();
currentTabel = "3";

    }
    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


    }
}
