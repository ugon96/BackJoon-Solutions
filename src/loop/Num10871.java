package loop;

import java.io.*;
import java.util.StringTokenizer;

public class Num10871 {
    // X보다 작은 수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s);
        int count = Integer.parseInt(st.nextToken());
        int standInt = Integer.parseInt(st.nextToken());
        int temp = 0;

        s = br.readLine();
        st = new StringTokenizer(s);
        for(int i = 0 ; i< count ; i++){
            temp = Integer.parseInt(st.nextToken());
            if(temp < standInt)
                bw.write(""+temp+" ");
        }

        bw.flush();
        bw.close();
    }
}
