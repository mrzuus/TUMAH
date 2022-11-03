package sample;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import sample.cocts.*;

public class tableController {
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
    private static Text numberTable;

    @FXML
    public void posCount1(ActionEvent actionEvent){
        ComboBoxUse(firstPos,firstPrice);
    }

    @FXML
    public void posCount2(ActionEvent actionEvent){
        ComboBoxUse(secondPos,secondPrice);
    }
    @FXML
    public void posCount3(ActionEvent actionEvent){
        ComboBoxUse(thirdPos,thirdPrice);
    }
    @FXML
    public void posCount4(ActionEvent actionEvent){
        ComboBoxUse(fourPos,fourPrice);
    }

    @FXML
    static void ComboBoxUse(ComboBox box, TextField text) {
        switch (box.getValue().toString()) {
            case "Виски кола":
                text.setText(whiskeyCola.count);
                break;
            case "Кричащий оргазм":text.setText(String.valueOf((orgasm.count)));break;
            case "Стиратель памяти":text.setText(String.valueOf((memory.count)));break;
            case "Голубая лагуна":text.setText(String.valueOf((blueLagoon.count)));break;
            case "Черный русский":text.setText(String.valueOf((blackRussian.count)));break;
            case "Благодарный мертвец":text.setText(String.valueOf((deadman.count)));break;
            case "Негрони":text.setText(String.valueOf((negroni.count)));break;
            case "Отвертка":text.setText(String.valueOf((otvertka.count)));break;
            case "Джин тоник":text.setText(String.valueOf((ginTonic.count)));break;
            case "Полет на луну":text.setText(String.valueOf((flyToMoon.count)));break;
            case "Зеленая фея":text.setText(String.valueOf((greenSpirit.count)));break;
            case "Текила бум":text.setText(String.valueOf((tequilaBoom.count)));break;
            case "Лонг Айленд":text.setText(String.valueOf((longIsland.count)));break;
            case "Маргарита":text.setText(String.valueOf((margarita.count)));break;
            case "Маргарита клубничная":text.setText(String.valueOf((strawberryMargarita.count)));break;
            case "Дайкири":text.setText(String.valueOf((daiquiri.count)));break;
            case "Пина колада":text.setText(String.valueOf((pinaColada.count)));break;
            case "День без мужа":text.setText(String.valueOf((husband.count)));break;
            case "Свидание":text.setText(String.valueOf((meeting.count)));break;
            case "Вишневая любовь":text.setText(String.valueOf((cherryLove.count)));break;
            case "Текила Санрайз":text.setText(String.valueOf((tequilaSunrise.count)));break;
            case "Мохито":text.setText(String.valueOf((mohito.count)));break;
            case "Куба либре":text.setText(String.valueOf((cubaLibra.count)));break;
            case "Выстрел в голову":text.setText(String.valueOf((headshot.count)));break;
            case "Хиросима":text.setText(String.valueOf((hiroshima.count)));break;
            case "Медуза":text.setText(String.valueOf((medusa.count)));break;
            case "Боярский":text.setText(String.valueOf((boyarsky.count)));break;
            case "Б52":text.setText(String.valueOf((b52.count)));break;
            case "Рафаэлло":text.setText(String.valueOf((rafaello.count)));break;
            case "Таракан":text.setText(String.valueOf((beetle.count)));break;
            case "бомж":text.setText(String.valueOf((bomj.count)));break;
        }
    }
    @FXML
    public  void numericOnly(TextField field, TextField fieldPrice,TextField fieldSum) {

        field.setOnKeyPressed(event -> {

               fieldSum.setText(String.valueOf(Integer.parseInt(field.getText()) * Integer.parseInt(fieldPrice.getText())));
            });

        }

    @FXML
    void counts(ActionEvent actionEvent) {
        firstCount.setOnAction(event -> numericOnly(firstCount,firstPrice,firstSum));
        secondCount.setOnAction(event -> numericOnly(secondCount,secondPrice,secondSum));
        thirdCount.setOnAction(event -> numericOnly(thirdCount,thirdPrice,thirdSum));
        fourCount.setOnAction(event -> numericOnly(fourCount,fourPrice,fourSum));
    }

    @FXML
    public static void setNumberTable (String table) {
        numberTable.setText(table);
    }

    public void CountUp(ActionEvent actionEvent) {
        firstSum.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                int total = Integer.parseInt(firstSum.getText()) + Integer.parseInt(secondSum.getText()) + Integer.parseInt(thirdSum.getText()) + Integer.parseInt(fourSum.getText());
                totalSum.setText(String.valueOf(total) );

            }
        });
    }

    public void openTableCheck(ActionEvent actionEvent) {
    }

    public void delete(ActionEvent actionEvent) {
    }

    public void addPosition(ActionEvent actionEvent) {

    }
}
