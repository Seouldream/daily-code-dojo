// [2,6,8,14]	168
//[1,2,3]	6
// n개의 배열에 들은 공통의 최소공배수
// 최소공배수 ?
// 10 5 => 10
// 8 6 = 24
public class GreatestCommonNumber {
  public int solution(int[] arr) {
    int startNumber = 1;
    int temporaryGreatestCommon = 0;

    for(int a : arr) {
      int big = Math.max(a,startNumber);
      int small = Math.min(a,startNumber);

        temporaryGreatestCommon = getGreatestCommonNumber(big, small);

        startNumber = temporaryGreatestCommon;
      }

    int answer = temporaryGreatestCommon;
    return answer;
  }

  public int getGreatestCommonNumber(int big , int small) {
    int a = big;
    int b = small;

    int r = -1;

    while(r != 0) {
      r = big % small;
      big = small;
      small = r;
    }
    return (a * b) / big;
  }
}
