package programers;

import java.util.*;

public class GetReportResults {
    // 신교 결과 받기
    public int[] solution(String[] id_list, String[] report, int k) {
        final int size = 200;
        int[] answer = new int[id_list.length];

        Map<String, String> mapReportCount = new HashMap<>();       // 각 Id 가 몇번 신고당했는지 저장할 Map
        Map<String, String> mapMailCount = new HashMap<>();         // 각 id 가 몇번 메일 받을지 저장할 Map
        for(int i = 0; i< id_list.length; i++){
            mapReportCount.put(id_list[i], "0");
            mapMailCount.put(id_list[i], "0");
        }

        Set<String> setReport = new HashSet<>(Arrays.asList(report));       // 배열을 Set 형태로 변경하여 중복 제거


        // 각 id 가 몇번 신고당했는지 계산
        for(String line : setReport){
            String reportedId = line.split(" ")[1];     // 신고받은 Id
            int count = Integer.parseInt(mapReportCount.get(reportedId));
            count++;
            mapReportCount.put(reportedId, String.valueOf(count));
        }

        // 신고한 아이디가 정지 당한경우 메일 받을 횟수 count 증가
        for(String line : setReport){
            String[] arrReport = line.split(" ");
            String reporterId = arrReport[0];
            String reportedId = arrReport[1];
            if(Integer.parseInt(mapReportCount.get(reportedId)) >= k){
                int count = Integer.parseInt(mapMailCount.get(reporterId));
                count++;
                mapMailCount.put(reporterId, String.valueOf(count));
            }
        }

        for(int i = 0; i< id_list.length; i++){
            answer[i] = Integer.parseInt(mapMailCount.get(id_list[i]));
        }

        return answer;
    }
}
