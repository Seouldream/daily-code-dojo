// 이해
// 주어진 칸에 대해 1 칸 또는 2칸만 이용할 수 있다.
// 1 과 2의 경우의 수를 이용해서 n칸을 채우는 경우의 수를 구하라
// 구한 경우의 수를 1234567로 나눈 나머지를 리턴하라

import java.util.*;

// 풀이
// 1,2를 혼용해서 뛸때
// 0개 일때
// 2 하나 일때 +
// ->2가 첫번째 있을때, 두번째 있을때 위치 고려
// 2 두개 일때 위치? 2가 첫번째 자리에 있고 2는 2번째 3반쩨 움직일 수 있다
// 2 세개 ..
// 2의 갯수에따른 경우의 수를 구해주는 것을 구 할 것.
// 2의 갯수에 따라 다른 위치에 따른 경우의 수를 구 할 것
// 2가 처음 있을때

// ---
// 동적 프로그래밍 문제
// 항상 다음의 경우는 이전 경우의 수와 이전전의 경우의 수의 합이 됨
// 1. 이전전 경우의수 까지 온 경우의수 에서는 2칸을뛰는 선택지밖에 없음 따라서 이전전 경우의수 * (2칸만 뛰는 한가지 선택지)
// 2. 이전 경우의 수 까지 온 경우에는 1칸만 뛰어야하는 선택지가 있음 이전 경우의수 * (1칸만 뛰어야 하는 한가지 경우의 수)
public class LongJump {
  public long solution(int n) {
    int[] cases = new int[2001];
    cases[1] = 1;
    cases[2] = 2;
    for (int i = 3; i < 2001; i += 1) {
      cases[i] = (cases[i - 1] + cases[i - 2]) % 1234567;
    }

    return cases[n];
  }
}
