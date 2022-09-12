import java.util.*;

// 여러번 신고 가능 하지만 동일사람에대해 반복적인신고는 모두 1회처리
// k 번 신고당한 유저는 이용정지 및 신고한 모든 유저에게 알림이 감
// 신고당한 유저당 처리결과 메일 횟수 1회를 받음
// 각 멤버마다 처리결과 알람을 받은 횟수를 담은 인트 배열을 리턴하라
// 뒤의 불린 횟수가 k 번 이상이면 -> 신고를 받은 것이다.
// 어떻게 알림을 줄 것 인가? 찾아서 이름 키값과 비교
//["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
public class ReceiveReportResult {
  public int[] solution(String[] id_list, String[] report, int k) {
    LinkedHashMap<String,Integer> memberMapping = new LinkedHashMap<>();

    for(String member : id_list) {
      memberMapping.put(member, 0);
    }


    HashMap<String, Integer> reportedMapping = new HashMap<>();

    for(String member : id_list) {
      reportedMapping.put(member, 0);
    }

    HashSet<String> hashReport = new HashSet<>();

    for(String reportCase : report) {
      hashReport.add(reportCase);
    }

    for(String reportCase : hashReport) {
      String[] reporterAndReported = reportCase.split(" ");
      String reporter = reporterAndReported[0];
      String reported = reporterAndReported[1];
      reportedMapping.put(reported,reportedMapping.get(reported) + 1);
    }
    //k번 이상이면 이제 알림이 가야함
    //k번 이상인지 검사를 하자 그리고 이상이라면 리포터에게 알려주자 (어떻게?)
    //
    for(String reportCase : hashReport) {
      String[] reporterAndReported = reportCase.split(" ");
      String reporter = reporterAndReported[0];
      String reported = reporterAndReported[1];

      if(reportedMapping.get(reported) >= k) {
        memberMapping.put(reporter,memberMapping.get(reporter) + 1);
      }
    }
// [무지, 프로도 , 네오 ] -> 신고한 명단
    // [ 무지 , 프로도, 네오] -> 신고받은 횟수 명단
    int[] answer = new int[id_list.length];
    int i = 0;
    for( String member : memberMapping.keySet() ){
      answer[i] = memberMapping.get(member);
      i += 1;
    }

    return answer;
  }
}
