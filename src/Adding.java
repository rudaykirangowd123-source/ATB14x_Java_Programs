public class Adding {

    // This is a method (also a function, but bound to a class)
    public int add(int a, int b) {
        return a + b;
    }

    // Static method (can be called without object)
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        // Create object to call instance method
            Adding calc = new Adding();

        int sum = calc.add(5, 3);              // calling instance method
        int product = multiply(4, 2); // calling static method

        System.out.println("Sum: " + sum);
        System.out.println("Product: " + product);
    }
}
