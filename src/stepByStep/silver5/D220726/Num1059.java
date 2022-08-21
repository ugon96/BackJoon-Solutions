package stepByStep.silver5.D220726;

/*
    #수학 #부르트포스알고리즘 #정렬
    부르트 포스(brute force) 알고리즘이란 완전 탐색 알고리즘. 즉, 가능한 모든 경우의 수를 모두 타맥하면서 요구조건에 충족되는 결과만을 가져오는것
    장점은 예외 없이 100%의 확률로 정답만을 출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        int[] arrInt = new int[count];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < count; i++) {
            arrInt[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arrInt);

        int num = Integer.parseInt(br.readLine());

        int min = 0;    // num 보다 작은수 중에 제일 큰 수
        int max = 1001;  // num 보다 큰 수 중에 제일 작은 수
        Boolean flag = false;
        for (int i : arrInt) {
            if( num == i){
                flag = true;
            }
            if (i > num && i < max) {
                max = i;
            }
            if (i < num && i > min) {
                min = i;
            }
        }

        int sum = 0;

        // case 1 : num 이 제일 작은 수일때 가능한 좋은구간의 개수(자기 자신만 있는 구간 제외)
        sum += max - num - 1;
        // case 2 : num 이 제일 큰 수 일때 가능한 좋은 구간의 개수(자기 자신만 있는 구간 제외)
        sum += num - min - 1;

        // case 3 : num 을 포함한 3개 이상의 수를 가진 좋은 구간의 개수(num이 최소, 최대 일 때 제외)
        sum += (num - min - 1) * (max - num - 1);
        if(flag){
            System.out.println(0);
        } else {
            System.out.println(sum);
        }
    }
}
