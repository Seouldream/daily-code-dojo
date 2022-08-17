import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class SumOfDivisorsTest {
  @Test
  void numbersOfDivisors() {
    SumOfDivisors sumOfDivisors = new SumOfDivisors();
    int left = 13;
    int right = 17;
    int countLeft = 0;
    int result = 0;
    for(int j= 13; j <= 17; j +=1) {
      for (int i = 1; i <= j; i += 1) {
        if (j % i == 0) {
          countLeft += 1;
        }
      }
      System.out.println(countLeft);
      if(countLeft % 2 == 0) {
        result += j;
      }
      if(countLeft % 2 != 0) {
        result -= j;
      }
      countLeft = 0;
    }



    assertEquals(43, result);
  }

}