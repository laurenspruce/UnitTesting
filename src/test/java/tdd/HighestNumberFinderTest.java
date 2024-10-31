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

    @Test
    public  void   find_highest_in_array_of_two_descending_expect_first_element()
    {
        //  Arrange
        int array[] = {13,7};
        int expectedResult = 13;
        HighestNumberFinder cut = new HighestNumberFinder();

        //  Act
        int actualResult = cut.findHighestNumber(array);

        //  Assert
        assertEquals(expectedResult, actualResult);

    }

    @Test
    public  void   find_highest_in_array_of_two_ascending_expect_first_element()
    {
        //  Arrange
        int array[] = {7,13};
        int expectedResult = 13;
        HighestNumberFinder cut = new HighestNumberFinder();

        //  Act
        int actualResult = cut.findHighestNumber(array);

        //  Assert
        assertEquals(expectedResult, actualResult);

    }

    // New test for an array with negative numbers
    @Test
    public void find_highest_in_array_with_negatives_expect_highest() {
        // Arrange
        int input[] = {4, 5, -8, 3, 11, -21, 6};
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 11;

        // Act
        int actualResult = cut.findHighestNumber(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }

    // New test for an array with duplicate highest numbers
    @Test
    public void find_highest_in_array_with_duplicates_expect_one() {
        // Arrange
        int input[] = {1, 2, 2, 3, 3, 3, 2, 4, 4};
        HighestNumberFinder cut = new HighestNumberFinder();
        int expectedResult = 4;

        // Act
        int actualResult = cut.findHighestNumber(input);

        // Assert
        assertEquals(expectedResult, actualResult);
    }





}
