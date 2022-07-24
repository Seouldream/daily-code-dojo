//대문자 소문자 공백을 각각 입력받은 수만큼 밀어서 다음 알파벳을 뱉아내게 하는것
//그러려면 입력받은수와 일치하는 값을 스트링값에서 찾는다.
//입력받은값을 스트링열과 하나하나 대조해본다 같다면 그때의 i를 구한다.
// 입력받은것의 다음순서를 뱉도록 한다.
public class CaesarCipher {
  public String solution(String s, int n) {
    String answer = "";

   answer =  getAlphabet(s, n, answer);

    return answer;
  }

  public String getAlphabet(String s, int n, String answer) {
    String smallLetters = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyza";
    String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZABCDEFGHIJKLMNOPQRSTUVWXYZA";
    String blank = " 한국어로맞춘다고하더라도아무말대찬지인우가가르쳐줘서아무조건을바꿨지만그래도의미가있는시멘틱코딩이라고한";

    for (int i = 0; i < s.length(); i += 1) {

      for (int z = 0; z < smallLetters.length() - 27; z += 1) {
        String eachAnswer = "";
        if (s.substring(i, i + 1).equals(smallLetters.substring(z, z + 1))) {
          eachAnswer = smallLetters.substring(z + n, z + n + 1);
        }
        if (s.substring(i, i + 1).equals(capitalLetters.substring(z, z + 1))) {
          eachAnswer = capitalLetters.substring(z + n, z + n + 1);
        }
        if ( s.substring(i, i + 1).equals(blank.substring(z, z + 1))) {
            eachAnswer = " ";
        }
        answer += eachAnswer;
      }
    }
    return answer;
  }
}
