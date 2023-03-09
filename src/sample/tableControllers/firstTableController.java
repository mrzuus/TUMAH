package sample.tableControllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import sample.choiseTable;
import sample.cocts.*;
import sample.javaTables.firstTable;
import sample.tableModel;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

public class firstTableController implements Initializable {
    @FXML
    private Button addPos;

    @FXML
    private AnchorPane anchor;

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
    private Text totalSum;
firstTable firstTable = new firstTable(new ArrayList<>());
    @FXML
    void CountUp(ActionEvent event) {

    }

    @FXML
    void addPosition(ActionEvent event) {
        if (posIsNotNull(firstPos) ) {
            firstTable.addPos( firstPos.getValue().toString(), Integer.parseInt(firstCount.getText()), Integer.parseInt(firstPrice.getText()),"1");
        }
        if (posIsNotNull(secondPos)) {
            firstTable.addPos( secondPos.getValue().toString(), Integer.parseInt(secondCount.getText()), Integer.parseInt(secondPrice.getText()),"1" );
        }
        if (posIsNotNull(thirdPos)) {
            firstTable.addPos( thirdPos.getValue().toString(), Integer.parseInt(thirdCount.getText()), Integer.parseInt(thirdPrice.getText()), "1" );
        }
        if (posIsNotNull(fourPos)) {
            firstTable.addPos( fourPos.getValue().toString(), Integer.parseInt(fourCount.getText()), Integer.parseInt(fourPrice.getText()),"1");
        }
    }

    @FXML
    void delete(ActionEvent event) {

    }

    @FXML
    void openTableCheck(ActionEvent event) {
        TableView<tableModel> table = new TableView<>();
        TableColumn<tableModel, String> position = new TableColumn<>("Позиции");
        TableColumn<tableModel, Integer> amount = new TableColumn<>("Количество");
        TableColumn<tableModel, Integer> price = new TableColumn<>("Цена");
        TableColumn<tableModel, Integer> sum = new TableColumn<>("Сумма");
        position.setCellValueFactory(new PropertyValueFactory<>("Позиции"));
        amount.setCellValueFactory(new PropertyValueFactory<>("Позиции"));
        price.setCellValueFactory(new PropertyValueFactory<>("Позиции"));
        sum.setCellValueFactory(new PropertyValueFactory<>("Позиции"));
        table.getColumns().addAll(position,price,amount,sum);
        table.setPrefWidth(250);
        table.setPrefHeight(200);
        StackPane root = new StackPane();
        Scene scene = new Scene(table,300,250);
        Stage stage = new Stage();
        stage.setScene(scene);
        Button btn = new Button("Изменить");
        root.getChildren().add(btn);
        btn.setLayoutX(150);
        btn.setLayoutX(200);
        stage.setTitle("Чек первого стола ");
        stage.show();
    }
    void ComboBoxUse(ComboBox box, TextField text, TextField count) {
        switch (box.getValue().toString()) {
            case "Виски кола":
                text.setText(whiskeyCola.count);
                break;
            case "Кричащий оргазм":
                text.setText(String.valueOf((orgasm.count)));
                break;
            case "Стиратель памяти":
                text.setText(String.valueOf((memory.count)));
                break;
            case "Голубая лагуна":
                text.setText(String.valueOf((blueLagoon.count)));
                break;
            case "Черный русский":
                text.setText(String.valueOf((blackRussian.count)));
                break;
            case "Благодарный мертвец":
                text.setText(String.valueOf((deadman.count)));
                break;
            case "Негрони":
                text.setText(String.valueOf((negroni.count)));
                break;
            case "Отвертка":
                text.setText(String.valueOf((otvertka.count)));
                break;
            case "Джин тоник":
                text.setText(String.valueOf((ginTonic.count)));
                break;
            case "Полет на луну":
                text.setText(String.valueOf((flyToMoon.count)));
                break;
            case "Зеленая фея":
                text.setText(String.valueOf((greenSpirit.count)));
                break;
            case "Текила бум":
                text.setText(String.valueOf((tequilaBoom.count)));
                break;
            case "Лонг Айленд":
                text.setText(String.valueOf((longIsland.count)));
                break;
            case "Маргарита":
                text.setText(String.valueOf((margarita.count)));
                break;
            case "Маргарита клубничная":
                text.setText(String.valueOf((strawberryMargarita.count)));
                break;
            case "Дайкири":
                text.setText(String.valueOf((daiquiri.count)));
                break;
            case "Пина колада":
                text.setText(String.valueOf((pinaColada.count)));
                break;
            case "День без мужа":
                text.setText(String.valueOf((husband.count)));
                break;
            case "Свидание":
                text.setText(String.valueOf((meeting.count)));
                break;
            case "Вишневая любовь":
                text.setText(String.valueOf((cherryLove.count)));
                break;
            case "Текила Санрайз":
                text.setText(String.valueOf((tequilaSunrise.count)));
                break;
            case "Мохито":
                text.setText(String.valueOf((mohito.count)));
                break;
            case "Куба либре":
                text.setText(String.valueOf((cubaLibra.count)));
                break;
            case "Выстрел в голову":
                text.setText(String.valueOf((headshot.count)));
                break;
            case "Хиросима":
                text.setText(String.valueOf((hiroshima.count)));
                break;
            case "Медуза":
                text.setText(String.valueOf((medusa.count)));
                break;
            case "Боярский":
                text.setText(String.valueOf((boyarsky.count)));
                break;
            case "Б52":
                text.setText(String.valueOf((b52.count)));
                break;
            case "Рафаэлло":
                text.setText(String.valueOf((rafaello.count)));
                break;
            case "Таракан":
                text.setText(String.valueOf((beetle.count)));
                break;
            case "бомж":
                text.setText(String.valueOf((bomj.count)));
                break;
            default:
                clearFullPos(box, text, count);
                break;

        }
        count.setText("1");
        if (box.getSelectionModel().getSelectedIndex() == 0) {
            count.setText("");
        }

    }
    public void clearFullPos(ComboBox pos, TextField count, TextField price) {
        pos.getSelectionModel().select(0);
        count.setText("");
        price.setText("");

    }
    boolean posIsNotNull (ComboBox pos){
        if (pos.equals(firstPos)){
            if(!firstPos.getSelectionModel().isEmpty() && !firstPos.getValue().toString().equals("Выбрать") && firstCount.getText() != "" && firstPrice.getText() != ""){
                return true;
            }
        }
        if (pos.equals(secondPos)){
            if( (!secondPos.getSelectionModel().isEmpty() &&  !secondPos.getValue().toString().intern().equals("Выбрать") && secondCount.getText() != null && secondPrice!= null)){
                return true;
            }
        }
        if (pos.equals(thirdPos)){
            if(!thirdPos.getSelectionModel().isEmpty() && !thirdPos.getValue().toString().intern().equals("Выбрать") && thirdCount.getText() != null && thirdPrice!= null){
                return true;
            }
        }
        if (pos.equals(fourPos)){
            return !fourPos.getSelectionModel().isEmpty() && !fourPos.getValue().toString().intern().equals("Выбрать") && fourCount.getText() != null && fourPrice != null;
        }
        return false;
    }
    public void setSum (TextField count, TextField price, TextField Sum){
        int calc = 0;
        int calc2 = 0;
        if (count.getText().length() > 0 && price.getText().length() > 0) {
            calc = Integer.parseInt(count.getText());
            calc2 = Integer.parseInt(price.getText());
        }
        Sum.setText(String.valueOf(calc * calc2));
    }
    public String totalAmount () {
        int sumAm = 0;
        if (firstSum.getText().length() > 0 && secondSum.getText().length() > 0 && thirdSum.getText().length() > 0 && fourSum.getText().length() > 0) {
            sumAm = (Integer.parseInt(firstSum.textProperty().getValue()) + (Integer.parseInt(secondSum.textProperty().getValue()) + Integer.parseInt(thirdSum.textProperty().getValue()) + Integer.parseInt(fourSum.textProperty().getValue())));
        }
        return String.valueOf(sumAm);
    }
    public int totalPosAmount (TextField count, TextField price){
        int calc = 0;
        int calc2 = 0;
        if (count.getText().length() > 0 && price.getText().length() > 0) {
            calc = Integer.parseInt(count.getText());
            calc2 = Integer.parseInt(price.getText());
        }
        return calc != 0 && calc2 != 0 ? calc * calc2 : 0;
    }
    void onlyNumbers (TextField field) {
        Pattern p = Pattern.compile("(\\d+\\.?\\d*)?");
        field.textProperty().addListener((observableValue, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) field.setText(oldValue);
        });
    }
    void openNewScene(String window, String Title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(window));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(Title);
        stage.initModality(Modality.NONE);
        stage.showAndWait();
        stage.setResizable(false);

    }
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Pattern p = Pattern.compile("(\\d+\\.?\\d*)?");
        firstSum.textProperty().addListener((observableValue) -> totalSum.setText(String.valueOf(totalAmount())));
        firstPrice.textProperty().addListener((observableValue) -> firstSum.setText(String.valueOf(totalPosAmount(firstCount, firstPrice))));
        secondSum.textProperty().addListener((observableValue) -> totalSum.setText(String.valueOf(totalAmount())));
        thirdSum.textProperty().addListener((observableValue) -> totalSum.setText(totalAmount()));
        fourSum.textProperty().addListener((observableValue) -> totalSum.setText(totalAmount()));
        secondPrice.textProperty().addListener((observableValue) -> secondSum.setText(String.valueOf(totalPosAmount(secondCount, secondPrice))));
        thirdPrice.textProperty().addListener(observable -> thirdSum.setText(String.valueOf(totalPosAmount(thirdCount, thirdPrice))));
        firstSum.textProperty().addListener((observable, oldValue, newValue) -> {
            if (!p.matcher(newValue).matches()) thirdCount.setText(oldValue); });
        // Set sum
        thirdCount.textProperty().addListener(observable -> {
            if (!thirdCount.getText().equals("")) setSum(thirdCount, thirdPrice, thirdSum); });
        firstCount.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!firstCount.getText().equals("")) setSum(firstCount, firstPrice, firstSum); });
        secondCount.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!secondCount.getText().equals("")) setSum(secondCount, secondPrice, secondSum); });
        thirdCount.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!thirdCount.getText().equals("")) setSum(thirdCount, thirdPrice, thirdSum); });
        fourCount.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!fourCount.getText().equals("")) setSum(fourCount, fourPrice, fourSum); });
        firstPrice.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!firstCount.getText().equals("")) setSum(firstCount, firstPrice, firstSum); });
        secondPrice.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!secondCount.getText().equals("")) setSum(secondCount, secondPrice, secondSum); });
        thirdPrice.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!thirdCount.getText().equals("")) setSum(thirdCount, thirdPrice, thirdSum); });
        fourPrice.textProperty().addListener((observableValue, oldValue, NewValue) -> {
            if (!fourCount.getText().equals("")) setSum(fourCount, fourPrice, fourSum); });
        // Set price from ComboBox
        firstPos.setOnAction(e -> ComboBoxUse(firstPos, firstPrice, firstCount));
        secondPos.setOnAction(e -> ComboBoxUse(secondPos, secondPrice, secondCount));
        thirdPos.setOnAction(e -> ComboBoxUse(thirdPos, thirdPrice, thirdCount));
        fourPos.setOnAction(e -> ComboBoxUse(fourPos, fourPrice, fourCount));
        onlyNumbers(thirdCount);
        onlyNumbers(thirdPrice);
        onlyNumbers(firstPrice);
        onlyNumbers(firstCount);
        onlyNumbers(fourCount);
        onlyNumbers(secondPrice);
        onlyNumbers(secondCount);
        onlyNumbers(fourPrice);
    }

}


