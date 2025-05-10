package sample;

public class Calculation {
    public static int execute(int firstNum, char operator, int secondNum) {
        switch (operator) {
            case '+': return firstNum + secondNum;
            case '-': return firstNum - secondNum;
            case '×': return firstNum * secondNum;
            case '÷':
            if (secondNum == 0) {
                throw new ArithmeticException("ゼロで割ることはできません");
            }
               return firstNum / secondNum;
               default:
               throw new ArithmeticException();
        



        }

    }


}
