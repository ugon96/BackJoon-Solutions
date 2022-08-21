package stepByStep.silver5.D220729;

/*
    #소트인사이드 #정렬 #문자열
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num1427 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();
        int num = Integer.parseInt(input);
        int[] arrInt = new int[input.length()];

        for(int i = 0; i<input.length(); i++){
            arrInt[i] = num%10;
            num /=  10;
        }

        Arrays.sort(arrInt);

        for(int i = arrInt.length-1; i >= 0; i--){
            System.out.print(arrInt[i]);
        }

    }
}
