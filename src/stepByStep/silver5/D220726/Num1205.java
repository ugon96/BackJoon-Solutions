package stepByStep.silver5.D220726;

/*
    #구현 #등수
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1205 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int count = Integer.parseInt(st.nextToken());
        int score = Integer.parseInt(st.nextToken());
        int limit = Integer.parseInt(st.nextToken());
        int rate = -1;
        Boolean onRaking = false;
        // 랭킹에 아무 점수도 없는 경우
        if(count == 0) {
            System.out.println("1");
        }
        else {
            st = new StringTokenizer(br.readLine());

            int[] arrInt = new int[count+1];

            for (int i = 0; i < arrInt.length; i++) {
                if(st.hasMoreTokens()) {
                    arrInt[i] = Integer.parseInt(st.nextToken());
                    if (arrInt[i] < score && limit > i) {
                        onRaking = true;
                        arrInt[i] = score;
                    }
                } else {
                    if(limit > i){
                        onRaking = true;
                        arrInt[i] = score;
                    }
                }

            }
            // 랭킹 리스트에 올라간 경우
            if(onRaking) {
                for (int i = 0; i < arrInt.length; i++) {
                    if (arrInt[i] == score) {
                        System.out.println(i+1);
                        break;
                    }
                }
            }
            // 랭킹 리스트에 올라가지 못했을 경우
            else {
                System.out.println("-1");
            }
        }
    }
}
