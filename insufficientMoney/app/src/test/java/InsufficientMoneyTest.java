import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class InsufficientMoneyTest {
  @Test
  void simple() {
    int price = 3;
    int money = 20;
    int count = 4;
    int totalPrice = 0;
    //3 * 1 + 3 * 2 + 3 * 3
    for (int i = 1; i < count + 1; i += 1) {
      totalPrice += price * i;
    }
    int answer = totalPrice - money;
    if( totalPrice - money < 0 ) {
      answer = 0;
    }
    assertEquals(10,answer);
  }
}