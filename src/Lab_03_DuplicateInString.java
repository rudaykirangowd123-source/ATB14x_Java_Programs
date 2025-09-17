import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Lab_03_DuplicateInString {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            // Input from user
            System.out.print("Enter a string: ");
            String str = sc.nextLine();

            // Convert string to lowercase (optional, for case-insensitive check)
            str = str.toLowerCase();

            // Create HashMap to store character counts
            Map<Character, Integer> charCountMap = new HashMap<>();

            // Traverse each character
            for (char ch : str.toCharArray()) {
                if (ch != ' ') { // ignore spaces
                    charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
                }
            }

            // Print duplicates
            System.out.println("\nDuplicate characters in the string:");
        for (Character ch : charCountMap.keySet()) {
            int count = charCountMap.get(ch);
            if (count > 1) {
                System.out.println(ch + " → " + count + " times");
            }
        }

            sc.close();
        }
    }
