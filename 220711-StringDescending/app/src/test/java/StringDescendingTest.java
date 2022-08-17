import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class StringDescendingTest {
  @Test
  void convert() {
    StringDescending stringDescending = new StringDescending();

    assertEquals("cba",stringDescending.solution("abc"));
    assertEquals("gfedcbZ",stringDescending.solution("Zbcdefg"));
  }

  @Test
  void processCapital() {

  }
}