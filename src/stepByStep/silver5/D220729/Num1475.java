package stepByStep.silver5.D220729;

/*
    #방번호 #구현
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Num1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String input = br.readLine();

        Map<Character, Integer> mapCount = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            mapCount.put((char)('0'+i), 0);
        }

        for (int i = 0; i < input.length(); i++) {
            mapCount.put(input.charAt(i), mapCount.get(input.charAt(i)) + 1);
        }

        mapCount.put('6', (int) Math.ceil((mapCount.get('6') + mapCount.get('9')) / 2.0));
        mapCount.remove('9');
        int max = 0;
        for(char c : mapCount.keySet()){
            if(max < mapCount.get(c)){
                max = mapCount.get(c);
            }
        }

        System.out.println(max);
    }
}
