public class InnerProduct {
  public int solution(int[] a, int[] b) {

    for(int i = 0; i < a.length; i += 1) {
      int result = a[i]*b[i];
      result += result;
    }


    int answer = 1234567890;
    return answer;
  }
}
