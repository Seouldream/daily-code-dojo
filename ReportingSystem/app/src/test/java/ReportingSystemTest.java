
import org.junit.jupiter.api.*;

import java.sql.*;
import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class ReportingSystemTest {
/*  @Test
  void getNumbers() {
    ReportingSystem reportingSystem = new ReportingSystem();

    assertArrayEquals(new int[]{2, 1, 1, 0}, reportingSystem.getNumbers(
        new String[]{"muzi", "frodo", "apeach", "neo"}, new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}
    ));
  }*/

  @Test
  void getReportedList() {
    ReportingSystem reportingSystem = new ReportingSystem();
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
    List<String> reprotedList = new ArrayList<>();
    for (int i = 0; i < report.length; i += 1) {
      String[] reporteds = report[i].split(" ");
      reprotedList.add(reporteds[1]);

    }
    System.out.println(reprotedList);
  }

  @Test
  void getReportCountListWithoutRedundantReport() {
    ReportingSystem reportingSystem = new ReportingSystem();
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

    List<String> reprotedList = new ArrayList<>();
    for (int i = 0; i < report.length; i += 1) {
      String[] reporteds = report[i].split(" ");
      reprotedList.add(reporteds[1]);
    }

    int[] countArray = new int[id_list.length];
    for (int z = 0; z < reprotedList.size(); z += 1) {
      for (int j = 0; j < id_list.length; j += 1) {
        if (reprotedList.get(z).equals(id_list[j])) {
          countArray[j] += 1;
        }
      }
    }
    assertArrayEquals(new int[]{1, 2, 0, 2}, countArray);
  }

  @Test
  void addRedundantReportFilter() {
    ReportingSystem reportingSystem = new ReportingSystem();
    String[] id_list = {"con", "ryan"};
    String[] report = {"ryan con", "ryan con", "ryan con", "ryan con"};

    HashSet<String> reportList = new HashSet<>();
    for (String individualReportCase : report) {
      reportList.add(individualReportCase);
    }

    String[] reportWithout = new String[reportList.size()];

    int i = 0;
    for (String any : reportList) {
      reportWithout[i++] = any;
    }

    assertArrayEquals(new String[]{"ryan con"}, reportWithout);
  }


  @Test
  void reportCount() {
    ReportingSystem reportingSystem = new ReportingSystem();

    assertArrayEquals(new int[]{1, 2, 0, 2}, reportingSystem.
        reportCountList(new String[]{"muzi", "frodo", "apeach", "neo"},
            new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"}));
  }

  @Test
  void kCountsCondition() {
    ReportingSystem reportingSystem = new ReportingSystem();
    int[] countArray = {1, 2, 0, 2};
    int[] kCountArray = new int[4];
    int k = 2;

    for (int q = 0; q < countArray.length; q += 1) {
      if (countArray[q] >= k) {
        kCountArray[q] += 1;
      }
    }
    assertArrayEquals(new int[]{0, 1, 0, 1}, kCountArray);
  }


  //@Test
 /* void resultTest() {
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    int[] kcountArray = new int[]{0, 1, 0, 1};
    int[] resultArray = new int[kcountArray.length];
    for(int q = 0 ; q < kcountArray.length; q += 1) {
      if(kcountArray[q] == 1 && id_list[q]) {

      }
    }
  }*/

  @Test
  void hash() {
    ReportingSystem reportingSystem = new ReportingSystem();
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};

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


    //해쉬 맵의 짝 신고자와 신고받은사람 이 있다.
    // 아이디 리스트와 k번이상 신고받은 사람이 1로 표시된 체크리스트가 있다
    // 신고자가 신고한 사람이 k번 이상 신고된 사람이라면 신고자에게 알람  (케이스 1 무지가 프로도를 신고했다. 무지에게 카운트 1이 가도록하자)
    // k번 일치하면 -> 해쉬맵과 아이디 값을 찾음 ->  찾은 것의 키값을 -> 아이디리스트와 비교-> 일치하면 카운트 1을 해줌

    //{0,1,0,1} -> id list 1번(즉 프로도) 와 일치하는 것을 해쉬맵의 값에서 찾아라
    int[] kcountArray = new int[]{0, 1, 0, 1};
    int[] resultArray = new int[id_list.length];
    HashMap map = new HashMap<String,Integer>();
    for(int q = 0; q < id_list.length; q += 1) {
      map.put(id_list[q], 0);
    }
    // TODO  신고당한사람의 리스트를 가지고 무얼 할거냐 ?
    // 신고당한 사람을 신고한 사람을 리포티드 리스트에서 찾는다. -> 일치한다면 리포터 리스트의 같은 배열 숫자를 가져온다
    // 그럼 그거를 다시 아이디리스트와 비교하여 1을 더해준다
    for (int q = 0; q < kcountArray.length; q += 1) {
      for (int z = 0; z < reportedList.size(); z += 1) {
        if (kcountArray[q] == 1 && id_list[q].equals(reportedList.get(z))) {
          // 확정신고가 아닌 사람들은 무시해주고 확정신고인사람들의 이름만 가쟈오기위해서 위를 해줌
        for (int x = 0; x < id_list.length; x +=1 ) {
          if (reporterList.get(z).equals(id_list[x])) {
            resultArray[x] += 1;
          }
        }
        }
      }
    }
    for(int x : resultArray) {
      System.out.println(x);
    }

    assertArrayEquals(new int[] {2,1,1,0},resultArray);
  }
}