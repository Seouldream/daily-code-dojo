// 각 요소들을 출력한다
// 출력해서 각각 더해주고 다시 배열에 넣어준다
// 넣어준것을 다시 배열에 넣어
public class SumMatrix {
  private int[][] answer;

  public int[][] solution(int[][] array1, int[][] array2) {

    compute(array1, array2);
    return answer;
  }

  public int[][] compute(int[][] array1, int[][] array2) {
    int[][] array3 = new int[array1.length][array1[0].length];
    for (int i = 0; i < array1.length; i += 1) {
      for (int z = 0; z < array1[0].length; z += 1) {
        array3[i][z] = array1[i][z] + array2[i][z];
      }
    }
    answer = array3;
    return answer;
  }
}

