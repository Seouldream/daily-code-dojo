import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RotateBracketsTest {

  @Test
  void BracketTester() {
    RotateBrackets rotateBrackets = new RotateBrackets();

    assertTrue(rotateBrackets.tester("[](){}"));
    assertFalse(rotateBrackets.tester("](){}["));
    assertTrue(rotateBrackets.tester("(){}[]"));
    assertFalse(rotateBrackets.tester("[)(]"));
    assertFalse(rotateBrackets.tester("}}}"));
  }

  @Test
  void Rotate() {
    RotateBrackets rotateBrackets = new RotateBrackets();

    assertEquals("[](){}",rotateBrackets.rotate("[](){}",0));
    assertEquals("](){}[",rotateBrackets.rotate("[](){}",1));
    assertEquals("(){}[]",rotateBrackets.rotate("[](){}",2));
  }

  @Test
  void answer() {
    RotateBrackets rotateBrackets = new RotateBrackets();

    assertEquals(3,rotateBrackets.solution("[](){}"));
    assertEquals(2,rotateBrackets.solution("}]()[{"));
    assertEquals(0,rotateBrackets.solution("[)(]"));
    assertEquals(0,rotateBrackets.solution("}}}"));
  }
}
