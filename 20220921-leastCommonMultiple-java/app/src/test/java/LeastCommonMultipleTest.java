import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class LeastCommonMultipleTest {
  @Test
  void findPrimeNumber() {
    LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

    assertTrue(leastCommonMultiple.isPrimeNumber(2));
    assertTrue(leastCommonMultiple.isPrimeNumber(3));
    assertFalse(leastCommonMultiple.isPrimeNumber(4));
    assertTrue(leastCommonMultiple.isPrimeNumber(5));
    assertFalse(leastCommonMultiple.isPrimeNumber(6));
    assertTrue(leastCommonMultiple.isPrimeNumber(7));
    assertFalse(leastCommonMultiple.isPrimeNumber(8));
    assertFalse(leastCommonMultiple.isPrimeNumber(9));
  }

  @Test
  void turnIntoPrime() {
    LeastCommonMultiple leastCommonMultiple = new LeastCommonMultiple();

    assertArrayEquals(new int[] {2},leastCommonMultiple.getPrimeNumber(2));
    assertArrayEquals(new int[] {2,3},leastCommonMultiple.getPrimeNumber(6));
    assertArrayEquals(new int[] {2,2},leastCommonMultiple.getPrimeNumber(8));
  }

}