public class Lab05_Fibonacci {
            public static void main(String[] args) {
            int n = 7; // number of terms
            int first = 0, second = 1;
            System.out.print("Fibonacci Series: " + first + " " + second);

            for (int i = 3; i <= n; i++) {
                int next = first + second;
                System.out.print(" " + next);
                first = second;
                second = next;
            }
        }
    }

