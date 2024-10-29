package example.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*; //this makes building code slower



public class BankAccountTest {
    @Test
    //writing a test
    public void onConstruction_verify_object_initialised_correctly() {
        //3 a's
        //arrange create the object we are trying to test
        double expectedResult = 34.75;
        BankAccount cut = new BankAccount(expectedResult); //this is the thing thats on the test

        //act
        double actualResult = cut.getBalance();
        //assert
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void onCredit_balance_increased_by_amount(){
        //arrange
        double openingBalance = 34.75;
        BankAccount cut = new BankAccount(openingBalance);
        double expectedResult = 39.75;

        //act
        cut.credit(5);
        double actualResult = cut.getBalance();

        //assert
        assertEquals(expectedResult, actualResult);
    }


}
