   import java.util.*;
    public class Java_Automation {
               public static void main(String[] args) {
            // Sample input list of orders
            List<String> orders = Arrays.asList(
                    "Alice", "Bob", "Alice", "Charlie", "Bob", "Alice", "Bob");

            // Step 1: Count orders per user
            Map<String, Integer> orderCount = new HashMap<>();

            for (String user : orders) {
                orderCount.put(user, orderCount.getOrDefault(user, 0) + 1);
            }

            // Step 2: Find maximum orders
            int maxOrders = Collections.max(orderCount.values());

            // Step 3: Find users with max orders
            List<String> maxUsers = new ArrayList<>();
            for (Map.Entry<String, Integer> entry : orderCount.entrySet()) {
                if (entry.getValue() == maxOrders) {
                    maxUsers.add(entry.getKey());
                }
            }

            // Output
            System.out.println("Orders per user:");
            for (Map.Entry<String, Integer> entry : orderCount.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            System.out.println("\nMaximum Orders:");
            System.out.println("Max order count = " + maxOrders);
            System.out.println("User(s) with max orders = " + maxUsers);
        }
}
