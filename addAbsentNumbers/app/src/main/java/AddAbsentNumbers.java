//없는수를 찾는다.
//찾은 없는 수 끼리 더한다.
// 배열에서 특정 수를 찾아오는법은 ??
// 1. 요소가 정해저잇으므로 하나씩 검사하는 반복문
// 2. 그런 메소드가 있는지 알아본다.
// 1번부터 해결
// 반복문을 어떻게 써야할까?
// 숫자0 이 배열 0~ 끝가지 일치하는지 조건을 검사한다.
// 일치하지 않으면 중간결과로 가져온다.
// 즉 모든조건을 다 채우지 못하면 가져오는거다.
public class AddAbsentNumbers {
  public int solution1(int[] numbers) {
    int answer = 0;
    int totalSum = 0;

    for (int i = 1; i < 10; i += 1) {
      totalSum += i;
    }

    for (int i : numbers) {
      totalSum -= i;
    }

    answer = totalSum;
 return answer; }

  public int solution2(int[] numbers) {
    int answer = 0;
    int[] array = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

    for (int i = 0; i < numbers.length; i += 1) {
      for (int z = 0; z < array.length; z += 1) {
        if (array[z] == numbers[i]) {
          array[z] -= numbers[i];
        }
      }
      answer += array[i];
    }
    return answer;
  }
}
