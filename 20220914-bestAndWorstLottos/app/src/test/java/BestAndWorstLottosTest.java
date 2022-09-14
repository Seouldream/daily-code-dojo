import org.junit.jupiter.api.*;
// 최고 등수와 최저 등수? -> 0의 갯수에 따라 그냥 달려있음
// 즉 0이 맥스일때 + 당첨된 번호 수 => 최고등수
// 0이 민 일때 + 당첨된 번호 수 => 최저 등수
// 1. 내가 당청된 번호의 갯수 부터 구한다.
// 2. 당첨된 것의 번호는 제거한다
import static org.junit.jupiter.api.Assertions.*;
//	[3,5]

class BestAndWorstLottosTest {
  @Test
  void getRightNumber() {
    BestAndWorstLottos bestAndWorstLottos = new BestAndWorstLottos();

    assertEquals(2, bestAndWorstLottos.getRightNumber(
        new int[]{44, 1, 0, 0, 31, 25}, new int[]{31, 10, 45, 1, 6, 19}
    ));
  }

  @Test
  void getRank() {
    //맞춘 갯수 번호를 들고 있다.
    // 최저 등수 -> 맞춘갯수
    // 최고 등수 -> 맞춘갯수 + 0의 갯수
    // 1등 -> 6개
    // 2등 -> 5개
    // 3등 -> 4개
    // 4등 -> 3개
    // 5등 -> 2개
    // 6등 -> 0, 1개
    BestAndWorstLottos bestAndWorstLottos = new BestAndWorstLottos();
    assertEquals(2, bestAndWorstLottos.countZero(
        new int[]{44, 1, 0, 0, 31, 25}
    ));
    assertArrayEquals(new int[] {3,5}, bestAndWorstLottos.getRanks(2,4));
  }

  @Test
  void checkFinalAnswer() {
    BestAndWorstLottos bestAndWorstLottos = new BestAndWorstLottos();

    assertArrayEquals(new int[] {3,5}, bestAndWorstLottos.solution(
        new int[] {44, 1, 0, 0, 31, 25},new int[] {31, 10, 45, 1, 6, 19}
    ));
    assertArrayEquals(new int[] {1,6}, bestAndWorstLottos.solution(
        new int[] {0, 0, 0, 0, 0, 0},new int[] {38, 19, 20, 40, 15, 25}
    ));
    assertArrayEquals(new int[] {1, 1}, bestAndWorstLottos.solution(
        new int[] {45, 4, 35, 20, 3, 9},new int[] {20, 9, 3, 45, 4, 35}
    ));
  }
}