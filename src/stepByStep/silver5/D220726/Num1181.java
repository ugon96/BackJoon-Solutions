package stepByStep.silver5.D220726;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
    #문자열 #String #정렬 #Sort #Sorting
    #길이별 #사전순서 #length # dictionary
 */
public class Num1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] arrStr = new String[count];

        Set<String> setStr = new HashSet<>();
        for (int i = 0; i < count; i++) {
            setStr.add(br.readLine());
        }
        Iterator<String> iter = setStr.iterator();

        String inputStr;
        arrStr[0] = iter.next();
        for (int i = 1; i < setStr.size(); i++) {
            inputStr = iter.next();

            for (int j = i; j >= 0; j--) {
                if (j == 0) {
                    arrStr[j] = inputStr;
                    break;
                }
                // inputStr의 글자 수가 큰경우
                if (arrStr[j - 1].length() < inputStr.length()) {
                    arrStr[j] = inputStr;
                    break;
                }
                // inputStr의 글자 수가 작은경우
                else if (arrStr[j - 1].length() > inputStr.length()) {
                    arrStr[j] = arrStr[j - 1];
                }

                // 글자의 수가 같은경우
                else {
                    // 같은 단어인 경우
                    if (arrStr[j - 1].compareTo(inputStr) == 0) {
                        break;
                    }
                    // arrStr[j-1] 이 사전적으로 더 앞인경우
                    else if (arrStr[j - 1].compareTo(inputStr) < 0) {
                        arrStr[j] = inputStr;
                        break;
                    } else {    // inputStr 이 사전적으로 더 앞인경우
                        arrStr[j] = arrStr[j - 1];
                    }
                }
            }
        }
        for (int i = 0; i < arrStr.length; i++) {
            if(arrStr[i] != null) {
                System.out.println(arrStr[i]);
            } else{
                break;
            }
        }
    }
}