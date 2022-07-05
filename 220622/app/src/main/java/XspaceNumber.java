import java.io.IOException;

public class XspaceNumber {
  public long[] Solution(int x, int n) {

    int result;
    long[] answer = {};

    for (int i = 1; i < n + 1; i += 1) {
      result = x * i;
      answer = new long[n];
      answer[i - 1] = result;
    }
    return answer;

  }
}