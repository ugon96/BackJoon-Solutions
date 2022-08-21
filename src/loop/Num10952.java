package loop;

import java.util.Scanner;

public class Num10952 {
    // A+B - 5
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        int sum;
        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();
            if (a == 0 && b == 0) {
                break;
            } else {
                sum = a + b;
                System.out.println(sum);
            }
        }
    }
}
