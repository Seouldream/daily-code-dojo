import org.checkerframework.checker.units.qual.*;
import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

//2차원 배열이 주어짐
// 각 좌표를 뽑는 수 있는 무브즈 가 주어짐
// 뽑기통이라는 1차원 배열에 담김
// 그 뽑기통에 서로 같은 번호가 연속되면(즉 2개면) 사라짐
// [0,0,0,0,0] (y,x) (0,0)
// [0,0,1,0,3] (1,0)
// [0,2,5,0,1] (2,0)
// [4,2,4,4,2] (3,0)
// [3,5,1,3,1] (4,0) -> 	[1,5,3,5,1,2,1,4]
class DollPickerGameTest {
  // 첫 무브를 옮겼을때 뽑아오는 공식 구하기
  @Test
  void answer() {
    DollPickerGame dollPickerGame = new DollPickerGame();

    assertEquals(4, dollPickerGame.solution(new int[][]{
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 3},
        {0, 2, 5, 0, 1},
        {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}
    }, new int[]{1, 5, 3, 5, 1, 2, 1, 4}));

    assertEquals(4, dollPickerGame.solution(new int[][]{
        {0, 0, 1, 0, 0},
        {0, 0, 1, 0, 0},
        {0, 2, 1, 0, 0},
        {0, 2, 1, 0, 0},
        {0, 2, 1, 0, 0}
    }, new int[]{1, 2, 3, 3, 2, 3, 1}));

    assertEquals(8, dollPickerGame.solution(new int[][]{
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 3},
        {0, 2, 5, 0, 1},
        {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}
  },new int[] {1, 5, 3, 5, 1, 2, 5, 1, 4, 3}));
}
//  4,3,1,1,3,2,2,4,5
  @Test
  void picker() {
    int[] move = {1, 5, 3, 5, 1, 2, 1, 4};// {4,3,1,1,3,2,4}
    int firstPickNumber = move[0];
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 3},
        {0, 2, 5, 0, 1},
        {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}
    };
    assertEquals(4, getDollNumber(board, 1));
    assertEquals(3, getDollNumber(board, 5));
    assertEquals(1, getDollNumber(board, 3));

  }

  @Test
  void getAllDollsNumber() {
    int[] move = {1, 5, 3, 5, 1, 2, 1, 4};
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 3},
        {0, 2, 5, 0, 1},
        {4, 2, 4, 4, 2},
        {3, 5, 1, 3, 1}
    };

    List<Integer> acquiredDollsList = new ArrayList<>();
    for (int n : move) {
      acquiredDollsList.add(getDollNumber(board, n));
    }

    for (int q : acquiredDollsList) {
      System.out.println(q);
    }
    acquiredDollsList.remove(Integer.valueOf(0));
    int[] arr1 = new int[acquiredDollsList.size()];
    int j = 0;
    for (int i : acquiredDollsList) {
      arr1[j] = i;
      j++;
    }


    assertArrayEquals(new int[]{4, 3, 1, 1, 3, 2, 4}, arr1);

  }

  private int getDollNumber(int[][] board, int move) {
    int pickedNumber = 0;

    for (int i = 0; i < board.length; i += 1) {

      if (board[i][move - 1] > 0) {

        pickedNumber = board[i][move - 1];
        board[i][move - 1] = 0;
        break;
      }
    }
    return pickedNumber;
  }

  @Test
  void nullTest() {
    int[][] board = {
        {0, 0, 0, 0, 0},
        {0, 0, 1, 0, 3},
        {0, 2, 5, 0, 1},
        {0, 2, 4, 4, 2},
        {0, 5, 1, 3, 1}
    };

    assertEquals(0, getDollNumber(board, 1));

  }


  @Test
  void getCount() {
    int count = 0;
    int[] pickedDollsArray = new int[]{4, 3, 1, 1, 3, 2, 4};
    List<Integer> arrayList = new ArrayList<>();
    for (int i : pickedDollsArray) {
      arrayList.add(i);
    }

    for (int j = 0; j < arrayList.size() - 1; j += 1) {
      for (int i = 0; i < arrayList.size() - 1; i += 1) {
        if (arrayList.get(i) == arrayList.get(i + 1)) {
          System.out.println("i값: " + i);
          arrayList.remove(i);
          arrayList.remove(i);
          for (int z : arrayList) {
            System.out.print(z + ", ");
          }
          count += 2;
          System.out.println("카운트 반복횟수: " + count);

        }
      }
    }

    assertEquals(4, count);
  }

  @Test
  void ExtraTestCaseNumber1() {
    DollPickerGame dollPickerGame = new DollPickerGame();

    assertArrayEquals((new int[] {4,3,1,1,3,2,2,4,5}),dollPickerGame.getAllDollsNumber(
        new int[][]{
            {0, 0, 0, 0, 0},
            {0, 0, 1, 0, 3},
            {0, 2, 5, 0, 1},
            {4, 2, 4, 4, 2},
            {3, 5, 1, 3, 1}
        },new int[] {1, 5, 3, 5, 1, 2, 5, 1, 4, 3}
    ));
  }

  @Test
  void finalCase() {
    DollPickerGame dollPickerGame = new DollPickerGame();
// 1회. 4 , 3 , 3 , 2 , 2 , 4 , 5 (1 ,1 터짐)
// 2회. 4 , 2 , 2 , 4 , 5  (3 ,3 )
// 3회. 4 4 5 (2 ,2)
// 4회 5 (4,4)
    assertEquals(8,dollPickerGame.getCount(new int[] {4,3,1,1,3,2,2,4,5}));
    assertEquals(8,dollPickerGame.getCount(new int[] { 1 , 2 , 2 , 4, 3 , 3 , 4 , 1}));
  }

  //    for(int[] array: board ) {
//      for(int a : array) {
//        System.out.print(a + ", " );
//      }
//      System.out.println("\n");
//    }
}