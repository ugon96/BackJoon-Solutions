package array;

import java.io.*;

public class Num2562 {
    public static void main(String[] args) throws IOException {
        // 최댓값

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = -1;           // 최댓값을 저장
        int position = 0;       // 최댓값의 위치 저장
        for(int i = 0; i < 9 ; i++){
            int n = Integer.parseInt(br.readLine());
            if(n > max) {
                max = n;
                position = i+1;
            }
        }

        System.out.println(max+"\n"+position);
    }
}
