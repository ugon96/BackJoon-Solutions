package ShowMeTheCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numOfBall = 0;
        int[][] arr = new int[7][7];
        Boolean[][] arrBool = new Boolean[7][7];

        for (int i = 0; i < 7; i++) {
            String input = br.readLine();
            StringTokenizer st = new StringTokenizer(input);
            int sum = 0;
            for (int j = 0; j < 7; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num != 0) {
                    numOfBall++;
                }
                arr[i][j] = num;
            }
        }

        int downNumber = Integer.parseInt(br.readLine());
        int min = numOfBall;
        // i번쨰 줄에 공을 놓아서 만들어 지는 배열
        for (int j = 2; j < 3; j++) {
            int[][] newArr = arr;
            for (int i = 1; i < 7; i++) {
                if (newArr[i][j] != 0) {
                    if (newArr[i - 1][j] == 0) {
                        newArr[i - 1][j] = downNumber;
                        break;
                    }
                }
            }
            int result = arrSort(arr);
            if(min > result) {
                min = result;
            }
        }
        System.out.println(min);
    }

    public static int arrSort(int[][] arr) {

        int numberOfBall = 0;
        Boolean endFlag = true;
        Boolean[][] delItem = new Boolean[7][7];
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                delItem[i][j] = false;
            }
        }

        // 삭제 숫자 선별
        for (int i = 0; i < 7; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 7; j++) {
                rowSum += arr[i][j];
                colSum += arr[j][i];
            }
            for (int j = 0; j < 7; j++) {
                if (arr[i][j] == rowSum) {
                    delItem[i][j] = true;
                    endFlag = false;
                }
                if (arr[j][i] == colSum) {
                    delItem[j][i] = true;
                    endFlag = false;
                }
            }
        }

        // 숫자 삭제
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                if (delItem[i][j]) {
                    arr[i][j] = 0;
                } else {
                    numberOfBall++;
                }
            }
        }

        // 배열 정렬
        for (int i = 0; i < 7; i++) {
            int[] tempArr = {0,0,0,0,0,0,0};
            int size = 0;
            for (int j = 0; j < 7; j++) {
                if (arr[j][i] != 0) {
                    tempArr[size] = arr[j][i];
                    size++;
                }
            }
            for (int j = 6; j >= size; j--) {
                arr[j][i] = 0;
            }
            if(size != 0) {
                for (int j = 0; j <size ; j++) {
                    arr[j][i] = tempArr[size-j-1];
                }
            }
        }

        if(endFlag){
            return numberOfBall;
        } else {
            return arrSort(arr);
        }
    }

}
