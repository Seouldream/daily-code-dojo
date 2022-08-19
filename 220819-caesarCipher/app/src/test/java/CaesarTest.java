import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CaesarTest {
  @Test
  void test() {
    Caesar caesar = new Caesar();

    assertEquals("bc",caesar.caesar("ab",1));
    assertEquals("a",caesar.caesar("z",1));
  }

}