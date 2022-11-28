// 타겟넘버
// 이해
// 정수들이 담긴 배열이 주어진다.
// 배열의 순서를 바꾸지 않고 + - 를 가지고 타겟넘버를 만드려고 할 때 가능한 경우의 수를 구하라
// 첫 자리가 양수 일 때 니머지의 경우의 수를 계산한다.
// 주어진 경우의 값을 합한다.
// 즉, [1,1,1,1,1] 이 주어졌을 때 첫 자리가 양수인 경우를 따지면
// dp 로 풀기에는 변수가 너무 많다.
// 주어진 값이 target 이 되려면 결국 그것을 결정하는 요소는 마지막 숫자뿐 아닌가?
// 1이 다섯개 들어있는데 배열에서 배열 4까지의 모든 경우의수는 2^3 = 8개이다.
// 타겟은 3이고 이 상황에서 마지막 1은 + - 를 지니므로 타
// 2^3 경우의 수의 값은 2 가 되거나 ( + 1을 가짐) 4가 되는 상황밖에 없다.
// 이것을 식으로 나타내본다면
// numbers[0] numbers[1] numbers[2]
// 2일때를 만든다
// 어렵다
// 따라서 단 2개의 요소만의 경우수를 판단하는 매서드를 만든다.
// 앞의 경우의 수는 모두 판단한 값에 뒤의 값을 더해주냐 마냐로 타겟의 유무가 결정난다.
// 1, 1, 1, 1, 1
// 2가 되거나 4 가 되어야함
// ((1, 1,) 1,) 1, 1

import java.util.*;

public class TargetNumber {
  public int solution(int[] numbers, int target) {

    int answer = dfs(numbers, 0, 0,  target);;
    return answer;
  }

  public int dfs(int[] numbers, int depth, int sum, int target) {
    if(depth == numbers.length) {
      if(sum == target) {
        return 1;
      }
      if(sum != target) {
        return 0;
      }
    }
    return dfs(numbers,depth + 1, sum + numbers[depth],target)
        + dfs(numbers,depth + 1, sum - numbers[depth],target);

  }
}

