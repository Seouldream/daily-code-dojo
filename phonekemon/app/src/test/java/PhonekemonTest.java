import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class PhonekemonTest {
  @Test
  void numbersOfPhonekemon() {
    Phonekemon phonekemon = new Phonekemon();

    assertEquals(2, phonekemon.solution(new int[] {3,1,2,3}));
  }

}