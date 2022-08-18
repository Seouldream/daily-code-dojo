public class WeirdString {
  public String solution(String s) {
    String answer = "";

    String[] sentence = s.split("");

    int index = 0;

    for(int i = 0; i < sentence.length; i += 1) {
      index =
      sentence[i].equals(" ") ? 0 : index + 1 ;
      answer +=
      index % 2 == 0 ? sentence[i].toLowerCase() : sentence[i].toUpperCase();
    }
    return answer;
  }
}
