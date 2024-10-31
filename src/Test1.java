import java.util.*;

public class Test1 {
  enum Operation {
    ADD, SUBTRACT, MULTIPLY, DIVIDE
  }
    public static double basicCalculator(final Operation operation, final int num1, final int num2) {
        double result = 0;
        if (operation == Operation.ADD) {
          result = num1 + num2;
        }
        else if (operation == Operation.SUBTRACT) {
          result = num1 - num2;
        }
        else if (operation == Operation.MULTIPLY) {
          result = num1 * num2;
        }
        else if (num2 == 0) {
          System.out.println("Error: Division by zero!");
        }
        else {
          result = ((double)num1) /  num2;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(basicCalculator(Operation.DIVIDE, 1, 2));
        System.out.println(basicCalculator(Operation.ADD, 3, 5));
    }
}
