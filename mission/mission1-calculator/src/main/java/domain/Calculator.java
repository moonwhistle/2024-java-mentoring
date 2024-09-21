package domain;

public class Calculator {

    private int plus(int user_Number1, int user_Number2) {
        int sum = user_Number1 + user_Number2;
        return sum;
    }

    private int minus(int user_Number1, int user_Number2) {
        int difference = user_Number1 - user_Number2;
        return difference;
    }

    private int multiplication(int user_Number1, int user_Number2) {
        int product = user_Number1 * user_Number2;
        return product;
    }

    private int divide(int user_Number1, int user_Number2) {
        if (user_Number2 == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }
        int quotient = user_Number1 / user_Number2;
        return quotient;
    }

    public int callPlus(int user_Number1, int user_Number2) {
       return plus(user_Number1,user_Number2);
    }

    public int callMinus(int user_Number1, int user_Number2) {
        return minus(user_Number1,user_Number2);
    }

    public int callMultiplication(int user_Number1, int user_Number2) {
        return multiplication(user_Number1,user_Number2);
    }

    public int callDivide(int user_Number1, int user_Number2) {
        return divide(user_Number1,user_Number2);
    }
}

