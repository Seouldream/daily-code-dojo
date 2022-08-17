import java.util.*;

//두수 의 최데 공약수 구하는법 -> 두수를 나누어떯어지게 하는 것중 가장 큰수
//당연히 약수는 두수 보다 작아야함  두수 중 작은 수를 기준으로 반복문 ->
// 최소 공배수 -> 두수로 나누어떨어지는것중 가장 작은수
public class GreatestCommonDivisor {
  public int[] solution(int n, int m) {
    getGreatestCommonDivisor(n,m);
    getleastCommonMultiple(n,m);
    int[] answer = {};
    answer =new int[] {getGreatestCommonDivisor(n,m),getleastCommonMultiple(n,m)};
    return answer;
  }

  public int getleastCommonMultiple(int n, int m) {
    int leastCommonDivisor = 0;
    for(int i =1; i <= n * m; i += 1) {
      if(i % n == 0 && i % m == 0) {
        leastCommonDivisor = i;
        break;
      }
    }
    return leastCommonDivisor;
  }

  public int getGreatestCommonDivisor(int n, int m) {
    int iterationRange = 0;
    List<Integer> commonDivisors = new ArrayList<>();
    if(n > m) {
      iterationRange = m + 1;
    }
    if(n < m) {
      iterationRange = n + 1;
    }
    for(int i = 1; i < iterationRange; i += 1) {
       if(n % i == 0 && m % i == 0 ) {
         commonDivisors.add(i);
      }
    }
  int GreatestCommonDivisor = commonDivisors.get(commonDivisors.size() - 1);
  return GreatestCommonDivisor;
  }
}

