import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WaterMelonTest {

  @Test
  void watermelonRow5000() {
    String watermelonRow = "";
        WaterMelon waterMelon = new WaterMelon();
        String watermelon = "수박";
    for(int i= 1; i < 5001 ;i += 1) {
      watermelonRow += watermelon;
    }
        assertTrue(watermelonRow.contains("수박수박수박수박수박수박"));
  }// 야매로  watermelonRow가 수박나열을 대충만든걸 확인

  @Test
  void substringResult() {
    String watermelonRow = "";
    WaterMelon waterMelon = new WaterMelon();
    String watermelon = "수박";
    for(int i= 1; i < 5001 ;i += 1) {
      watermelonRow += watermelon;
    }
//    String result = watermelonRow.substring(0,n-1);
    assertEquals("수박수",watermelonRow.substring(0,3));
    assertEquals("수박수박",watermelonRow.substring(0,4));
    assertEquals("수박수박수박수박수박",watermelonRow.substring(0,10));
  }


}