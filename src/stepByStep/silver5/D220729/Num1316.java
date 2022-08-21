package stepByStep.silver5.D220729;
/*
    #그룹단어체커 #단어 #문자열 #String
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Num1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String word;

        int NumOfGroupWords = 0;
        char c;
        Boolean isGroupWord;
        List<Character> listString;

        for (int i = 0; i < count; i++) {
            word = br.readLine();
            listString = new ArrayList<>();
            isGroupWord = true;
            for (int j = 0; j < word.length(); j++) {
                c = word.charAt(j);
                // word의 마지막 단어가 이미 list에 들어있다면 그룹단어가 아닌것으로 판별
                if (j == word.length()-1) {
                    if (listString.contains(c)) {
                        isGroupWord = false;
                    }
                } else {
                    // word 의 j번째 단어가 j+1 번째 단어와 다른경우 list에 넣어둠.
                    if (word.charAt(j + 1) != c) {
                        // 만약 리스트에 이미 다른 단어가 들어있는 경우 그룹단어가 아닌것으로 판별
                        if (listString.contains(c)) {
                            isGroupWord = false;
                        }
                        listString.add(c);
                    }
                }
            }
            if (isGroupWord) {
                NumOfGroupWords++;
            }
        }
        System.out.println(NumOfGroupWords);
    }
}
