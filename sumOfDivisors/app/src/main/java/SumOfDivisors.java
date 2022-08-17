//약수 = 나누어 떨어지는가 나누어서 0이 되게 하는수 의 갯수
//
public class SumOfDivisors {
  public int solution(int left, int right) {
    int countDivisors = 0;
    int result = 0;
    for(int j= left; j <= right; j +=1) {
      for (int i = 1; i <= j; i += 1) {
        if (j % i == 0) {
          countDivisors += 1;
        }
      }
      System.out.println(countDivisors);
      if(countDivisors % 2 == 0) {
        result += j;
      }
      if(countDivisors % 2 != 0) {
        result -= j;
      }
      countDivisors = 0;
    }

    int answer = result;
    return answer;
  }
}

