package lineInternship;

public class Prob2 {
    public static void main(String[] args) {
        int n = 4;
        int[] times = {2,3};
        System.out.println(solution(n, times));
    }
    public static int solution(int n, int[] times) {
        // 한번에 자를 줄의 개수 <= 현재 줄의 개수
        // 줄을 자를 수 있는 방법의 수 = time의 갯수
        int sumTime = 0;
        int line = 1;           // 현재 줄의 개수
        int numberOfOption = times.length;      // 자를 수 있는 최대 줄의 수 but : line 보다 작아야함.

        int numCutLine = 0;     // 현재 자르는 줄의 수
        int takesTime = times[numCutLine+1];        //결리는 시간
        int bestCutTime;
        double efficiency;              // 효율
        double bestEfficiency;              // 최고효율
        int bestCutLine =1;

        sumTime = times[0];     // 한번 줄을 잘랐을때 부터 시작
        line = 2;

        while(line<n){
            bestCutLine = 1;
            bestCutTime = times[0];
            bestEfficiency = (double)1/times[0];
            numCutLine = 2;
            while(line + numCutLine <= n && numCutLine <= numberOfOption && numCutLine<=line){
                takesTime = times[numCutLine-1];
                efficiency = (double)numCutLine/takesTime;

                if(efficiency > bestEfficiency){
                    bestEfficiency = efficiency;
                    bestCutLine = numCutLine;
                    bestCutTime = takesTime;
                }
                numCutLine++;
            }
            sumTime += bestCutTime;
            line += bestCutLine;
        }

        return sumTime;
    }
}

