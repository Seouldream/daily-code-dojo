import org.junit.jupiter.api.*;

import java.util.stream.*;

import static org.junit.jupiter.api.Assertions.*;

class FindRemainder1Test {
  @Test
  void remainder1() {
    FindRemainder1 findRemainder1 = new FindRemainder1();

    assertEquals(3, findRemainder1.solution(10));
    assertEquals(11, findRemainder1.solution(12));
  }

  @Test
  void IntStream() {
    int number = 10;
    int answer =
        IntStream.range(3, number)
            .filter(i -> number % i == 1)
            .findFirst().orElse(0);

    assertEquals(3, answer);
  }
}
