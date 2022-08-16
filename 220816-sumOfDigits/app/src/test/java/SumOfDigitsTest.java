import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDigitsTest {
  @Test
  void simple() {
    SumOfDigits sumOfDigits = new SumOfDigits();

    assertEquals(6, sumOfDigits.solution(123));
  }
}
