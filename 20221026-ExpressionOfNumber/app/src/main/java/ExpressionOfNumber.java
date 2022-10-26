
public class ExpressionOfNumber {
  public int solution(int number) {
    int count = 0;

    for (int j = 0; j < number; j += 1) {
      int total = 0;
      for (int i = 1 + j; i < number + 1; i += 1) {
        total += i;
        if(total > number) {
          break;
        }
        if (total == number) {
          count += 1;
          break;
        }
      }
    }

    int answer = count;
    return answer;
  }
}
