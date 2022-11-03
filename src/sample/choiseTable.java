package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class choiseTable {

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

    private void openNewScene(String window, String Title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(window));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(Title);
        stage.initModality(Modality.NONE);
        stage.showAndWait();
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
        });
}
    @FXML
    void openFifth(ActionEvent actionEvent) {
Fifth.setOnAction(event -> {
    try {
        openNewScene("/sample/tables.fxml","Пятый стол");
    } catch (IOException e) {
        e.printStackTrace();
        System.out.println("Пятый стол");
    }
});
    }

    @FXML
    void openFirst(ActionEvent actionEvent) {
firstTable.setOnAction(event -> {
    try {
        openNewScene("/sample/tables.fxml","Первый стол");
    } catch (IOException e) {
        e.printStackTrace();
    } });
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

    }

    @FXML
    void openSecond(ActionEvent actionEvent) {
        secondTable.setOnAction(event -> {
            try {
                openNewScene("/sample/tables.fxml","Второй стол");
            } catch (IOException e) {
                e.printStackTrace();
            } });
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
    }
    public void close(ActionEvent actionEvent) {
        Stage stage = (Stage) cancel.getScene().getWindow();
        stage.close();
    }


}
