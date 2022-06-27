import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RemoveMinimunNumberTest {
  @Test
  void simple() {
      int[] arr = {4,3,2,1};
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

      assertEquals("[4, 3, 2]", String.valueOf(arrayList));


    }

  @Test
  void addCondition() {
      int[] arr = {1};
      Integer[] arrToInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);


      List<Integer> arrayList = new ArrayList<>();
      Collections.addAll(arrayList, arrToInteger);
      arrayList.remove(arrayList.size()-1);

    if(arrayList.size() == 0) {
      arrayList.add(-1);
    }

    assertEquals("[-1]", String.valueOf(arrayList));

    }


 /* @Test
  void resultCheck() {
      int[] arr = {4,3,2,1};
      Integer[] arrToInteger = Arrays.stream(arr).boxed().toArray(Integer[]::new);


      List<Integer> arrayList = new ArrayList<>();
      Collections.addAll(arrayList, arrToInteger);
      arrayList.remove(arrayList.size()-1);

    if(arrayList.size() == 0) {
      arrayList.add(-1);
    }


    //그전에 리스트는 인티저이므로 또 ! 스바 인티저 배열로 바꿔줘여함
    Integer[] integerArrayAnswer = arrayList.toArray(new Integer[arrayList.size()]);

    //다시 바꿧으면 이제 인티저 배열을 인트 배열로
    //와.. 구글아니었으면 난 어똑해 아무튼 바꿔준듯
    int[] answer = Arrays.stream(integerArrayAnswer).mapToInt(i -> i).toArray();

    assertEquals({4,3,2}, String.answer);

    }*/
  }

