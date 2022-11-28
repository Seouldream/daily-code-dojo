public class MultiplyMatrix {
    public int[][] solution(int[][] arr1, int[][] arr2) {
      int rowOfArray1 = arr1.length; //arr1 행렬 행의 길이
      int columnOfArray1 = arr1[0].length; //arr1 행렬 열의 길이
      int columnOfArray2 = arr2[0].length; //arr2 행렬 열의 길이

      int[][] answer = new int[rowOfArray1][columnOfArray2];

      for(int i = 0; i < rowOfArray1; i += 1) {
        for(int j = 0; j < columnOfArray2; j += 1) {
          int sum = 0;
          for(int k = 0; k < columnOfArray1; k += 1) {
            sum += arr1[i][k] * arr2[k][j];
          }
          answer[i][j] = sum;
        }
      }

      return answer;
    }
}
