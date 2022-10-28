import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NextLargeNumberTest {
  @Test
  void hasSameNumberOfOne() {
    NextLargeNumber nextLargeNumber = new NextLargeNumber();

    assertTrue(nextLargeNumber.hasSameCountOfOne("1100", "11000"));
    assertFalse(nextLargeNumber.hasSameCountOfOne("111100", "11000"));
  }

  @Test
  void getAnswer() {
    NextLargeNumber nextLargeNumber = new NextLargeNumber();

    assertEquals(83,nextLargeNumber.solution(78));
    assertEquals(23,nextLargeNumber.solution(15));
  }

}