package ex_02_inc_Operators;

public class Lab09_tricky_incoperators {
    public static void main(String[] args) {
        int x = 5;
        int y = x++ + ++x + --x + x--;
        System.out.println("x = " + x);
        System.out.println("y = " + y);

    }
}
