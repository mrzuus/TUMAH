package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class mainController {
    @FXML
    private Button closeShift;

    @FXML
    private Button cocktailMap;

    @FXML
    private Text countOpenTables;

    @FXML
    private Button openTables;

    @FXML
    private Text revenue;

    @FXML
    private Text revenueCash;

    @FXML
    private Text revenueStuff;

    @FXML
    private Text revenueTransfer;

    private void openNewScene(String window, String Title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(window));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(Title);
        stage.initModality(Modality.NONE);
        stage.showAndWait();
        stage.setResizable(false);

    }
    public void openCockMap(ActionEvent actionEvent) {
        cocktailMap.setOnAction(event -> {
            try {
                openNewScene("/sample/coctailMenu.fxml", "Коктейльная карта");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void openTablesMenu(ActionEvent actionEvent) {
        openTables.setOnAction(event -> {
            try {
                openNewScene("/sample/tableMenu.fxml", "Столы");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void closeAndSave(ActionEvent actionEvent) {
        closeShift.setOnAction(event -> {
            try {
                openNewScene("/sample/confirmCloseShift.fxml", "Коктейльная карта");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
