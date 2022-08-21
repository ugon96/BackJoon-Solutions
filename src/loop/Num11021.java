package loop;

import java.io.*;
import java.util.StringTokenizer;

public class Num11021 {
    // A+B - 7
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());        // 반복할 횟수
        int a, b;                                           // 입력받아서 더할 두 수
        int sum;                                            // 출력할 값(위에 두 수를 더한 값)

        String s;                                           // 입력받을 변수
        for(int i = 1; i <= count; i++){
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a+b;
            bw.write("Case #"+i+": "+sum+"\n");
        }
        bw.flush();
        bw.close();
    }
}
