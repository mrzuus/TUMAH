package sample;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import sample.cocts.*;


import java.io.IOException;

public class Controller {
    @FXML
    private Text CashRevenue;

    @FXML
    private Button coctMap;

    @FXML
    private Text countTables;

    @FXML
    private Button countUp;

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
    private Button openTables;

    @FXML
    private Text revenue;

    @FXML
    private Button saveExcel;

    @FXML
    private TextField secondCount;

    @FXML
    private ComboBox<?> secondPos;

    @FXML
    private TextField secondPrice;

    @FXML
    private TextField secondSum;

    @FXML
    private Text stuffRevenue;

    @FXML
    private Text textRevenue;

    @FXML
    private Text textRevenueCash;

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

    @FXML
    private Text transferRevenue;



    private void openNewScene(String window, String Title) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(window));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(Title);
        stage.initModality(Modality.NONE);
        stage.showAndWait();
        stage.setResizable(false);

    }
   public void openCocktails(ActionEvent actionEvent){
        coctMap.setOnAction(event -> {
            try {
                openNewScene("/sample/coctailMenu.fxml", "Коктейльное меню");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
   }
   public void Tables(ActionEvent actionEvent) {
       openTables.setOnAction(event -> {     try {
              openNewScene("/sample/tableMenu.fxml","Столики");
           } catch (IOException e) {
               throw new RuntimeException(e); }
       });
   }

    public void counts (ActionEvent actionEvent){
//        firstCount.setOnAction(event -> numericOnly(firstCount));
//        secondCount.setOnAction(event -> numericOnly(secondCount));
//        thirdCount.setOnAction(event -> numericOnly(thirdCount));
//        fourCount.setOnAction(event -> numericOnly(fourCount));
    }

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
    public void ComboBoxUse(ComboBox box, TextField text) {
        choisePosition(box, text);
    }

    static void choisePosition(ComboBox box, TextField text) {
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


}
