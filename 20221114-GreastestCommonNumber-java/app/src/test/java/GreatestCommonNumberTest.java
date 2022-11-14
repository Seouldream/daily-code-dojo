import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonNumberTest {
  @Test
  void getGreatestCommonNumber() {
    GreatestCommonNumber greatestCommonNumber = new GreatestCommonNumber();
    assertEquals(24, greatestCommonNumber.getGreatestCommonNumber(8, 6));
    assertEquals(10, greatestCommonNumber.getGreatestCommonNumber(10, 5));
  }

  @Test
  void answer() {
    GreatestCommonNumber greatestCommonNumber = new GreatestCommonNumber();
    assertEquals(6, greatestCommonNumber.solution(new int[]{1, 2, 3}));
    assertEquals(168, greatestCommonNumber.solution(new int[]{2, 6, 8, 14}));
  }

}