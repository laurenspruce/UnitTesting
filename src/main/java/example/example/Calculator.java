package example.example;

public class Calculator {

    public double add(double a, double b) {
        validateAmounts(a, b);
        return a + b;
    }

    public double subtract(double a, double b) {
        validateAmounts(a, b);
        return a - b;
    }

    public double multiply(double a, double b) {
        validateAmounts(a, b);
        return a * b;
    }

    public double divide(double a, double b) {
        validateAmounts(a, b);
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed.");
        }
        return a / b;
    }

    private void validateAmounts(double a, double b) {
        if (a <= 0 || b <= 0) {
            throw new IllegalArgumentException("Both amounts must be greater than zero.");
        }
    }
}
