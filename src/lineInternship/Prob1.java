package lineInternship;


import java.util.*;

public class Prob1 {
    public static void main(String[] args) {
        String[] logs = {"morgan string_compare", "felix string_compare", "morgan reverse", "rohan sort", "andy reverse", "morgan sqrt"};
        System.out.println(solution(logs));
    }

    public static String[] solution(String[] logs) {
        Set<String> setLogs = new HashSet<>(Arrays.asList(logs));
        Set<String> setUser = new HashSet<>();
        Map<String, String> mapProbSolveCount = new HashMap<>();

        int count;
        for(String log : setLogs){
            System.out.println(log);
            String[] splitLog = log.split(" ");
            setUser.add(splitLog[0]);
            if(mapProbSolveCount.get(splitLog[1]) != null){
                count = Integer.parseInt(mapProbSolveCount.get(splitLog[1]));
                count++;
                mapProbSolveCount.put(splitLog[1], String.valueOf(count));
            } else {
                mapProbSolveCount.put(splitLog[1], "1");
            }
        }

        int numberOfStudt = setUser.size();
        System.out.println(numberOfStudt);

        String wellKnowProb = "";
        for(String key : mapProbSolveCount.keySet()){
            count = Integer.parseInt(mapProbSolveCount.get(key));
            System.out.println(count);
            if(count >= (double)numberOfStudt/2){
                wellKnowProb += key +" ";
            }
        }
        wellKnowProb = wellKnowProb.trim();
        String[] answer = wellKnowProb.split(" ");
        Arrays.sort(answer);
        return answer;
    }
}
