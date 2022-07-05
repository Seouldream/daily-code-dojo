import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class XspaceNumberTest {
  @Test
  void simple() {
    int x = 2;
    int n = 2;
    int result;
    long[] answer = new long[n];

    for (int i = 1; i < n + 1 ; i += 1) {
      result = x * i;
      answer[i-1] = result;

    }
    assertEquals("2,4", answer);

  }
}


 /*for(int i = 1; i < n+1; i += 1) {
    result = x*i;
    answer = new long[n];
    answer[i-1] = result;*/

class Solution {
  public long[] solution(int x, int n) {
    long z = Long.valueOf(x);

    long result;
    long[] answer = new long[n];

    for(int i = 1; i < n+1; i += 1) {
      result = z * i ;
      answer[i-1] = result;
    }
    return answer;
  }
}