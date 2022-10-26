import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ExpressionOfNumberTest {
  @Test
  void simple() {
   ExpressionOfNumber expressionOfNumber = new ExpressionOfNumber();

   assertEquals(4,expressionOfNumber.solution(15));
  }
}