package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1546 {
    // 평균
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int sum = 0;                    // 입력받은 모든 점수 합산
        double aver;                       // 평균 점수
        int max = 0;                    // 입력 받은 점수 중 최대값

        int repet = Integer.parseInt(br.readLine());        // 입력 받을 과목 수

        int score;

        String str = br.readLine();

        StringTokenizer st = new StringTokenizer(str);
        for (int i = 0; i < repet; i++) {
            score = Integer.parseInt(st.nextToken());
            if(score>max)
                max = score;
            sum += score;
        }
        aver = (double)sum/max*100/repet;
        System.out.println(aver);
    }
}
