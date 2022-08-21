package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1152 {
    // 단어의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = 0;

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()){
            count++;
            st.nextToken();
        }
        System.out.println(count);
    }
}
