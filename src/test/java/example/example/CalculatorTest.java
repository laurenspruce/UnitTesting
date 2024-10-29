package example.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {

    private final Calculator cut = new Calculator();

    @Test
    public void onAdd_twoPositiveNumbers_resultIsSum() {
        // Arrange
        double a = 5.0;
        double b = 3.0;
        double expectedResult = 8.0;

        // Act
        double actualResult = cut.add(a, b);

        // Assert
        assertEquals(expectedResult, actualResult, "The result should be the sum of the two numbers.");
    }

    @Test
    public void onSubtract_twoPositiveNumbers_resultIsDifference() {
        // Arrange
        double a = 5.0;
        double b = 3.0;
        double expectedResult = 2.0;

        // Act
        double actualResult = cut.subtract(a, b);

        // Assert
        assertEquals(expectedResult, actualResult, "The result should be the difference of the two numbers.");
    }

    @Test
    public void onMultiply_twoPositiveNumbers_resultIsProduct() {
        // Arrange
        double a = 5.0;
        double b = 3.0;
        double expectedResult = 15.0;

        // Act
        double actualResult = cut.multiply(a, b);

        // Assert
        assertEquals(expectedResult, actualResult, "The result should be the product of the two numbers.");
    }

    @Test
    public void onDivide_twoPositiveNumbers_resultIsQuotient() {
        // Arrange
        double a = 6.0;
        double b = 3.0;
        double expectedResult = 2.0;

        // Act
        double actualResult = cut.divide(a, b);

        // Assert
        assertEquals(expectedResult, actualResult, "The result should be the quotient of the two numbers.");
    }

    @Test
    public void onDivide_byZero_throwsException() {
        // Arrange
        double a = 5.0;
        double b = 0.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.divide(a, b);
        }, "Division by zero should throw IllegalArgumentException.");
    }

    @Test
    public void onAdd_negativeNumber_throwsException() {
        // Arrange
        double a = -5.0;
        double b = 3.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.add(a, b);
        }, "Adding a negative amount should throw IllegalArgumentException.");
    }

    @Test
    public void onSubtract_negativeNumber_throwsException() {
        // Arrange
        double a = 5.0;
        double b = -3.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.subtract(a, b);
        }, "Subtracting a negative amount should throw IllegalArgumentException.");
    }

    @Test
    public void onMultiply_negativeNumber_throwsException() {
        // Arrange
        double a = -5.0;
        double b = 3.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.multiply(a, b);
        }, "Multiplying by a negative amount should throw IllegalArgumentException.");
    }

    @Test
    public void onDivide_negativeNumber_throwsException() {
        // Arrange
        double a = 5.0;
        double b = -3.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.divide(a, b);
        }, "Dividing by a negative amount should throw IllegalArgumentException.");
    }

    @Test
    public void onAdd_zeroAmount_throwsException() {
        // Arrange
        double a = 0.0;
        double b = 5.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.add(a, b);
        }, "Adding zero should throw IllegalArgumentException.");
    }

    @Test
    public void onSubtract_zeroAmount_throwsException() {
        // Arrange
        double a = 5.0;
        double b = 0.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.subtract(a, b);
        }, "Subtracting zero should throw IllegalArgumentException.");
    }

    @Test
    public void onMultiply_zeroAmount_throwsException() {
        // Arrange
        double a = 0.0;
        double b = 5.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.multiply(a, b);
        }, "Multiplying by zero should throw IllegalArgumentException.");
    }

    @Test
    public void onDivide_zeroAmount_throwsException() {
        // Arrange
        double a = 5.0;
        double b = 0.0;

        // Act & Assert
        assertThrows(IllegalArgumentException.class, () -> {
            cut.divide(a, b);
        }, "Dividing by zero should throw IllegalArgumentException.");
    }
}

