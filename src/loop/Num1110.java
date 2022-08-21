package loop;

import java.util.Scanner;

public class Num1110 {
    // 더하기 사이클
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;              // 몇 사이클 반복했는지 카운트
        int n = sc.nextInt();                      // 처음 입력받는 수

        int orignNum = n;             // 새로운 수(n부터 시작)
        int newNum;

        int tenDigit;               // newNum의 10의 자리 수
        int oneDigit;               // newNum의 1의 자리 수


        while (true) {
            count++;                // 몇번째 사이클인지 카운트
            if (orignNum < 10) {
                newNum = orignNum * 11;
            } else {
                tenDigit = (orignNum % 10) * 10;
                oneDigit = ((orignNum % 10) + (orignNum / 10)) % 10;
                newNum = tenDigit + oneDigit;     // newNum(새로운 수)를 만드는 공식
            }
            if (newNum == n) {
                break;
            }
            orignNum = newNum;
        }
        System.out.println(count);
    }
}
