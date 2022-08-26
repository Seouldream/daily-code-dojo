import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class NumberStringAndEnglishWordTest {

  @Test
  void numberToString() {
    NumberStringAndEnglishWord numberStringAndEnglishWord =
        new NumberStringAndEnglishWord();
    assertEquals(1200,numberStringAndEnglishWord.solution("12zerozero"));
    assertEquals(1478,numberStringAndEnglishWord.solution("one4seveneight"));
    assertEquals(234567,numberStringAndEnglishWord.solution("23four5six7"));
    assertEquals(234567,numberStringAndEnglishWord.solution("2three45sixseven"));
    assertEquals(123,numberStringAndEnglishWord.solution("123"));

    assertEquals(1478,numberStringAndEnglishWord.solution("one4seveneight"));
  }


}