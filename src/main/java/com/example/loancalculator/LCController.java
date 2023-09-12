package com.example.loancalculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LCController {
        @FXML
        private Button calculateButton;

        @FXML
        private TextField interestRateTextField;

        @FXML
        private TextField loanAmountTextField;

        @FXML
        private TextField loanTermTextField;

        @FXML
        private TextField monthlyPaymentTextField;

        @FXML
        private TextField totalPaymentTextField;

    @FXML
    void calculateButtonClick(ActionEvent event) {
        double loanAmount, interestRate, totalPayment, monthlyPayment;
        int loanTerm;

        loanAmount = Double.parseDouble(loanAmountTextField.getText());
        interestRate = Double.parseDouble(interestRateTextField.getText());
        loanTerm = Integer.parseInt(loanTermTextField.getText());

        totalPayment = loanAmount + (loanAmount * interestRate * loanTerm);
        monthlyPayment = totalPayment / (loanTerm * 12);

        loanAmountTextField.setText(" " + totalPayment);
        monthlyPaymentTextField.setText(" " + monthlyPayment);
    }
}