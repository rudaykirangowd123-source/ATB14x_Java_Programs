package ex_02_inc_Operators;

public class Lab11_critical_inc_opertors {
    public static void main(String[] args) {
        int a = 2, b = 3;
        int result = a++ * --b + ++a / b--;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("result = " + result);

    }
}
