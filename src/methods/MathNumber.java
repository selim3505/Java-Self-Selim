package methods;

public class MathNumber {
    public static void main(String[] args) {
     int result = mathCalculator(12, '/', 4);
        System.out.println(result);

    }

    public static int mathCalculator(int n1, char operator, int n2) {
        if (n1 <= 0 || n2 <= 0) {
            return 0;
        }
        return switch (operator) {
            case '+' -> n1 + n2;
            case '-' -> n1 - n2;
            case '/' -> n1 / n2;
            case '*' -> n1 * n2;
            case '%' -> n1 % n2;
            default -> throw new ArithmeticException();
        };
    }

}