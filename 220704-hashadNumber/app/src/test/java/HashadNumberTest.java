import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class HashadNumberTest {


  @Test
  void sumOfDigits() {
    int x = 13;
    String stringTypeOfx = String.valueOf(x);
    int sumOfDigits = 0;
    for (int i = 0; i < stringTypeOfx.length(); i += 1) {

      sumOfDigits += Character.getNumericValue(stringTypeOfx.charAt(i));
    }

    assertEquals(4, sumOfDigits);
  }


  @Test
  void hashad() {
    int x = 10;
    String stringTypeOfx = String.valueOf(x);
    int sumOfDigits = 0;
    for (int i = 0; i < stringTypeOfx.length(); i += 1) {

      sumOfDigits += Character.getNumericValue(stringTypeOfx.charAt(i));
    }
    boolean answer = x % sumOfDigits == 0;

    assertTrue(answer);

  }
}

