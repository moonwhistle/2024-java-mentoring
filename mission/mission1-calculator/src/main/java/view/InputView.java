package view;

import java.util.Scanner;

public class InputView {
    public void input() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        int num1 = scanner.nextInt();

        System.out.println("+,-,*,/ 를 입력하세요,");
        char symbol = scanner.next().charAt(0);

        System.out.print("두번째 숫자를 입력하세요");
        int num2 = scanner.nextInt();
    }

}


