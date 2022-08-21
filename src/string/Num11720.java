package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num11720 {
    // 숫자의 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for(int i = 0; i< count; i++){
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(sum);
    }
}
