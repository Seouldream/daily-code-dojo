//짧은 결론
//아이디 리스트가 주어지고
//리포트 행위가 주어짐
// k 기준에따라 리포트 행위의 목적어가 k 번 이상 나오면 리포트행위를 한 주체자의 아이디리스트 위치에 1 이들어
//조건 1 단 중복 신고 즉 동일한 행위자가 목적자 신고는 1회로 취급
//조건 2
//리포트의 스플릿 2번의 값을 가져온다 (신고당한사람)
// 2번의 값이 몇번이나 중복되는지 검사한다-> 아이디리스트에서 같은 것을 찾아서 -> 해당아이디자리에 카운트를 한다.

import java.util.*;

//중복 리포트 검사 조건 더하기
//신고 결과가 기록된 카운트어레이를 만듬
// k 번이상이면 신고가 됨
//신고가 된 리스트에 있는 명단의 사람을 신고한 사람에게 1을 카운트 해줌
//신고한 사라믈 어떻게 찾을거냐?  아까 스플릿한거 0번 즉 스플릿의 1번이 결과배열과
public class ReportingSystem {
  public int[] solution(String[] id_list, String[] report, int k) {
    //중복 신고 제거


    HashSet<String> reportList = new HashSet<>();
    for (String individualReportCase : report) {
      reportList.add(individualReportCase);
    }
    String[] reportWithout = new String[reportList.size()];

    int j = 0;
    for (String any : reportList) {
      reportWithout[j++] = any;
    }

    List<String> reporterList = new ArrayList<>();
    List<String> reportedList = new ArrayList<>();
    for (int i = 0; i < reportWithout.length; i += 1) {

      String[] reported = reportWithout[i].split(" ");
      reporterList.add(reported[0]);
      reportedList.add(reported[1]);
    }

    int[] countArray = new int[id_list.length];
    for (int i = 0; i < reportedList.size(); i += 1) {
      for (int z = 0; z < id_list.length; z += 1) {
        if (reportedList.get(i).equals(id_list[z])) {
          countArray[z] += 1;
        }
      }
    }

    int[] kCountArray = new int[countArray.length];

    for(int q = 0; q < countArray.length; q += 1) {
      if(countArray[q] >= k) {
        kCountArray[q] += 1;
      }
    }

    int[] resultArray = new int[id_list.length];
    HashMap map = new HashMap<String,Integer>();
    for(int q = 0; q < id_list.length; q += 1) {
      map.put(id_list[q], 0);
    }

    for (int q = 0; q < kCountArray.length; q += 1) {
      for (int z = 0; z < reportedList.size(); z += 1) {
        if (kCountArray[q] == 1 && id_list[q].equals(reportedList.get(z))) {
          // 확정신고가 아닌 사람들은 무시해주고 확정신고인사람들의 이름만 가쟈오기위해서 위를 해줌
          for (int x = 0; x < id_list.length; x +=1 ) {
            if (reporterList.get(z).equals(id_list[x])) {
              resultArray[x] += 1;
            }
          }
        }
      }
    }


    int[] answer = resultArray;
    return answer;

  }

  public int[] reportCountList(String[] id_list, String[] report) {
    HashSet<String> reportList = new HashSet<>();
    for (String individualReportCase : report) {
      reportList.add(individualReportCase);
    }
    String[] reportWithout = new String[reportList.size()];

    int j = 0;
    for (String any : reportList) {
      reportWithout[j++] = any;
    }


    List<String> reportedList = new ArrayList<>();
    for (int i = 0; i < reportWithout.length; i += 1) {
      String[] reporteds = reportWithout[i].split(" ");
      reportedList.add(reporteds[1]);
    }

    int[] countArray = new int[id_list.length];
    for (int i = 0; i < reportedList.size(); i += 1) {
      for (int z = 0; z < id_list.length; z += 1) {
        if (reportedList.get(i).equals(id_list[z])) {
          countArray[z] += 1;
        }
      }
    }

    return countArray;
  }
}

