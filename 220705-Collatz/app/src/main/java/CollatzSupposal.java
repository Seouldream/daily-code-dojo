//1. 주어진 조건을 작성 후 반복문을 만든다.
// 짝수 라면 -> 2로 나눈 나머지가 0 홀수 2로 나눈 나머지가 0이 아님
//
//2. 조건의 세부조건을 한번 시행할때마다 카운트 +1 을 해준다.

//개빡치네 안풀리면 잠오는데 그이유가 고작 타입이었다니 하 그래 타입도 고민해보자 ^^
public class CollatzSupposal {
  public int solution(int num) {
    int count = 0;

    while(num <= 1) {
      if(num == 1) {
        count = 0;
        break;
      }
      if (num % 2 == 0) {
        num /= 2;
        count += 1;
      }

      if (!(num % 2 == 0)) {
        num = (3 * num) + 1;
        count += 1;
      }

      if(count >= 500) {
        count = -1;
        break;
      }
    }
    int answer = 0;
    answer = count;

    return answer;
  }
}
