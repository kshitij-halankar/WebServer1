package ws.calculatorapplication;

/**
 *
 * @author kshitij
 */
public class CalculatorImpl {
    public static int add(int num1, int num2) {
        return num1 + num2;
    }
    public static int subtract(int num1, int num2) {
        return num1 - num2;
    }
    public static int multiply(int num1, int num2) {
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
    public static int mod(int num1, int num2) {
        return num1 % num2;
    }
    public static int square(int num1) {
        return (int) Math.pow(num1, 2);
    }
    public static int cube(int num1) {
        return (int) Math.pow(num1, 3);
    }
    public static int sqrt(int num1) {
        return (int) Math.sqrt(num1);
    }
}
