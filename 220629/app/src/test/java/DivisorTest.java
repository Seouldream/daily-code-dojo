import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisorTest {
@Test
  void simple() {
    int n = 5;
    double root = Math.sqrt(n);
    int answer = 0;


    for(int i = 1 ; i <= (int) root;i += 1 ) {
      int remainder = n % i;
      int rest = n / i;
      int minus = 0;
      if (rest == i) {
        minus = rest;
      }
      if(remainder == 0) {
        answer += rest + i - minus;
      }
    }

    assertEquals(6,answer);
  }
}