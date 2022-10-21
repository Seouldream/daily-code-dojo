import java.util.*;

// ( 로 시작하면 항상 ) 로 닫혀야함
// ())(
//()()
// (())
//()
public class ProperBracket {
  boolean solution(String s) {
    boolean answer = true;
    Stack<Character> stack = new Stack<Character>();
// stack은 () 담는 검열기
// ( 이면 넣고 다음에 ) 가 오는 조건이면 pop 으로 ( 를 지워서 비운값을 만든다.
// ( 가 없는 상황에서 ) 부터 들어온다면 false 처리를 한다.

    for(int i=0; i<s.length(); i++){
      if(s.charAt(i) == '(')  // 현재 (가 들어갈 자리면 스택에 넣는다.
        stack.push('(');
      else{
        if(stack.isEmpty()) // 현재 )가 들어갈 자리인데 스택이 비어있을경우 -> false
          return false;
        else
          stack.pop();    // 현재 )가 들어갈 상태에서 스택에 괄호('(')가 있는경우 -> pop
      }
    }
    answer = (stack.isEmpty()) ? true : false;
    return answer;
  }
}
