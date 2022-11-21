import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LongJumpTest {
  @Test
  void getCasesByPosition() {
    LongJump longJump = new LongJump();

    assertEquals(5,longJump.solution(4));
    assertEquals(5,longJump.solution(4));
  }

}