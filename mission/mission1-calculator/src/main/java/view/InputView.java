package view;

import java.util.Scanner;

public class InputView {

    Scanner scanner = new Scanner(System.in);

    public int firstNumber() {
        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = scanner.nextInt();
        return num1;}

    public int secondNumber() {
        System.out.print("두번째 숫자를 입력하세요");
        int num2 = scanner.nextInt();
        return num2;
    }

}
