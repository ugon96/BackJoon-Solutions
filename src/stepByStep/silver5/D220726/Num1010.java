package stepByStep.silver5.D220726;

/*
    #알고리즘 #Algorithm
    #조합 #순열 #permutation #Combination #조합과순열
    #파스칼의삼각형 #pascalsTriangle
    #팩토리얼 #factorial
    #재귀함수 #recursion

    #nCr, #nPr
    성질 1 : n+1Cr+1 = nCr + nCr+1 => nCr = n-1Cr-1 + n-1Cr
    성질 2 : nCn = nC0 = 1
    출처1 : https://st-lab.tistory.com/194
    출처2 : https://st-lab.tistory.com/159#%EC%95%8C%EA%B3%A0%EB%A6%AC%EC%A6%98
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num1010 {
    static int[][] memoization = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int lPoint = Integer.parseInt(st.nextToken());
            int rPoint = Integer.parseInt(st.nextToken());

            System.out.println(factorial(rPoint, lPoint));
        }
    }

    public static int factorial(int n, int r) {
        if (memoization[n][r] > 0) {
            return memoization[n][r];
        }

        // 성질 2
        if (n == r || r == 0) {
            return memoization[n][r] = 1;
        }

        // 성질 1
        return memoization[n][r] = factorial(n - 1, r - 1) + factorial(n - 1, r);
    }
}
