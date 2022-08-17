import java.util.*;

public class IhateSameNumbers {
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

