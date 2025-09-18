import java.util.Scanner;
public class Lab05_LargestInArray {
            public static void main(String[] args) {

            // Step 1: Create Scanner object for taking input
            Scanner sc = new Scanner(System.in);

            // Step 2: Ask user for the size of the array
            System.out.print("Enter the number of elements: ");
            int size = sc.nextInt();

            // Step 3: Declare an array with given size
            int[] numbers = new int[size];

            // Step 4: Take input for array elements
            System.out.println("Enter " + size + " numbers:");
            for (int i = 0; i < size; i++) {
                numbers[i] = sc.nextInt();
            }

            // Step 5: Assume first element is largest
            int largest = numbers[0];

            // Step 6: Loop through the array and find largest
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] > largest) {
                    largest = numbers[i];
                }
            }

            // Step 7: Print result
            System.out.println("The largest number is: " + largest);

            // Step 8: Close scanner (good practice)
            sc.close();
        }
    }
