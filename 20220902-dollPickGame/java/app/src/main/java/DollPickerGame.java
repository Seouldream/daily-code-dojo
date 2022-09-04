import java.util.*;

//2차원 배열이 주어짐
// 각 좌표를 뽑는 수 있는 무브즈 가 주어짐
// 뽑기통이라는 1차원 배열에 담김
// 그 뽑기통에 서로 같은 번호가 연속되면(즉 2개면) 사라짐
// [0,0,0,0,0]
// [0,0,1,0,3]
// [0,2,5,0,1]
// [4,2,4,4,2]
// [3,5,1,3,1]  -> 	[1,5,3,5,1,2,1,4]	4
public class DollPickerGame {
  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    int[] pickedDollsArray = getAllDollsNumber(board,moves);

    answer = getCount(pickedDollsArray);

    return answer;

  }
  public int[] getAllDollsNumber(int[][] board,int[] move) {
    List<Integer> acquiredDollsList = new ArrayList<>();
    for (int n : move) {
      acquiredDollsList.add(getDollNumber(board, n));
    }

    for (int i = 0; i <  acquiredDollsList.size(); i += 1) {
      if(acquiredDollsList.contains(Integer.valueOf(0))) {
        acquiredDollsList.remove(Integer.valueOf(0));
      }
    }


    int[] arr1 = new int[acquiredDollsList.size()];
    int j = 0;
    for (int i : acquiredDollsList) {
      arr1[j] = i;
      j++;
    }

    return arr1;
  }

  public int getDollNumber(int[][] board, int move) {
    int pickedNumber = 0;

    for (int i = 0; i < board.length; i += 1) {

      if (board[i][move - 1] > 0) {

        pickedNumber = board[i][move - 1];
        board[i][move - 1] = -1;
        break;
      }
    }
    return pickedNumber;
  }

  public int getCount(int[] pickedDollsArray) {
    int count = 0;

    List<Integer> arrayList = new ArrayList<>();
    for (int i : pickedDollsArray) {
      arrayList.add(i);
    }
// { 1 , 2 , 2 , 4, 3 , 3 , 4 , 1}
// 8
//
    int size = arrayList.size();
    for (int j = 0; j < size; j += 1) {
      for (int i = 0; i < arrayList.size() - 1; i += 1) {
        if (arrayList.get(i) == arrayList.get(i + 1)) {
          arrayList.remove(i);
          arrayList.remove(i);
          System.out.print("list: ");
              for(int z : arrayList) {
                System.out.print(z + ", ");
          }
          System.out.println("");
          count += 2;

        }
      }
    }
    return count;
  }
}
