import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class MarathonerTest {
  @Test
  void booleanTest() {
    Marathoner marathoner = new Marathoner();

  assertTrue(marathoner.sameName(new String[] {"아누","황","미스터킴","엘린","아누"}));
  }
}