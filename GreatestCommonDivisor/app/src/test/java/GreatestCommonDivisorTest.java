import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {
  @Test
  void GreatestCommonDivisor() {
    GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
    System.out.println(greatestCommonDivisor.getGreatestCommonDivisor(3,12));
    assertEquals(3,greatestCommonDivisor.getGreatestCommonDivisor(3,12));
    assertEquals(1,greatestCommonDivisor.getGreatestCommonDivisor(2,5));
  }
  @Test
  void leastCommonMultiple() {
    GreatestCommonDivisor greatestCommonDivisor = new GreatestCommonDivisor();
    assertEquals(12,greatestCommonDivisor.getleastCommonMultiple(3,12));
    assertEquals(10,greatestCommonDivisor.getleastCommonMultiple(5,10));
  }

}