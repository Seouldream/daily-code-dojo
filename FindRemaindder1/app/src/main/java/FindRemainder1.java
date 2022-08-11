import java.util.stream.*;

public class FindRemainder1 {
  public int solution(int number) {
    int answer = 0;
   /* for(int i = 3 ; i < number ; i += 1) {
      if( number % i == 1 ) {
        answer = i;
        break;
      }
    }*/

    answer =
        IntStream.range(3, number).filter(i -> number % i == 1)
            .findFirst()
            .orElse(0);
    return answer;
  }
}