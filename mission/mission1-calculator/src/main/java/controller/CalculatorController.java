package controller;

import domain.Calculator;
import view.InputView;
import view.OutputView;

public class CalculatorController {
    InputView inputView;
    Calculator calculator;
    OutputView outputView;

    public CalculatorController(OutputView outputView, InputView inputView, Calculator calculator) {
        this.outputView = outputView;
        this.inputView = inputView;
        this.calculator = calculator;
        }

}

