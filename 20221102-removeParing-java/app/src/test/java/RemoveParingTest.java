import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class RemoveParingTest {
  @Test
  void removeFirstPair() {
    RemoveParing removeParing = new RemoveParing();

    assertEquals("bbaa",removeParing.removePair("baabaa"));
    assertEquals("aa",removeParing.removePair("bbaa"));
    assertEquals("",removeParing.removePair("aa"));
  }

  @Test
  void answer() {
    RemoveParing removeParing = new RemoveParing();

    assertEquals(1,removeParing.solution("baabaa"));
    assertEquals(0,removeParing.solution("cdcd"));
  }
}
