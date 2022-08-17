public class InsufficientMoney {
  public long solution(int price, int money, int count) {
    int totalPrice = 0;
    for (int i = 1; i < count + 1; i += 1) {
      totalPrice += price * i;
    }
    int answer = totalPrice - money;
    if (totalPrice - money < 0) {
      answer = 0;
    }
    return answer;
  }
}
