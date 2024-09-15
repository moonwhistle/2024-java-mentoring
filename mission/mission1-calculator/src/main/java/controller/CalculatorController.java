package controller;

import view.InputView;
import domain.Calculator;
import view.OutputView;

public class CalculatorController {
    InputView inputView;
    Calculator calculator;
    OutputView outputView;

    public CalculatorController(OutputView outputView, InputView inputView, Calculator calculator) {
        this.inputView = inputView;
        this.calculator = calculator;
        this.outputView = outputView;
    }

    public void startController() {
        inputView = new InputView();
        calculator = new Calculator();
        outputView = new OutputView();

        int num1 = inputView.firstNumber();
        int num2 = inputView.secondNumber();

        outputView.outPut(calculator.plus(num1, num2));
        outputView.outPut(calculator.minus(num1, num2));
        outputView.outPut(calculator.multiplication(num1, num2));
        outputView.outPut(calculator.divide(num1, num2));
    }
}

