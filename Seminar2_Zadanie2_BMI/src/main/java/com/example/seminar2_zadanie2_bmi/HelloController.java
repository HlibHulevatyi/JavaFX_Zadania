package com.example.seminar2_zadanie2_bmi;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField weightInput;

    @FXML
    private TextField heightInput;

    @FXML
    private Label resultLabel;

    @FXML
    public void onCalculateButtonClick(ActionEvent event) {
        try {
            double hmotnost = Double.parseDouble(weightInput.getText().replace(",", "."));
            double vyskaCm = Double.parseDouble(heightInput.getText().replace(",", "."));
            double vyskaM = vyskaCm / 100.0;
            double bmi = hmotnost / (vyskaM * vyskaM);

            String kategoria;
            if (bmi < 18.5) {
                kategoria = "podvaha";
            } else if (bmi < 25) {
                kategoria = "normalna hmotnost";
            } else if (bmi < 30) {
                kategoria = "nadvaha";
            } else {
                kategoria = "obezita";
            }
        } catch (NumberFormatException e) {
            resultLabel.setText("Chyba: Zadajte prosim platne cisla.");
        }
    }
}