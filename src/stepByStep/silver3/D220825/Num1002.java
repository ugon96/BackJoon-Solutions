package stepByStep.silver3.D220825;

/**
 * #알고리즘 #터렛 #원의성질
 *
 * 참조 : https://st-lab.tistory.com/90
 * 배운것 : #스트링빌더(StringBuilder) #while(testCase-- > 0)
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Num1002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int testCase = Integer.parseInt(br.readLine());

        while (testCase-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());

            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            sb.append(numberOfTarget(x1, y1, r1, x2, y2, r2)).append('\n');
        }
        System.out.println(sb);
    }

    public static int numberOfTarget(int x1, int y1, int r1, int x2, int y2, int r2) {
        // A. 접점의 개수가 무한할때
        // A-1. 중심점이 같고 반지름이 같을 때
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }

        // B. 접점의 개수가 하나 일 때
        // B-1. 내접할 때, 점1과 점2사이의 거리가 r1-r2 일때
        if (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) == Math.pow(r1 - r2, 2)) {
            return 1;
        }

        // B-2. 외접할 때, 점1(x1,y1)과 점2(x2,y2)사이의 거리가 r1+r2 일 때.
        if (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        // C. 접점의 개수가 0개일때
        // C-1. 두 점 사이의 거리가 r1-r2 보다 작을 때
        if (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) < Math.pow(r1 - r2, 2)) {
            return 0;
        }

        // C-2. 두 점 사이의 거리가 r1_r2 보다 클 때
        if (Math.pow(x1 - x2, 2) + Math.pow(y1 - y2, 2) > Math.pow(r1 + r2, 2)) {
            return 0;
        }

        // D. 그 외 는 2개
        else {
            return 2;
        }
    }
}
