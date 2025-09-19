import java.util.Scanner;

public class Lab06_Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input how many terms
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        // Step 2: First two terms of Fibonacci
        int first = 0, second = 1;

        // Step 3: Print first two terms
        System.out.print("Fibonacci Series: " + first + " " + second);

        // Step 4: Loop for remaining terms
        for (int i = 3; i <= n; i++) {
            int next = first + second;   // Current term = sum of previous two
            System.out.print(" " + next);

            // Update first and second for next iteration
            first = second;
            second = next;
        }

        sc.close();
    }
}
