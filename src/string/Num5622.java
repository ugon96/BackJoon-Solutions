package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num5622 {
    // 다이얼
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();

        int time = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'A' || c == 'B' || c == 'C') {
                time += 3;
            } else if (c == 'D' || c == 'E' || c == 'F') {
                time += 4;
            } else if (c == 'G' || c == 'H' || c == 'I') {
                time += 5;
            } else if (c == 'J' || c == 'K' || c == 'L') {
                time += 6;
            } else if (c == 'M' || c == 'N' || c == 'O') {
                time += 7;
            } else if (c == 'P' || c == 'Q' || c == 'R' || c == 'S') {
                time += 8;
            } else if (c == 'T' || c == 'U' || c == 'V') {
                time += 9;
            } else if (c == 'W' || c == 'X' || c == 'Y' || c == 'Z') {
                time += 10;
            }
        }
        System.out.println(time);
    }
}
