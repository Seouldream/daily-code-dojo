import java.util.*;

// 모든 단어의 첫문자는 대문자
// 단어의 시작이 문자가 아니면 다음문자는 모두 소문자
// 통 스트링 -> for 문 다음거는 그냥
// 빈 공백문자의 갯수를 살려줘야함
public class JadenCase {
  public String solution(String s) {

    String answer = "";

    String[] array = s.toLowerCase().split("");

    boolean flag = true;
    for(String element : array) {
      answer += flag ? element.toUpperCase() : element;
      flag = element.equals(" ") ? true : false;
    }

    return answer;
  }
}
