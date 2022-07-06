import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class IntegerSquareRootTestTest {

  @Test
  void simple() {
    long n = 3;

    long answer = 0;
    List<Long> squarerootList = new ArrayList<>();
    long i = 1;
    while(i < 7100000) {
      squarerootList.add( i * i );
      i += 1;
    }

    if(squarerootList.contains(n) ) {
      long x = (long)Math.sqrt(n);

      answer = (x + 1) * (x + 1);
    }
    if(!squarerootList.contains(n)) {
      answer = -1;
    }


    assertEquals(-1,answer);
  }

}