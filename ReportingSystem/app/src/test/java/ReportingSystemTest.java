import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ReportingSystemTest {
  @Test
  void getNumbers() {
    ReportingSystem reportingSystem = new ReportingSystem();

    assertArrayEquals(new int[] {2,1,1,0},reportingSystem.getNumbers(
        new String[] {"muzi", "frodo", "apeach", "neo"}, new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}
    ));
  }

  @Test
  void getReported() {
    ReportingSystem reportingSystem = new ReportingSystem();
    String[] id_list = {"muzi", "frodo", "apeach", "neo"};
    String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};

    for(int i = 0; i < report.length; i += 1 ) {
      String[] reporteds = report[i].split(" ");
      String reported = reporteds[1];
  }
}