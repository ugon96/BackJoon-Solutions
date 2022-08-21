package conditional;

import java.util.Scanner;

public class Num2480 {
    // 주사위 세개
    /*
        조건 1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
        조건 2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
        조건 3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // 첫 번째 눈
        int b = sc.nextInt();   // 두 번째 눈
        int c = sc.nextInt();   // 세 번째 눈
        int max = a;

        int price = 0;          // 상금


        if(a==b && b==c){
            // 조건 1에 해당
            price = 10000 + a*1000;
        } else if (a==b || a==c){
            // 조건 2에 해당
            price = 1000 + a*100;
        } else if (b ==c){
            // 조건 2에 해당
            price = 1000 + b*100;
        } else {
            // 조건 3에 해당
            if(max < b){
                max = b;
            }
            if( max < c){
                max = c;
            }
            price = max * 100;
        }
        if(price != 0) System.out.println(price);
    }
}
