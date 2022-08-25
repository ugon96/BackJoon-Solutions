package stepByStep.silver3.D220825;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * #어린왕자
 */

public class Num1004 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());

            int P = Integer.parseInt(br.readLine());

            int count = 0;

            while (P-- > 0) {
                st = new StringTokenizer(br.readLine());

                int px = Integer.parseInt(st.nextToken());
                int py = Integer.parseInt(st.nextToken());
                int pr = Integer.parseInt(st.nextToken());


                // Case1 : 행성의 반지름이 출발지를 포함할 때
                if (Math.pow(px - x1, 2) + Math.pow(py - y1, 2) < Math.pow(pr, 2)) {
                    // Case1 - a ; 행성의 반지름이 도착지도 포함할 때
                    if (Math.pow(px - x2, 2) + Math.pow(py - y2, 2) < Math.pow(pr, 2)) {
                        count--;
                    }
                    // Case1 - b ; 행성의 반지름이 도착지는 포함하지 않을 때
                    else {
                        count++;
                    }
                }

                // Case2 : 행성의 반지름이 도착지만 포함할 때
                if (Math.pow(px - x2, 2) + Math.pow(py - y2, 2) < Math.pow(pr, 2)) {
                    count++;
                }
            }

            sb.append(count).append('\n');
        }

        System.out.println(sb);
    }
}
