//이해
//hindex란 n편의 논문 중 h번 이상 인용된 논문이 h편 이상이고 나머지가 h 의 이하일때 h의 최댓값
// h를 어떻게 구할 것인가?
// 풀이
// h를 가설로 1 부터 시작하여 이 이상의 h가 있는지 일일이 확인 하는 방법은 어떨까?
// 1. h가 더 높은 값이 존재하는 지를 검증하는 함수를 먼저 만든다.
// 2. h를 구하는 함수를 만든다.
// 3. 테스트를 돌려본다.
// 4. 엣지 케이스 예외처리 해줌
// 5. hasEnough 가 예외 처리 구문
public class HIndex {
  public int solution(int[] citations) {
  int h = 0;
    for (int i = 1; i < citations.length + 1; i += 1) {
      if (!hasMaxH(citations, i) ) {
        h = i;
        break;
      }
    }

    for(int j = h; j >= 0 ; j -=1) {
      if(hasEnoughHCount(citations,j)) {
        return j;
      }
    }
    return h;
  }

  public boolean hasMaxH(int[] citations, int h) {
    int hCount = 0;
    int notHCount = 0;
    for (int citation : citations) {
      if (citation >= h) {
        hCount += 1;
      }
      if (citation < h) {
        notHCount += 1;
      }
    }
//모든 구성요소가 h 보다 같거나 크
    if (notHCount <= h && hCount > h) {
      return true;
    }
    return false;
  }

  public boolean hasEnoughHCount(int[] citations, int h) {
    int count = 0;
    for (int citation : citations) {
      if (citation >= h) {
        count += 1;
      }
    }

    return (count >= h);
  }
}
