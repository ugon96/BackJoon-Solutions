package stepByStep.silver3.D220825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * #피보나치(Fibonacci)수열 #다이나믹프로그래밍(DynamicProgramming)
 *
 * 참조 : https://sihyungyou.github.io/baekjoon-1003/
 */

public class Num1003 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        // 매번 피보나치 수열을 계산하여 출력하면 시간 초과 오류 발생.
        // 따라서, 한번에 계산해서 저장해두고 답을 출력하도록 수정

        int[] arrDP = new int[41]; // 최대 입력값이 0~40이므로 41칸 배열 설정.
        // 각 피보나치 수열의 0과 1의 출력값을 계산하면
        /**
         * N    zero    one
         * 0    1       0
         * 1    0       1
         * 2    1       1
         * 3    1       2
         * 4    2       3
         * 5    3       5
         * 6    5       8
         * 7    8       13
         */
        // 으로 n>2 일 때 fibonacci(1)의 출력 횟수는 arrDP[n] = arrDP[n-1] + arrDP[n-2] 임을 알 수 있음 fibonacci(0)의 출력횟수는 arrDP[n-1]
        // 따라서 arrDP 배열을 초기화 하면
        arrDP[0] = 0;
        arrDP[1] = 1;
        arrDP[2] = 1;
        for (int i = 3; i < 41; i++) {
            arrDP[i] = arrDP[i - 1] + arrDP[i - 2];
        }

        // 테스트 케이스 수 만큼 반복하면
        while (T-- > 0) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0 ){
                sb.append(1 +" " + 0).append('\n');
            } else if(num == 1) {
                sb.append(0 +" " + 1).append('\n');
            } else {
                sb.append(arrDP[num-1] + " " + arrDP[num]).append('\n');
            }
        }
        System.out.println(sb);
    }
}
