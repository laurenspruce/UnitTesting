package example.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {

    @Test
    // Test to verify the initial balance is set correctly
    public void onConstruction_verify_object_initialised_correctly() {
        // Arrange
        double expectedResult = 34.75;
        BankAccount cut = new BankAccount(expectedResult);

        // Act
        double actualResult = cut.getBalance();

        // Assert
        assertEquals(expectedResult, actualResult, "Initial balance should match expected result.");
    }

    @Test
    // Test to verify crediting the account increases the balance
    public void onCredit_balance_increased_by_amount() {
        // Arrange
        double openingBalance = 34.75;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult = 39.75;

        // Act
        cut.credit(5);
        double actualResult = cut.getBalance();

        // Assert
        assertEquals(expectedResult, actualResult, "Balance should increase by the credited amount.");
    }

    @Test
    // Test to verify debiting the account decreases the balance
    public void onDebit_balance_decreased_by_amount() {
        // Arrange
        double openingBalance = 50.00;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult = 40.00;

        // Act
        cut.debit(10);
        double actualResult = cut.getBalance();

        // Assert
        assertEquals(expectedResult, actualResult, "Balance should decrease by the debited amount.");
    }

    @Test
    // Test to verify that debiting does not allow balance to go negative
    public void onDebit_balance_not_negative() {
        // Arrange
        double openingBalance = 20.00;
        BankAccount cut = new BankAccount(openingBalance);

        // Act
        cut.debit(25); // Attempt to debit more than balance
        double actualResult = cut.getBalance();

        // Assert
        assertEquals(openingBalance, actualResult, "Balance should remain unchanged if debit exceeds balance.");
    }

    @Test
    // Test to ensure that crediting a negative amount does not change the balance
    public void onCredit_negative_amount_balance_unchanged() {
        // Arrange
        double openingBalance = 100.00;
        BankAccount cut = new BankAccount(openingBalance);

        // Act
        cut.credit(-50); // Attempt to credit a negative amount
        double actualResult = cut.getBalance();

        // Assert
        assertEquals(openingBalance, actualResult, "Balance should remain unchanged when crediting a negative amount.");
    }

    @Test
    // Test to ensure that crediting zero does not change the balance
    public void onCredit_zero_amount_balance_unchanged() {
        // Arrange
        double openingBalance = 100.00;
        BankAccount cut = new BankAccount(openingBalance);

        // Act
        cut.credit(0); // Attempt to credit zero
        double actualResult = cut.getBalance();

        // Assert
        assertEquals(openingBalance, actualResult, "Balance should remain unchanged when crediting zero.");
    }

    @Test
    // Test to ensure that debiting zero does not change the balance
    public void onDebit_zero_amount_balance_unchanged() {
        // Arrange
        double openingBalance = 100.00;
        BankAccount cut = new BankAccount(openingBalance);

        // Act
        cut.debit(0); // Attempt to debit zero
        double actualResult = cut.getBalance();

        // Assert
        assertEquals(openingBalance, actualResult, "Balance should remain unchanged when debiting zero.");
    }

}

