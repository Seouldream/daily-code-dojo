import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class CompressionTest {
  private List<String> dictionary;

  @BeforeEach
  void setup() {
    dictionary = new ArrayList<>();

    dictionary.add("A");
    dictionary.add("B");
    dictionary.add("C");
    dictionary.add("D");
    dictionary.add("E");
    dictionary.add("F");
    dictionary.add("G");
    dictionary.add("H");
    dictionary.add("I");
    dictionary.add("J");
    dictionary.add("K");
    dictionary.add("L");
    dictionary.add("M");
    dictionary.add("N");
    dictionary.add("O");
    dictionary.add("P");
    dictionary.add("Q");
    dictionary.add("R");
    dictionary.add("S");
    dictionary.add("T");
    dictionary.add("U");
    dictionary.add("V");
    dictionary.add("W");
    dictionary.add("X");
    dictionary.add("Y");
    dictionary.add("Z");
  }
  @Test
  void tester() {
    Compression compression = new Compression();

    assertEquals(11,compression.addDictionary("K","A",dictionary));
    assertEquals(1,compression.addDictionary("A","K",dictionary));
    assertEquals(27,compression.addDictionary("KA","O",dictionary));
    assertEquals(15,compression.addDictionary("O",null,dictionary));
  }

  @Test
  void tester2() {
    Compression compression = new Compression();

    assertEquals(20,compression.addDictionary("T","O",dictionary));
    assertEquals(15,compression.addDictionary("O","B",dictionary));
    assertEquals(2,compression.addDictionary("B","E",dictionary));

  }
}