//각 배열을 기호에 맞게 반복문으로 붙여준다.
public class PlusYinandYang {
  public int solution(int[] absolutes, boolean[] signs) {
    int answer = 123456789;

    for(int i = 0; i < absolutes.length; i += 1) {
      if(signs[i] == false) {
        absolutes[i] = - absolutes[i];
      }
    }
    answer = 0;
    for(int i = 0; i < absolutes.length; i += 1 ) {
      answer += absolutes[i];
    }

    return answer;

  }
}

