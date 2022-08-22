import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class KNumberTest {
  @Test
  void slice() {
    KNumber kNumber = new KNumber();
    int[] command1 = new int[] {2,5,3};
    int[] command2 = new int[] {4,4,1};
    int[] command3 = new int[] {1,7,3};



    int [] array = new int[] {1, 5, 2, 6, 3, 7, 4};

    int[] check = sliceArray(array,command1);
    int[] check2 = sliceArray(array,command2);
    int[] check3 = sliceArray(array,command3);



    assertArrayEquals(new int[] {2,3,5,6},sliceArray(array,command1));
    assertArrayEquals(new int[] {6},sliceArray(array,command2));
    assertArrayEquals(new int[] {1,2,3,4,5,6,7},sliceArray(array,command3));
  }

  public int[] sliceArray(int[] array,int[] command) {
    int i = command[0];
    int j = command[1];
    int k = command[2];

    int[] slicedArray = new int[j - (i - 1) ];
    int z = 0;
    for(int m = i -1 ; m < j; m += 1) {
      slicedArray[z] = array[m];
      z+=1;
    }

    Arrays.sort(slicedArray);
    return slicedArray;
  }

  @Test
  void answer() {
    KNumber kNumber = new KNumber();

    assertArrayEquals(new int[] {5,6,3}, kNumber.solution(new int[] {1, 5, 2, 6, 3, 7, 4},
        new int[][] {{2,5,3},{4,4,1},{1,7,3}}));
  }
}
// [ 4 , 6, 3,