//1. main 페이지의 변수를 테스트 코드로 불러올수 있느가?
//2. 메소드를 불러오는 경우 메소드에 입력될 변수가 스트링 인트 인경우는 괜찮지만 배열인 경우는 불러올 수 있는가?
public class InnerProduct {
static int cal = 1;
  public int solution(int[] a, int[] b) {

    int answer = 0;
    for(int i = 0; i < a.length; i += 1) {
      answer += a[i]*b[i];
    }

    return answer;
  }
}

