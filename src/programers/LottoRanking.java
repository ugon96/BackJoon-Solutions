package programers;

import java.util.ArrayList;
import java.util.List;

public class LottoRanking {
    // 로또의 최고 순위와 최저 순위
    class Solution {
        public int[] solution(int[] lottos, int[] win_nums) {
            int[] answer = new int[2];

            int zeroCount = 0;
            int hitCount = 0;

            List<Integer> listWinNums = new ArrayList<>();

            for(int number : win_nums){
                listWinNums.add(number);
            }

            for(int number : lottos){
                if(number==0){
                    zeroCount++;
                } else {
                    if(listWinNums.contains(number)){
                        hitCount++;
                    }
                }
            }

            int topRank = (hitCount+zeroCount) >= 2 ? 7-(hitCount+zeroCount) : 6;
            int lowRank = hitCount >= 2 ? 7-hitCount : 6;
            answer[0] = topRank;
            answer[1] = lowRank;
            return answer;
        }
    }
}
