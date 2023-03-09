package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.cocts.*;
import sample.javaTables.*;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.regex.Pattern;


public class tableController implements Initializable {
    @FXML
    private Text totalSum;

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
    private TextField numberTable;

    @FXML
    private AnchorPane anchor;


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
    void ComboBoxUse(ComboBox box, TextField text, TextField count) {
        numberTable.setText(choiseTable.currentTabel);
        System.out.println(choiseTable.currentTabel);
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


    public void deleteAll() {
        firstPos.getSelectionModel().select(0);
        firstPrice.setText("");
        firstCount.setText("");
        firstSum.setText("");
        secondPos.getSelectionModel().select(0);
        secondPrice.setText("");
        secondCount.setText("");
        secondSum.setText("");
        thirdPos.getSelectionModel().select(0);
        thirdPrice.setText("");
        thirdPrice.setText("");
        thirdSum.setText("");
        fourPos.getSelectionModel().select(0);
        fourPrice.setText("");
        fourCount.setText("");
        fourSum.setText("");
    }

    public void CountUp(ActionEvent actionEvent) {
        // Choice type pay

        payOff.setOnAction(e -> {
            try {
                openNewScene("/sample/payWindow.fxml", "Оплата");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });

    }

    public void openTableCheck(ActionEvent actionEvent) {
        openCheck.setOnAction(e -> {
            tableCheckInfo.setCurrentTable(numberTable.getText());
            try {
                openNewScene("/sample/tableCheck.fxml", "Чек стола");
            } catch (IOException ioException) {
                ioException.printStackTrace();
            }
        });


    }

    public void delete(ActionEvent actionEvent) {

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
    static public firstTable fT = new firstTable(new ArrayList<>());
   static public secondTable sT = new secondTable(new ArrayList<>());
   static public thirdTable tT = new thirdTable(new ArrayList<>());
    static public fouthTable foT = new fouthTable(new ArrayList<>());
    static public fifthTable fiT = new fifthTable(new ArrayList<>());
    static public  vip vT = new vip(new ArrayList<>());


    public void addPosition(ActionEvent actionEvent) {
        if (numberTable.getText().equals("1")) {
            if (posIsNotNull(firstPos) ) {
                fT.addPos( firstPos.getValue().toString(), Integer.parseInt(firstCount.getText()), Integer.parseInt(firstPrice.getText()),"1");
            }
            if (posIsNotNull(secondPos)) {
                fT.addPos( secondPos.getValue().toString(), Integer.parseInt(secondCount.getText()), Integer.parseInt(secondPrice.getText()),"1" );
            }
            if (posIsNotNull(thirdPos)) {
                fT.addPos( thirdPos.getValue().toString(), Integer.parseInt(thirdCount.getText()), Integer.parseInt(thirdPrice.getText()), "1" );
            }
            if (posIsNotNull(fourPos)) {
               fT.addPos( fourPos.getValue().toString(), Integer.parseInt(fourCount.getText()), Integer.parseInt(fourPrice.getText()),"1");
            }
        }
        if (numberTable.getText().equals("2")) {
            if (posIsNotNull(firstPos) ) {

                sT.addPos( firstPos.getValue().toString(), Integer.parseInt(firstCount.getText()), Integer.parseInt(firstPrice.getText()), "2");
            }
            if (posIsNotNull(secondPos )) {
                sT.addPos( secondPos.getValue().toString(), Integer.parseInt(secondCount.getText()), Integer.parseInt(secondPrice.getText()),"2");
            }
            if (posIsNotNull(thirdPos) ) {
                sT.addPos( thirdPos.getValue().toString(), Integer.parseInt(thirdCount.getText()), Integer.parseInt(thirdPrice.getText()),"2" );
            }
            if (posIsNotNull(fourPos) ) {
                sT.addPos( fourPos.getValue().toString(), Integer.parseInt(fourCount.getText()), Integer.parseInt(fourPrice.getText()) ,"2");
            }
        }
        if (numberTable.getText().equals("3")) {
            if (posIsNotNull(firstPos)) {
               tT.addPos( firstPos.getValue().toString(), Integer.parseInt(firstCount.getText()), Integer.parseInt(firstPrice.getText()),"3" );
            }
            if (posIsNotNull(secondPos) ) {
                tT.addPos( secondPos.getValue().toString(), Integer.parseInt(secondCount.getText()), Integer.parseInt(secondPrice.getText()),"3" );
            }
            if (posIsNotNull(thirdPos)  ) {
                tT.addPos( thirdPos.getValue().toString(), Integer.parseInt(thirdCount.getText()), Integer.parseInt(thirdPrice.getText()),"3"  );
            }
            if (posIsNotNull(fourPos)  ) {
                tT.addPos( fourPos.getValue().toString(), Integer.parseInt(fourCount.getText()), Integer.parseInt(fourPrice.getText()),"3"  );
            }
        }
        if (numberTable.getText().equals("4")) {
            if (posIsNotNull(firstPos) ) {
                foT.addPos( firstPos.getValue().toString(), Integer.parseInt(firstCount.getText()), Integer.parseInt(firstPrice.getText()),"4" );
            }
            if (posIsNotNull(secondPos)  ) {
                foT.addPos( secondPos.getValue().toString(), Integer.parseInt(secondCount.getText()), Integer.parseInt(secondPrice.getText()),"4" );
            }
            if (posIsNotNull(thirdPos)  ) {
                foT.addPos( thirdPos.getValue().toString(), Integer.parseInt(thirdCount.getText()), Integer.parseInt(thirdPrice.getText()),"4"  );
            }
            if (posIsNotNull(fourPos)  ) {
                foT.addPos( fourPos.getValue().toString(), Integer.parseInt(fourCount.getText()), Integer.parseInt(fourPrice.getText()) ,"4" );
            }
        }if (numberTable.getText().equals("5")) {
            if (posIsNotNull(firstPos) ) {
                fiT.addPos( firstPos.getValue().toString(), Integer.parseInt(firstCount.getText()), Integer.parseInt(firstPrice.getText()),"5" );
            }
            if (posIsNotNull(secondPos)  ) {
                fiT.addPos( secondPos.getValue().toString(), Integer.parseInt(secondCount.getText()), Integer.parseInt(secondPrice.getText()),"5" );
            }
            if (posIsNotNull(thirdPos)  ) {
                fiT.addPos( thirdPos.getValue().toString(), Integer.parseInt(thirdCount.getText()), Integer.parseInt(thirdPrice.getText()),"5"  );
            }
            if (posIsNotNull(fourPos)  ) {
                fiT.addPos( fourPos.getValue().toString(), Integer.parseInt(fourCount.getText()), Integer.parseInt(fourPrice.getText()) ,"5" );
            }
        }
        if (numberTable.getText().equals("VIP")) {
            if (posIsNotNull(firstPos) ) {
                vT.addPos( firstPos.getValue().toString(), Integer.parseInt(firstCount.getText()), Integer.parseInt(firstPrice.getText()),"VIP" );
            }
            if (posIsNotNull(secondPos)  ) {
                vT.addPos( secondPos.getValue().toString(), Integer.parseInt(secondCount.getText()), Integer.parseInt(secondPrice.getText()),"VIP");
            }
            if (posIsNotNull(thirdPos)  ) {
                vT.addPos( thirdPos.getValue().toString(), Integer.parseInt(thirdCount.getText()), Integer.parseInt(thirdPrice.getText()) ,"VIP");
            }
            if (posIsNotNull(fourPos )) {
                vT.addPos( fourPos.getValue().toString(), Integer.parseInt(fourCount.getText()), Integer.parseInt(fourPrice.getText()) ,"VIP");
            }
        }
clearFullPos(firstPos,firstCount,firstPrice);
clearFullPos(secondPos,secondCount,secondPrice);
clearFullPos(thirdPos,thirdCount,thirdPrice);
clearFullPos(fourPos,fourCount,fourPrice);

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


        @Override
        public void initialize (URL url, ResourceBundle resourceBundle){
            System.out.println();



            numberTable.setText(choiseTable.currentTabel);
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
        void onlyNumbers (TextField field) {
            Pattern p = Pattern.compile("(\\d+\\.?\\d*)?");
            field.textProperty().addListener((observableValue, oldValue, newValue) -> {
                if (!p.matcher(newValue).matches()) field.setText(oldValue);
            });
        }

}