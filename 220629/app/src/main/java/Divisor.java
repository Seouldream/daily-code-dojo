import static java.lang.Math.sqrt;

//주어진 수의 제곱근을 구한다.
//제곱근 밑의 정수들로 나누어서 나누어떨어지는 지 확인
//나누어진다면 다시 주어진수를 나눌 수 있는 수(약수)로 주어진수를 나눈 값을 구한다 (또 다른 약수)
// 첫째로 구한 약수와 둘째로 구한 약수가 겹치는 부분을 구한다.
// 모두 더해줄때 겹치는건 빼준다.
 public class Divisor {
   public int solution(int n) {
  double root = Math.sqrt(n);
  int answer = 0;


    for(int i = 1 ; i <= (int) root;i += 1 ) {
    int remainder = n % i;
    int rest = n / i;
    int minus = 0;
    if (rest == i) {
      minus = rest;
    }
    if(remainder == 0) {
      answer += rest + i - minus;
    }
  }


    return answer;
  }
}
