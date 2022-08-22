import java.util.*;

// 2~5번째 까지 자른다 -> array[2 - 1 ] ~ array[ 5 - 1 ]
// sort 오름차순 정열
// array로 만듬 -> 식으로 리팩토링
public class KNumber {
  public int[] solution(int[] array, int[][] commands) {

    array = new int[] {1, 5, 2, 6, 3, 7, 4};
    int[] answer = new int [commands.length];

    for(int i = 0 ; i < commands.length; i += 1) {

      int[] slicedArray = sliceArray(array,commands[i]);

      answer[i] = slicedArray[commands[i][2] - 1];
      System.out.println("정답: " + answer[i]);
    }

    return answer;
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
}
