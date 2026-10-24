import java.util.Scanner;

public class SortNumbers {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Step 1: Ask the user to enter 10 numbers
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Step 2: Sort the numbers (smallest to biggest)
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        // Step 3: Show the sorted numbers
        System.out.println("Sorted numbers:");
        for (int i = 0; i < 10; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
