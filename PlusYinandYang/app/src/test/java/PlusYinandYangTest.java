import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PlusYinandYangTest {
  @Test
  void simple() {
    PlusYinandYang plusYinandYang = new PlusYinandYang();

    assertEquals(9,plusYinandYang.solution(new int[] {4,7,12},new boolean[] {true,false,true}));
  }

}