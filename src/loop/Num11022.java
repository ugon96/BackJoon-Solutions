package loop;

import java.io.*;
import java.util.StringTokenizer;

public class Num11022 {
    // A+B - 8
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int count = Integer.parseInt(br.readLine());

        int a, b;                                        // 입력받아서 더할 두 수
        int sum;                                        // 더한 값을 저장할 변수.
        String s;


        for (int i = 1; i <= count; i++) {
            s = br.readLine();
            StringTokenizer st = new StringTokenizer(s);
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            sum = a+b;
            bw.write("Case #" + i + ": " + a + " + " + b + " = " + sum+"\n");
        }

        bw.flush();
        bw.close();
    }
}
