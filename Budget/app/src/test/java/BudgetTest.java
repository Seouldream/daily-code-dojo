import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BudgetTest {
  @Test
  void simple() {
    Budget budget = new Budget();

    assertEquals(3,budget.solution(new int[] {1,3,2,5,4},9));
    assertEquals(4,budget.solution(new int[] {2,2,3,3},10));
    assertEquals(3,budget.solution(new int[] {3,3,3},10));
  }

  @Test
  void Array() {
    Budget budget = new Budget();

    int[] d = {1,3,2,5,4};
    Arrays.sort(d);
    assertArrayEquals(new int[]{1, 2, 3, 4, 5},d);
  }

}