package controller;

import view.InputView;
import domain.Calculator;
import view.OutputView;

public class CalculatorController {
   private final InputView inputView;
   private final OutputView outputView;
   private final Calculator calculator;

    public CalculatorController(OutputView outputView, InputView inputView, Calculator calculator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.calculator = calculator;
    }

    public void startController() {
        int user_Number1 = inputView.firstNumber();
        int user_Number2 = inputView.secondNumber();

        outputView.outPut(calculator.callPlus(user_Number1, user_Number2));
        outputView.outPut(calculator.callMinus(user_Number1, user_Number2));
        outputView.outPut(calculator.callMultiplication(user_Number1, user_Number2));
        outputView.outPut(calculator.callDivide(user_Number1, user_Number2));
    }
}
