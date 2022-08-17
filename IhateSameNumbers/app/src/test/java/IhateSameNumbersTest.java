import org.junit.jupiter.api.*;

import java.util.*;

class IhateSameNumbersTest {
  @Test
  void rule() {
    int[] arr = new int[]{1, 1, 3, 3, 0, 1, 1};
    List<Integer> array = new ArrayList<>();

    for(int i = 0; i < arr.length - 1 ; i += 1) {
      if(i == 0) {
        array.add(arr[i]);
      }
      if(arr[i] != array.get(array.size()-1)) {
        array.add(arr[i]);
      }
    }

    for(int value : array) {
      System.out.println("리스트 값: " + value);
    }


  }
}
