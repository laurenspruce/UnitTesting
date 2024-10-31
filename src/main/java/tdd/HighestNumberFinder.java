package tdd;

public class HighestNumberFinder {

    public int findHighestNumber(int[] input) {
        if (input.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty");
        }

        int highestSoFar = input[0];

        for (int number : input) {
            if (number > highestSoFar) {
                highestSoFar = number;
            }
        }

        return highestSoFar;
    }
}
