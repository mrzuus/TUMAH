package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.util.regex.Pattern;

public class checkTables implements init {
    @FXML
    private Button addPos;

    @FXML
    private Button deleteTable;

    @FXML
    private TextField firstCount;

    @FXML
    private ComboBox<?> firstPos;

    @FXML
    private TextField firstPrice;

    @FXML
    private TextField firstSum;

    @FXML
    private TextField fourCount;

    @FXML
    private ComboBox<?> fourPos;

    @FXML
    private TextField fourPrice;

    @FXML
    private TextField fourSum;

    @FXML
    private Button openCheck;

    @FXML
    private Button payOff;

    @FXML
    private TextField secondCount;

    @FXML
    private ComboBox<?> secondPos;

    @FXML
    private TextField secondPrice;

    @FXML
    private TextField secondSum;

    @FXML
    private TextField thirdCount;

    @FXML
    private ComboBox<?> thirdPos;

    @FXML
    private TextField thirdPrice;

    @FXML
    private TextField thirdSum;



    @FXML
    public void ComboBoxUse(ComboBox box, TextField text) {
        Controller.choisePosition(box, text);
    }

    public void posCount1(ActionEvent actionEvent) {
    }

    public void posCount3(ActionEvent actionEvent) {
    }
@FXML
    void posCount2(ActionEvent actionEvent) {
        Pattern p = Pattern.compile("(\\d+\\.?\\d*)?");
    secondCount.textProperty().addListener((observable, oldValue, newValue) -> {
        if (!p.matcher(newValue).matches()) secondCount.setText(oldValue);
    });
    }
@FXML
    public void posCount4(ActionEvent actionEvent) {
        fourCount.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    fourCount.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });}
    @FXML
    public static void numericOnly( TextField textField) {
        textField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue,
                                String newValue) {
                if (!newValue.matches("\\d*")) {
                    textField.setText(newValue.replaceAll("[^\\d]", ""));
                }
            }
        });
    }
    @FXML
    public void counts (ActionEvent actionEvent){
        firstCount.setOnAction(event -> numericOnly(firstCount));
        secondCount.setOnAction(event -> numericOnly(secondCount));
        thirdCount.setOnAction(event -> numericOnly(thirdCount));
        fourCount.setOnAction(event -> numericOnly(fourCount));
    }
    @FXML
    @Override
    public void initialize() {
        Pattern p = Pattern.compile("(\\d+\\.?\\d*)?");
        secondCount.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) secondCount.setText(oldValue);
        });
    }

}