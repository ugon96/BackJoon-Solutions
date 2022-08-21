package conditional;

import java.util.Scanner;

public class Num2753 {
    //윤년
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();

        // 4의 배수이면서 100의 배수가 아닐때
        if(year%400 == 0){
            System.out.println(1);
        } else if(year%4 == 0 && year%100 != 0){
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
