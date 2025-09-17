public class Lab_02_swapping {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";

        System.out.println("Before Swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);

        // Step 1: Concatenate both strings
        str1 = str1 + str2;  // str1 = "HelloWorld"

        // Step 2: Extract str2 from str1
        str2 = str1.substring(0, str1.length() - str2.length());
        // str2 = "Hello"

        // Step 3: Extract str1 from str1
        str1 = str1.substring(str2.length());
        // str1 = "World"

        System.out.println("\nAfter Swapping:");
        System.out.println("str1 = " + str1);
        System.out.println("str2 = " + str2);
    }
}
