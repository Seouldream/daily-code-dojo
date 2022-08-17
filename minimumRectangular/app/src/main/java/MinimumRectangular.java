import java.util.*;

//배열의 가로세로 요소 둘다 가장 커야함
//1. 한변의 요소가 모든 요소들중에서 가장 긴 요소와 같아야한다
//2. 다른 한 요소는 모든 배열들의 낮은 것들중에서 제일 높은 값이다.
public class MinimumRectangular {
  public int solution(int[][] sizes) {
    int answer = 0;

    int iMax = 0;
    for(int[] i : sizes) {
      for(int z : i) {
        iMax = Math.max(z, iMax);
      }
    }

    int iMin = 0;
    List<Integer> minArray = new ArrayList<>();
    for(int[] cardSize : sizes) {
      minArray.add(Math.min(cardSize[0],cardSize[1]));
    }
    for(int i : minArray) {
      iMin = Math.max(i, iMin);
    }

    answer = iMax * iMin;
    return answer;
  }
}
