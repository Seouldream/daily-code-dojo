import java.util.*;

// 범위가 50000000000000 (자그마치 0이 13개! )
// 7100000의 제곱 = 50410000000000  (그나마 내가 대충 구해본 5의 + 0 13개 값의 근사치 제곱근정수)
//리스트화 시키자 -> 1부터 저 숫자까지 각자 제곱한 거 리스트로 만들기
//해당값이 리스트 있는지 검사 -> 주어진 값이 저기에 있으면 n은 정수의 제곱 맞음
// 제곱근 구하는 메소드 이용해서 x 구해주기
// 리스트에 값이 있으면 정수 -> x + 1 의 제곱 값 구하고
// 없으면 걍 -1 리턴
// 이렇게 무식하게 하다니 너무웃기다
public class IntegerSquareRootTest {
  public long solution(long n) {
    long answer = 0;
    List<Long> squarerootList = new ArrayList<>();
    long i = 1;
    while(i < 7100000) {
      squarerootList.add( i * i );
      i += 1;
    }

    if(squarerootList.contains(n) ) {
      long x = (long)Math.sqrt(n);

      answer = (x + 1) * (x + 1);
    }
    if(!squarerootList.contains(n)) {
      answer = -1;
    }



    return answer;
  }

}
