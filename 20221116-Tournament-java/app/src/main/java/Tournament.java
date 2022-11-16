// 이해
// 2 n 승의 수인 사람들이 참가
// 한 라운드가 끝날때마다 절반의 사람들이 탈락 하고 나머승자는 차례대로 번호표를 1부터 부여받음 1 ~ 2 / n 까지
// 모두 이긴다고 가정할 때 이때 x를 부여받은 A는 y를 부여받은 B와 몇번째에 만나게 되나?
// 풀이
// 1. 홀수 짝수가 중요한가? -> 아니오 일듯하다
// 2. 두 선수가 언제 대전상대로 만나냐가 포인트이지 1,2 번으로 만나냐가 포인트가 아니다.
// 그림그려보기
// 1 2 3 4(A) 5 6  7(B)  8
// 1 2(A) 3 4(B)
// 1(A) 2(B)

// A의 경우 5 -> 3 -> 2 홀수이면 1을 더해준후 나눈수가 다음 번호가 된다.
// 짝수이면 그대로 나눠준 수가 다음 번호가 된다.
// a와 b 어느 수가 큰지도 중요
// 1. 더 큰 수를 int bigNumber = 에 대입해준다.
// 2. 작은수를 int smallNumber = 에 대입
// 3. 짝수인지 홀수 인지 판별
// 4. 짝수이면 그대로 나눠주고 홀수이면 + 1  나누기 2를 해서 다음 숫자를 구한다.
// 5. 카운트 1을 올린다.
// 6. 큰 숫자가 작은 숫자보다 1 클때 멈추고 카운트를 센다.

// 엣지 케이스 찾기

// 4 5
// 1 2 (3 4) (5 6) (7,8) (9,10) (11,12)
// -> 1, 2(에이), 3(비),4
// 1(에이), 2(비)

// 1  2  3   4(a)  5(b)   6   7   8
//  1     2(a)        3(b)      4
public class Tournament {
  public int solution(int n, int a, int b) {
    int answer = 0;

    while (true) {
      a = a / 2 + a % 2;
      b = b / 2 + b % 2;
      answer += 1;
      if (a == b) {
        break;
      }
    }
    return answer;
  }
}
