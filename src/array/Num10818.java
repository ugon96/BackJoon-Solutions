package array;

import java.util.Scanner;

public class Num10818 {
    // 최소, 최대
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int max;        // 최대값을 저장할 변수
        int min;        // 최소값을 저장할 변수
        int count;      // 주어지는 정수의 개수
//        String str;     // 주어지는 정수를 저장할 문장.
//        int[] intArray; // 주어지는 정수를 저장할 배열.

        count = sc.nextInt();
        int n;
        min = sc.nextInt();
        max = min;
        for (int i = 0; i < count - 1; i++) {
            n = sc.nextInt();
            if (min > n) {
                min = n;
            }
            if (max < n) {
                max = n;
            }
        }

        System.out.println("" + min + " " + max);
    }
}
