import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class FailureRateTest {
  @Test
  void samaeNumberpercent() {
    FailureRate failureRate = new FailureRate();
    int[] stages = {2,1,2,6,2,4,3,3};
    int count = 0;
    failureRate.extracted(stages);

    assertEquals(,count);

  }

}