import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ParkingFeeTest {
  private ParkingFee parkingFee;
  @BeforeEach
  void setUp() {
    parkingFee = new ParkingFee();
  }

  @Test
  void sortChart() {
  assertEquals("",parkingFee.sortChart(new String[] {"05:34 5961 IN"}));
  }

}