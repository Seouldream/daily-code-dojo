//연속으로 나오는 수만 제거...
//
import java.lang.reflect.*;
import java.util.*;

//같은 숫자 몇개 포함하는지 메서드 찾아보기
// contain
public class NoSameNumber {
  public int[] solution(int[] arr) {
    ArrayList<Integer> array = new ArrayList<Integer>();

    for (int i = 0; i < arr.length; i += 1) {
      if (i == 0) {
        array.add(arr[i]);
      }
      if (arr[i] != array.get(array.size() - 1)) {
        array.add(arr[i]);
      }
    }
    int[] answer = new int[array.size()];
    for (int i = 0; i < array.size(); i += 1) {
      answer[i] = array.get(i);
    }
    return answer;
  }
}

