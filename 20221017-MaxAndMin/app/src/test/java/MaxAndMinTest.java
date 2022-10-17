import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MaxAndMinTest {
  @Test
  void simpleCase() {
    MaxAndMin maxAndMin = new MaxAndMin();

    assertEquals("1 4",maxAndMin.solution("1 2 3 4"));
    assertEquals("-4 -1",maxAndMin.solution("-1 -2 -3 -4"));
    assertEquals("-1 -1",maxAndMin.solution("-1 -1"));
    assertEquals("-5 4",maxAndMin.solution("-5 -2 1 4 3"));
  }
}
