import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MarathonerTest {
  @Test
  void booleanTest() {
    Marathoner marathoner = new Marathoner();

  assertTrue(marathoner.sameName(new String[] {"이너","이누"}));
  }
}