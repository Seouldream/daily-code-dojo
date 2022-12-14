import java.util.*;

// 이해
// A가 올바른 괄호 문자열일때
// AB
// {A} 형태도 올바른 괄호 문자열
// 가장 왼쪽의 원소를 오른쪽으로 x개 이동할때 올바른 갯수
// 풀이
// 1. 옳고 그른지 테스트 하는 판별기 만들기
// 괄호를 없애기
// } , ]  따위로 시작하면 x
// 스택이 비어있고 { 로 시작 ㅇㅋ
//
public class RotateBrackets {

  public int solution(String s) {
    String rotatedString = "";

    int answer = 0;
    for (int i = 0; i < s.length(); i += 1) {
      rotatedString = rotate(s, i);

      if (tester(rotatedString)) {
        answer += 1;
      }
    }
    return answer;
  }

  public String rotate(String s, int x) {

    return s.substring(x) + s.substring(0, x);
  }

  public boolean tester(String s) {

    String[] array = s.split("");

    Stack<String> stack = new Stack<>();

    for (String bracket : array) {

      boolean wrongBracketType = bracket.equals("}") || bracket.equals("]") || bracket.equals(")");
      // 빈상태 잘못된 괄호 시작
      if (stack.isEmpty() && wrongBracketType) {
        return false;
      }
      // 빈 상태 올바론 괄호 시작
      if (stack.isEmpty() && (bracket.equals("{") || bracket.equals("[") || bracket.equals("("))) {
        stack.push(bracket);
        continue;
      }
      if (
          (stack.peek().equals("{") && bracket.equals("}")) ||
              (stack.peek().equals("[") && bracket.equals("]")) ||
              (stack.peek().equals("(") && bracket.equals(")"))
      ) {
        stack.pop();
        continue;
      }
      if (
          (stack.peek().equals("{") || stack.peek().equals("[") || stack.peek().equals("(")) &&
              (bracket.equals("{") || bracket.equals("[") || bracket.equals("("))
      ) {
        stack.push(bracket);
        continue;
      }
    }

    return stack.isEmpty();
  }
}
