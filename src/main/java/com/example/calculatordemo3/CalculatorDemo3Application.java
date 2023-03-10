package com.example.calculatordemo3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorDemo3Application extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(CalculatorDemo3Application.class.getResource("FXMLCalculatorDemo3.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), Color.BLUE);
        scene.setCursor(Cursor.HAND);
        stage.setTitle("Calculator!");
        stage.setScene(scene);


        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}