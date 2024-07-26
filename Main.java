import java.util.ArrayList;
import java.util.List;

/**
 * This program calculates the average of a list of numbers.
 */
public class Main {

    // List to store the numbers
    private List<Integer> numbers;

    /**
     * Constructor to initialize the list.
     */
    public Main() {
        numbers = new ArrayList<>();
    }

    /**
     * Adds a number to the list.
     *
     * @param number The number to be added
     */
    public void addNumber(int number) {
        numbers.add(number);
    }

    /**
     * Calculates the average of the numbers in the list.
     *
     * @return The average of the numbers as a double
     */
    public double calculateAverage() {
        if (numbers.isEmpty()) {
            return 0; // Return 0 if the list is empty
        }

        int sum = 0; // Variable to store the sum of the numbers

        // Loop through the list to calculate the sum
        for (int number : numbers) {
            sum += number;
        }

        // Calculate the average by dividing the sum by the number of elements
        return (double) sum / numbers.size();
    }

    /**
     * Main method to test the AverageCalculator.
     *
     * @param args Command line arguments
     */
    public static void main(String[] args) {
        Main calculator = new Main();

        // Add some numbers to the list
        calculator.addNumber(10);
        calculator.addNumber(20);
        calculator.addNumber(30);

        // Calculate and print the average
        double average = calculator.calculateAverage();
        System.out.println("The average is: " + average);
    }
}
