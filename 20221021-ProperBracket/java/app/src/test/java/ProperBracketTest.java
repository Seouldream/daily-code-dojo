import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ProperBracketTest {
  @Test
  void simple() {
    ProperBracket properBracket = new ProperBracket();

    assertTrue(properBracket.solution("()()"));
    assertTrue(properBracket.solution("(())()"));
    assertFalse(properBracket.solution(")()("));
    assertFalse(properBracket.solution("(()("));
    assertTrue(properBracket.solution("(())"));
  }
}
