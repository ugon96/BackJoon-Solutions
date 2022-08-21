package stepByStep.silver5.D220729;

/*
    #영화감독숌 #브루트포스알고리즘 #666
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());

        int i = 0;
        int count = 0;

        while(count < input){
            i++;
            if(String.valueOf(i).indexOf("666") != -1){
                count++;
            }
        }
        System.out.println(i);
    }
}
