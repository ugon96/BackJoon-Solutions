package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num3052 {
    // 나머지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr42 = new int[42];      // size 42의 배열을 만들어 서로 다른 나머지가 나올 경우 해당 순서의 수를 1더함
        Arrays.fill(arr42, 0);      // 배열 0으로 초기화

        int count = 0;          // 서로 다른 나머지의 개수 카운트

        int n;
        int remainder;
        for (int i = 0; i < 10; i++) {
            n = Integer.parseInt(br.readLine());
            remainder = n%42;
            arr42[remainder] += 1;
        }

        for(int i = 0; i<42; i++){
            if(arr42[i] != 0){
                count++;
            }
        }

        System.out.println(count);
    }
}
