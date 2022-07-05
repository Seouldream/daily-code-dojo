import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CollatzSupposalTest {
  @Test
  void simple() {
    CollatzSupposal collatzSupposal = new CollatzSupposal();
    int num = 626331;
    long longNum = Long.valueOf(num);
    int count = 0;
    if (longNum == 1) {
      count = 0;
    }

    while (!(longNum == 1)) {

      if (longNum % 2 == 0) {
        longNum /= 2;
        count += 1;
      }
        if (longNum == 1) {
          break;
        }




      if (!(longNum % 2 == 0)) {
        longNum *= 3;
        longNum += 1;
        count += 1;
        }
        if (longNum == 1) {
          break;
        }
      }

    if(count > 500 ) {
      count = -1;
    }





    int answer = 0;
    answer = count;

    assertEquals(8, answer);
  }
}
