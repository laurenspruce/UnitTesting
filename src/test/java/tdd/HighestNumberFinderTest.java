package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestNumberFinderTest {

    @Test
    public void find_highest_in_array_of_one_expect_single_item() {

        //  Arrange
        int input[] = {10};
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 10;

        //  Act
        int actualResult = cut.findHighestNumber(input);

        //  Assert
        assertEquals(expectedResult, actualResult);
        
    }
}
