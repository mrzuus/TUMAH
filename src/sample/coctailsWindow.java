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

public class coctailsWindow {

    @FXML
    private Button TequilaSunrise;

    @FXML
    private Button aperol;

    @FXML
    private Button b52;

    @FXML
    private Button beetle;

    @FXML
    private Button blackRussian;

    @FXML
    private Button blueLagoon;

    @FXML
    private Button boyarsky;

    @FXML
    private Button cherryLove;

    @FXML
    private Button closeMap;

    @FXML
    private Button cubaLibra;

    @FXML
    private Button daiquiri;

    @FXML
    private Button deadMan;

    @FXML
    private Button flyToMoon;

    @FXML
    private Button ginTonic;

    @FXML
    private Button greenSpirit;

    @FXML
    private Button headShot;

    @FXML
    private Button hiroshima;

    @FXML
    private Button homeless;

    @FXML
    private Button husband;

    @FXML
    private Button longIsland;

    @FXML
    private Button margarita;

    @FXML
    private Button medusa;

    @FXML
    private Button meeting;

    @FXML
    private Button memory;

    @FXML
    private Button mohito;

    @FXML
    private Button negroni;

    @FXML
    private Button orgasm;

    @FXML
    private Button otvertka;

    @FXML
    private Button pinaColada;

    @FXML
    private Button rafaello;

    @FXML
    private Button shurup;

    @FXML
    private Button strawberryMargarita;

    @FXML
    private Button tequilaBoom;

    @FXML
    private Button whiskeyCola;

    private void openNewScene(String window, String Title) throws IOException {
    Parent root = FXMLLoader.load(getClass().getResource(window));
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle(Title);
        stage.initModality(Modality.NONE);
        stage.showAndWait();
        stage.setResizable(false);

    }



    public void Close(ActionEvent actionEvent) {
        Stage stage = (Stage) closeMap.getScene().getWindow();
        stage.close();
    }

    public void whiskeyWindow(ActionEvent actionEvent) {
        whiskeyCola.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/whiskeyCola.fxml","Виски Кола");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void orgasmWindow(ActionEvent actionEvent) {
        orgasm.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/orgasm.fxml","Кричащий оргазм");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void memoryWindow(ActionEvent actionEvent) {
        memory.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/memory.fxml","Стиратель памяти");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void blueLagoonWindow(ActionEvent actionEvent) {
        blueLagoon.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/blueLagoon.fxml","Голубая лагуна");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void blackRussianWIndow(ActionEvent actionEvent) {
        blackRussian.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/blackRussian.fxml","Чёрный русский");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void deadmanWindow(ActionEvent actionEvent) {
        deadMan.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/deadman.fxml","Благодарный мертвец");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void aperolWindow(ActionEvent actionEvent) {
        aperol.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/aperol.fxml","Апероль Шпритц");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void negroniWindow(ActionEvent actionEvent) {
        negroni.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/negroni.fxml","Негрони");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void otvertkaWIndow(ActionEvent actionEvent) {
        otvertka.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/otvertka.fxml","Отвёртка ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void ginTonicWindow(ActionEvent actionEvent) {
        ginTonic.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/ginTonic.fxml","Джин Тоник");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void flyToMoonWindow(ActionEvent actionEvent) {
        flyToMoon.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/flyToMoon.fxml","Полёт на Луну");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void greenSpirit(ActionEvent actionEvent) {
        greenSpirit.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/greenSpirit.fxml","Виски Кола");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void shurupWindow(ActionEvent actionEvent) {
        shurup.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/shurup.fxml","Шуруповёрт");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void tequilaBoomWindow(ActionEvent actionEvent) {
        tequilaBoom.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/tequilaBoom.fxml","Текила Бум");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void longIslandWIndow(ActionEvent actionEvent) {
        longIsland.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/longIsland.fxml","Лонг Айленд");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void margaritaWIndow(ActionEvent actionEvent) {
        margarita.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/margarita.fxml","Маргарита");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void strawberryMargaritaWindow(ActionEvent actionEvent) {
        strawberryMargarita.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/strawberryMargarita.fxml","Клубничная Маргарита");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void daiquiriWindow(ActionEvent actionEvent) {
        daiquiri.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/daiquiri.fxml","Дайкири");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void pinaColadaWindow(ActionEvent actionEvent) {
        pinaColada.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/pinaColada.fxml","Пина Колада");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void husbandWindow(ActionEvent actionEvent) {
        husband.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/husband.fxml","День без мужа");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void meetingWindow(ActionEvent actionEvent) {
        meeting.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/meeting.fxml","Свидание");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void cherryLoveWindow(ActionEvent actionEvent) {
        cherryLove.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/cherryLove.fxml","Вишнёвая любовь");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void TequilaSunriseWindow(ActionEvent actionEvent) {
        TequilaSunrise.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/tequilaSunrise.fxml","Текила Санрайз");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void mohitoWIndow(ActionEvent actionEvent) {
        mohito.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/mohito.fxml","Мохито");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void cubaLibraWIndow(ActionEvent actionEvent) {
        cubaLibra.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/cubaLibra.fxml","Куба Либрэ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void headshotWindow(ActionEvent actionEvent) {
        headShot.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/headshot.fxml","Выстрел в голову");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void hiroshimaWindow(ActionEvent actionEvent) {
        hiroshima.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/hiroshima.fxml","Хиросима");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void medusaWIndow(ActionEvent actionEvent) {
        medusa.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/medusa.fxml","Медуза");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void boyarskyWindow(ActionEvent actionEvent) {
        boyarsky.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/boyarsky.fxml","Боярский");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void b52Window(ActionEvent actionEvent) {
        b52.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/b52.fxml","Б52");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void rafaelloWindow(ActionEvent actionEvent) {
        rafaello.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/rafaello.fxml","Рафаэлло");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void beetleWindow(ActionEvent actionEvent) {
        beetle.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/beetle.fxml","Таракан");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void homelessWindow(ActionEvent actionEvent) {
        homeless.setOnAction(event -> {
            try {
                openNewScene("/sample/tablesInfo/homeless.fxml","БОМЖ");
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
}
