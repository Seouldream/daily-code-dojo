// n 의 나머지 가 1이 되게 하는 것 -> n -1 의 약수 -> 구하자
public class FindNumberWithRemainder1 {
  public int solution(int n) {
    int answer = 0;
    for(int i = 2; i <= n - 1; i += 1) {
      if( (n - 1) % i == 0) {
        answer = i;
        return answer;
      }
    }

    return answer;
  }
}