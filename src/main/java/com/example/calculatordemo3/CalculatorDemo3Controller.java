package com.example.calculatordemo3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class CalculatorDemo3Controller implements Initializable {
//    @FXML
//    private Label welcomeText;
//
//    @FXML
//    protected void onHelloButtonClick() {
//        welcomeText.setText("Welcome to JavaFX Application!");
//    }

    @FXML
    private TextField txt_result;
    String op = "";
    long number1, number2;

    //click ctrl
    public void Number(ActionEvent ae) {
        String no = ((Button) ae.getSource()).getText();
        txt_result.setText(txt_result.getText() + no);


    }

    //second
    public void Operation(ActionEvent ae) {
        String operation = ((Button) ae.getSource()).getText();
        if (!operation.equals("=")) {
            if (!op.equals("")) {
                return;
            }
            op = operation;
            number1 = Long.parseLong(txt_result.getText());
            txt_result.setText("");
        } else {
            if (op.equals("")) {
                return;
            }
            number2 = Long.parseLong(txt_result.getText());
            calculate(number1, number2, op);
        }
    }

    public void calculate(long n1, long n2, String op) {
        switch (op) {
            case "+":
                txt_result.setText(n1 + n2 + "");
                break;
            case "-":
                txt_result.setText(n1 - n2 + "");
                break;
            case "*":
                txt_result.setText(n1 * n2 + "");
                break;
            case "/":
                if (n2 == 0) {
                    txt_result.setText("null");
                    break;
                }
                txt_result.setText(n1 / (double)n2 + "");
                break;
        }
    }
    public void exit(ActionEvent ae){
       String no = ((Button) ae.getSource()).getText();
        txt_result.setText("");
        number1=0;
        number2=0;
        op="";
    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}