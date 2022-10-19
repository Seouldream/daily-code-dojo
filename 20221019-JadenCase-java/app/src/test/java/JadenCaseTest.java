import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class JadenCaseTest {
  @Test
  void simple() {
    JadenCase jadenCase = new JadenCase();
    assertEquals("3people Unfollowed Me",jadenCase.solution("3people unFollowed me"));
    assertEquals("For The Last Week",jadenCase.solution("for the last week"));
    assertEquals("For The Last       Week  ",jadenCase.solution("for the last       week  "));
  }

}