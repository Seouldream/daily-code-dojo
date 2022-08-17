public class NaturalNumber {
  public int[] solution(long n) {
    int[] answer = {};
    String string = Long.toString(n);

    answer = new int[string.length()];
    for(int i =0; i < string.length() ; i += 1) {
      int number = Integer.parseInt(string.substring(string.length() - 1 -  i,string.length() - i));
      answer[i] = number;
      System.out.println("answer: " + answer[i]);
    }
    return answer;
  }
}

