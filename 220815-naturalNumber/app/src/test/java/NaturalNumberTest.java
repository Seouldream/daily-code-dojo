import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NaturalNumberTest {
  @Test
  void simple() {
    NaturalNumber naturalNumber = new NaturalNumber();

    for(int i :   naturalNumber.solution(12345)) {
      System.out.println("진짜 값: " + i);
    }

    assertArrayEquals(new int[] {5,4,3,2,1},naturalNumber.solution(12345));
  }
}