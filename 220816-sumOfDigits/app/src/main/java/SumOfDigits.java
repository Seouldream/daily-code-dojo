public class SumOfDigits {
  public int solution(int n) {
    int answer = 0;

    String nToString = Integer.toString(n);

    System.out.println("처음 구한 값: " + nToString);
    for (int i = 0; i < nToString.length(); i += 1) {
      answer += Integer.valueOf(nToString.substring(i, i + 1));
      System.out.println("중간 값: " + answer);
    }
    return answer;
  }
}
