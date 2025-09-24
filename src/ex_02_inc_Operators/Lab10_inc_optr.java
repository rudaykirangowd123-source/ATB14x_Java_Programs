package ex_02_inc_Operators;

public class Lab10_inc_optr {
    public static void main(String[] args) {
        int m = 2;
        int n = ++m + m++;
        System.out.println("m = " + m);
        System.out.println("n = " + n);
        int a = 10;
        int b = a++;
        System.out.println(a);
        System.out.println(b);

    }
}
