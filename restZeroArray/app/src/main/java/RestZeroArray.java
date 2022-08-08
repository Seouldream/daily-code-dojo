import java.util.*;

// 나누어 떨어지는 값을 오름차순으로
// 없다면 - 1
// 주어진 배열을 주어진수 로 나눈다
// 나머지가 0인 값들을 찾는다.
// 새배열에 담는다.
public class RestZeroArray {
  public int[] solution(int[] arr, int divisor) {
    int[] answer = {};
   /* 방법1
   answer = Arrays.stream(arr)
        .filter(i -> i % divisor == 0)
        .toArray();

    if(answer.length == 0) {
      answer = new int[] {-1};
    }

    Arrays.sort(answer);*/
    
    //방법2
    List<Integer> filteredArray = new ArrayList<>();
    for (int i : arr ){
      if (i % divisor == 0) {
        filteredArray.add(i);
      }
    }

    Collections.sort(filteredArray);
    if(filteredArray.size() == 0) {
      filteredArray.add(-1);
    }

    answer = filteredArray.stream().mapToInt(Integer::intValue).toArray();

    return answer;
  }
}
