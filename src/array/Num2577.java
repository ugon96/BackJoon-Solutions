package array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num2577 {
    // 숫자의 개수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int numA = Integer.parseInt(br.readLine());
        int numB = Integer.parseInt(br.readLine());
        int numC = Integer.parseInt(br.readLine());

        int multi = numA * numB * numC;

        int[] arrCount = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int n;
        while (multi != 0) {
            n = multi % 10;
            arrCount[n] += 1;
            multi /= 10;
        }

        for (int i = 0; i < arrCount.length; i++) {
            System.out.println(arrCount[i]);
        }
    }
}
