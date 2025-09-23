package ex_03_Ternary_operator;

public class Lab14_age {
    public static void main(String[] args) {
        String user_input = args[0]; // 68
        System.out.println(user_input);
        System.out.println(user_input instanceof String);

        // Input - String
        // String - Int
        int age = Integer.parseInt(user_input);

        String result = (age < 18) ? "Minor" : (age <= 60) ? "Adult": "Sr. Citizen";
        System.out.println(result);
    }
}
