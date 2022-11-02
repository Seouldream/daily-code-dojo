// 이해
// 주어진 것 : 문자열
// 조건: 앞에서부터 주어진 문자열에서 같은 알파벳이 붙어 있는 2개를 우선적으로 찾는다. -> 제거한다.
// 위 과정을 하고 남은 것을 다시 또 반복한다.
// 더 이상 제거할 수 없을때까지 반복한다.
// 계획
// 어떻게 반복한 것을 제거하지? -> for문? stream filter?
// 어떻게 연속된 문자가 있다는 것을 검사하지? -> 앞의 원소가 뒤와 같다?
// 어떻게 제거하지? 제자리 인덱스 2번 제거

import java.util.*;

public class RemoveParing {
  public int solution(String s) {

    Stack<Character> stack = new Stack();

    for (char element : s.toCharArray()) {
      if (!stack.isEmpty() && stack.peek().equals(element)) {
        stack.pop();
      } else {
        stack.push(element);
      }
    }
    return stack.isEmpty() ?  1 :  0;
  }
}

