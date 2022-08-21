package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num2675 {
    // 문자열 반복
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < count; i++){
            String print ="";
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            int repeat = Integer.parseInt(st.nextToken());
            String input = st.nextToken();
            for(int j = 0; j < input.length(); j++){
                for(int k = 0; k < repeat; k++){
                    print += String.valueOf(input.charAt(j));
                }
            }
            System.out.println(print);
        }
    }
}
