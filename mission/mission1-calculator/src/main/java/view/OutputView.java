package view;

public class OutputView {
    public void outPut(int sum,int difference, int product, int quotient, char symbol) {

        switch (symbol) {
            case '+':
                System.out.println(sum);
                break;

            case '-':
                System.out.println(difference);
                break;

            case '*':
                System.out.println(product);
                break;

            case '/':
                System.out.println(quotient);
                break;
        }
    }
}

