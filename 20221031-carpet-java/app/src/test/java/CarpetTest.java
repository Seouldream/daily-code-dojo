import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CarpetTest {
  @Test
  void answer() {
    Carpet carpet = new Carpet();

    assertArrayEquals(new int[]{4, 3}, carpet.solution(10, 2));
    assertArrayEquals(new int[]{3, 3}, carpet.solution(8, 1));
    assertArrayEquals(new int[]{3, 3}, carpet.solution(8, 1));
    assertArrayEquals(new int[]{8, 6}, carpet.solution(24, 24));
  }

  @Test
  void edgeCase() {
    Carpet carpet = new Carpet();

    assertArrayEquals(new int[]{5, 5}, carpet.solution(16, 9));
  }
}