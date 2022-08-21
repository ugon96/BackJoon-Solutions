package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num8958 {
    // OX퀴즈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int repet = Integer.parseInt(br.readLine());

        int[] arrScore = new int[repet];
        Arrays.fill(arrScore, 0);

        String s;
        char c;
        int score = 0;

        for (int i = 0; i < repet; i++) {
            s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                c = s.charAt(j);
                if (c == 'O') {
                    score++;
                    arrScore[i] += score;
                } else if (c == 'X') {
                    score = 0;
                }
            }
            score = 0;
        }

        for (int i = 0; i < arrScore.length; i++) {
            System.out.println(arrScore[i]);
        }

    }
}
