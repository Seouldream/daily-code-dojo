import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class PressKeyPadTest {

  // [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
  @Test
  void getHandWith147369() {
    //주어진 번호 첫 번 째 -> 왼손이 가야 하는 번호인지 오른손이 가야하는 번호인지 검사한다.
    //검사후 각 조건에 맞는 손이 가고 간 손을 기록한다.
    //간 손은 이동한 후 현재 위치를 갱신한다.
    //1 -> 왼손이가야함 -> 왼손 기록 -> 왼손 현재 위치 {0,0}으로 재할당
    PressKeyPad pressKeyPad = new PressKeyPad();

    int[][] keyPad = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {-1, 0, -2}
    };
    int[] currentRightHandPosition = {3, 0};
    int[] currentLeftHandPosition = {3, 2};

    assertEquals("L",pressKeyPad.handType(currentRightHandPosition,currentLeftHandPosition,1,"R"));
    assertEquals("R",pressKeyPad.handType(currentRightHandPosition,currentLeftHandPosition,3,"R"));
    assertEquals("L",pressKeyPad.handType(currentRightHandPosition,currentLeftHandPosition,4,"R"));
  }

  @Test
  void getHandFromMiddleNumber() {
    PressKeyPad pressKeyPad = new PressKeyPad();

    int[][] keyPad = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {-1, 0, -2}
    };
    int[] currentRightHandPosition = {3, 0};
    int[] currentLeftHandPosition = {3, 2};

    assertEquals("L",pressKeyPad.handType(currentRightHandPosition,currentLeftHandPosition,1,"R"));

    currentLeftHandPosition = pressKeyPad.positionMover(1);
    assertArrayEquals(new int[]{0,0},currentLeftHandPosition);

    assertEquals("R",pressKeyPad.handType(currentRightHandPosition,currentLeftHandPosition,3,"R"));
    currentRightHandPosition = pressKeyPad.positionMover(3);
    assertArrayEquals(new int[]{0,2},currentRightHandPosition);

    assertEquals("L",pressKeyPad.handType(currentRightHandPosition,currentLeftHandPosition,4,"R"));
    currentLeftHandPosition = pressKeyPad.positionMover(4);
    assertArrayEquals(new int[]{1,0},currentLeftHandPosition);

    assertEquals("L",pressKeyPad.handType(currentRightHandPosition,currentLeftHandPosition,5,"R"));
  }

  @Test
  void getDistanceFromHand() {
    PressKeyPad pressKeyPad = new PressKeyPad();
    int[] currentRightHandPosition = {0, 2};
    int[] currentLeftHandPosition = {1, 0};
    int[] coordinate = {1,1};

    assertEquals(1,pressKeyPad.getDistanceFromHand(currentLeftHandPosition,coordinate));
    assertEquals(2,pressKeyPad.getDistanceFromHand(currentRightHandPosition,coordinate));

    currentLeftHandPosition = new int[] {1,1};
    currentRightHandPosition = new int[] {0,2};

    coordinate = new int[] {2,1};
    assertEquals(1,pressKeyPad.getDistanceFromHand(currentLeftHandPosition,coordinate));
    assertEquals(3,pressKeyPad.getDistanceFromHand(currentRightHandPosition,coordinate));
  }

  @Test
  void getAnswer() {
    PressKeyPad pressKeyPad = new PressKeyPad();

    //실행한 결괏값 "LRRRLRLRLRR"이 기댓값 "LRLLRRLLLRR"과 다릅니다.
    assertEquals("LRLLLRLLRRL",pressKeyPad.solution(new int[] {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5},"right"));
    assertEquals("LRLLRRLLLRR",pressKeyPad.solution(new int[] {7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2},"left"));
    assertEquals("LLRLLRLLRL",pressKeyPad.solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0},"right"));
  }
}