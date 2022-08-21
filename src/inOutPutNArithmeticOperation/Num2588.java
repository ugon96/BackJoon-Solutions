package inOutPutNArithmeticOperation;


import java.util.Scanner;

public class Num2588 {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int numA = sc.nextInt();
        int numB = sc.nextInt();

        int a = numB/100;
        int b = numB%100/10;
        int c = numB%10;
        System.out.println(numA*c);
        System.out.println(numA*b);
        System.out.println(numA*a);
        System.out.println(numA*numB);
    }
}
