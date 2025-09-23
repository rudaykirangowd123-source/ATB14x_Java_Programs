package ex_03_Ternary_operator;
import java.util.Scanner;

public class Lab13_Maxof_3nums {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter all three numbers");
        int n1= sc.nextInt();
        int n2= sc.nextInt();
        int n3= sc.nextInt();
        int max = (n1 > n2) ? ((n1 > n3) ? n1 : n3) : ((n2 > n3) ? n2 : n3);
        System.out.printf("max is %d",max);
    }
}
