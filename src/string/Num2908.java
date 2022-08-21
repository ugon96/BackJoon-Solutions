package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2908 {
    // 상수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String originStr = br.readLine();
        String reverseStr = "";

        for (int i = originStr.length() - 1; i >= 0; i--) {
            reverseStr += originStr.charAt(i);
        }
        StringTokenizer st = new StringTokenizer(reverseStr);
        int numA = Integer.parseInt(st.nextToken());
        int numB = Integer.parseInt(st.nextToken());

        if (numA > numB) {
            System.out.println(numA);
        } else {
            System.out.println(numB);
        }
    }
}
