import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;
////["muzi", "frodo", "apeach", "neo"]	["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]	2	[2,1,1,0]
class ReceiveReportResultTest {
  @Test
  void simple() {
    ReceiveReportResult receiveReportResult = new ReceiveReportResult();

    assertArrayEquals(new int[] {2,1,1,0},receiveReportResult.solution(
        new String[] {"muzi", "frodo", "apeach", "neo"},
        new String[] {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"},
        2)
    );
  }

  @Test
  void duplicateReport() {
    ReceiveReportResult receiveReportResult = new ReceiveReportResult();
    assertArrayEquals(new int[] {0,0},receiveReportResult.solution(
        new String[] {"con", "ryan"},
        new String[] {"ryan con", "ryan con", "ryan con", "ryan con"},
        3)
    );
  }
}
