package stepByStep.silver5.D220729;

/*
    #폴리오미노 # 그리디알고리즘
    그리디 알고리즘이란 욕심쟁이, 탐욕 알고리즘으로도 불리며, 미래를 생각하지 않고 각 단계에서 가장 최선의 선택을 하는 기법.
    이렇게 진행한 서택이 전체적으로도 최선이길 바라는 알고리즘.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Num1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        List<Integer> listInt = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'X') {
                count++;
                if (i == input.length() - 1) {
                    listInt.add(count);
                }
            } else {
                if (count != 0) {
                    listInt.add(count);
                    count = 0;
                }
                listInt.add(count);
            }
        }

        String result = "";
        Boolean flag = true;

        for (int i : listInt) {
            if(i == 0){
                result += ".";
            } else if (i % 2 != 0) {
                flag = false;
                break;
            } else {
                while (i > 0) {
                    if (i >= 4) {
                        result+="AAAA";
                        i -= 4;
                    } else {
                        result+="BB";
                        i -= 2;
                    }
                }
            }
        }
        if(flag){
            System.out.println(result);
        } else {
            System.out.println("-1");
        }

    }
}
