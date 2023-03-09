package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainUI.fxml"));
        primaryStage.setTitle("OOO VTUMANE");
        primaryStage.setScene(new Scene(root, 598, 382));
        primaryStage.show();
        primaryStage.getIcons().add(new Image("cocktail.png"));
primaryStage.setResizable(false);
        System.out.println("123");

    }


    public static void main(String[] args) {
        launch(args);
    }
}
