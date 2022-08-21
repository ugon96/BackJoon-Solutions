package function;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num1065 {
    // 한수
    // 1 ~ 99 의 모든 수는 각 자리가 등차수열을 이루는 한수
    // 따라서 case1 : 자연수 N 이 두자리 이하의 수인 경우 한수는 N개
    // case2 : 자연수 N 이 세자리 이상의 수인경우 1~99까지 100개
    //      + 100 ~ N 까지의 한수를 찾기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int count = 0;          // 한수의 개수

        if (n < 100) {
            count += n;
        } else {
            count = 99;         // 100보다 작은 한수의 개수
            while (n >= 100) {
                Boolean hanSu = true;
                int num = n;
                int dif = num%10 - (num/10)%10;;
                num = num/10;
                while(num>9){
                    if(dif != (num%10 - (num/10)%10)){
                        hanSu = false;
                    }
                    num = num/10;
                }
                if(hanSu){
                    count++;
                }
                n--;
            }
        }
    System.out.println(count);
    }
}
