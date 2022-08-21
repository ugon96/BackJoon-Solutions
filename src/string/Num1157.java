package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1157 {
    // 단어 공부
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char a = 'A';
        int max=0;
        char output = ' ';
        Boolean question = false;

        String input = br.readLine();
        input = input.toUpperCase();

        int[] arrCount = new int[26];
        char c;
        for(int i = 0; i < input.length(); i++){
            c = input.charAt(i);
            arrCount[c-a]++;
            if(arrCount[c-a] == max){
                question = true;
            }
            if(arrCount[c-a] > max){
                question = false;
                output = c;
                max = arrCount[c-a];
            }
        }
        if(question == true){
            System.out.println("?");
        } else {
            System.out.println(String.valueOf(output));
        }
    }
}
