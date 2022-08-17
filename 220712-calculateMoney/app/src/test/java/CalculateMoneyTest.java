import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculateMoneyTest {
  @Test
  void moneyInneed() {
    CalculateMoney calculateMoney = new CalculateMoney();
    int x = 2;
    int y = 3;
    int result = 0;
    for(int i = 1; i < y + 1; i += 1 ) {
      result += x * i;
    }
    assertEquals(12, result);

    assertEquals(30, calculateMoney.getMoneyInNeed(3, 4));
    assertEquals(9, calculateMoney.getMoneyInNeed(3, 2));
    assertEquals(12, calculateMoney.getMoneyInNeed(2, 3));

  }

  // 3 +  9
  @Test
  void getAnswer() {
    CalculateMoney calculateMoney = new CalculateMoney();


    assertEquals(10, calculateMoney.solution(3, 20, 4));
    assertEquals(2, calculateMoney.solution(2, 10, 3));
  }
}