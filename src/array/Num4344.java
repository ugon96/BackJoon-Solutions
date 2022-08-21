package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num4344 {
    // 평균은 넘겠지
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int numOfStudt = Integer.parseInt(st.nextToken());  // 총 학생수
            int numOfAverStudt = 0;                 // 평균 이상 학생 수
            int sumScore = 0;                       // 케이스별 점수 총합
            double averScore;                       // 케이스별 평균 점수
            int[] arrScore = new int[numOfStudt];   // 각 학생의 점수 저장 배열

            int score;
            int j = 0;
            while (st.hasMoreTokens()) {
                score = Integer.parseInt(st.nextToken());
                sumScore += score;
                arrScore[j] = score;
                j++;
            }

            averScore = sumScore / numOfStudt;
            for (int k = 0; k < arrScore.length; k++) {
                if (arrScore[k] > averScore) {
                    numOfAverStudt++;
                }
            }
            System.out.printf("%.3f%%\n", (double)numOfAverStudt / numOfStudt * 100);
        }
    }
}
