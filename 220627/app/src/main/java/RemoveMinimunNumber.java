import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

//가장 작은 수를 제거한 배열을 리턴한 함수
// 가장 작은 수 = int(arr.length-1)
// q
public class RemoveMinimunNumber {
  public int[] RemoveMiniMumNumber(int[] arr) {
    //최솟값 구하기
    int min = arr[0];

    for (int i = 0; i < arr.length; i += 1) {
      if (min > arr[i]) {
        min = arr[i];
      }
    }
      //최솟값 위치 찾기
      int minLocation = -1;
      for (int j = 0; j < arr.length; j += 1) {
        if (min == arr[j]) {
          minLocation = j;
          break;
        }
      }

    //배열에서 요소 제거법을 못찾음 -> 리스트로 바꾸어서 제거해주기로 함

    //리스트는 인티저만 받으므로 일반 정수배열을 인티저 배열로 변환
    Integer[] arrToInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);

    //인티저 타입의 리스트 생성
    List<Integer> arrayList = new ArrayList<>();
    //인티저 배열을 리스트에 모두 넣어줌
    Collections.addAll(arrayList, arrToInteger);

    //최솟값 위치를 제거 해줌
    arrayList.remove(minLocation);

    // 그럼 남은 리스트가 리턴할 값임 + 배열이 빈배열일때 -1 추가 해줌
    // 조건을 통해서 -1 을 추가 테스트 코드를 통해 확인함
    if (arrayList.size() == 0) {
      arrayList.add(-1);
    }

    //다시 리스트를 배열로 바꿔줘야함

    //그전에 리스트는 인티저이므로 또 ! 스바 인티저 배열로 바꿔줘여함
    Integer[] integerArrayAnswer = arrayList.toArray(new Integer[arrayList.size()]);

    //다시 바꿧으면 이제 인티저 배열을 인트 배열로
    //와.. 구글아니었으면 난 어똑해 아무튼 바꿔준듯
    int[] answer = Arrays.stream(integerArrayAnswer).mapToInt(i -> i).toArray();


    return answer;
  }
}


