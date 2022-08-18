import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class WeirdStringTest {
  @Test
  void nullTest() {
   WeirdString weirdString = new WeirdString();

    assertEquals("TrY",weirdString.solution("try"));
    assertEquals("HeLlO",weirdString.solution("hello"));
  }

}