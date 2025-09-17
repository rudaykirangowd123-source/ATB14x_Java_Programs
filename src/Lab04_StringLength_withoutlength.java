import java.util.Scanner;

public class Lab04_StringLength_withoutlength{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();  // dynamic input

        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // reached end of string
        }

        System.out.println("Length of the string: " + count);
        sc.close();
    }
}
