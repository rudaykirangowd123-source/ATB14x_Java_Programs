package ex_03_Ternary_operator;
import java.util.Scanner;

public class Lab12_Sample_Ternary {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        String Result= n%2==0 ? "Even" : "Odd";
        System.out.println(Result);

        sc.close();


    }
}
