package stepByStep.silver3.D220825;

/**
 * #스위치켜고끄기
 * #구현 #시뮬레이션 #스위치
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1244 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int S = Integer.parseInt(br.readLine());
        int[] arrSwitch = new int[S];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < S; i++) {
            arrSwitch[i] = Integer.parseInt(st.nextToken());
        }

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            st = new StringTokenizer(br.readLine());

            int gender = Integer.parseInt(st.nextToken());
            int num = Integer.parseInt(st.nextToken());
            if (gender == 1) {
                for (int i = 0; i < S; i++) {
                    if ((i + 1) % num == 0) {
                        arrSwitch[i] = Math.abs(arrSwitch[i] - 1);
                    }
                }
            } else {
                num--;


                arrSwitch[num] = Math.abs(arrSwitch[num] - 1);


                int i = 1;
                while (num + i < S && num - i >= 0) {
                    if (arrSwitch[num + i] == arrSwitch[num - i]) {
                        arrSwitch[num + i] = Math.abs(arrSwitch[num + i] - 1);
                        arrSwitch[num - i] = arrSwitch[num + i];
                        i++;
                    } else {
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < S; i++) {
            sb.append(arrSwitch[i]);
            if (i != 0 && (i+1)% 20 == 0) {
                sb.append("\n");
            } else {
                sb.append(" ");
            }
        }
        System.out.println(sb);
    }
}
