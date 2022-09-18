// 1 2 3
// 4 5 6
// 7 8 9
// * 0 # -> -1 0 -2
// 거리 재는 법
// 3과 6사이의 거리 3인 경우 좌표 (0 , 2) 6 좌표 ( 1, 2 )  1칸
// 5, 3, 8
// 5와 8과의 거리
// 5 좌표 (1,1) , 8좌표 (2,1)  1 - 1, 1 + 0 -> 1칸
// 3과 8 사이 거리
// 3 좌표 (0,2) 8좌표(2,1)  0 + 2 , 2 - 1  -> 3칸
// [1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5]	"right"	"LRLLLRLLRRL"
// 눌러야하는 번호가 1 ,4, 7 인지 3,6,9 인지 검사 후 손가락 좌표 옮겨 놓기
// 현재 포지션과 눌러야하는 번호와 거리 계산하는 계산기 만들기
// 계삲후 가까운 번호가 그 번호로 가기 그리고 현재 위치 바꾸기 그리고 누른 손 기록

import java.util.*;

public class PressKeyPad {
  public String solution(int[] numbers, String hand) {
    String handType = "L";
    if(hand == "right") {
      handType = "R";
    }


    int[][] keyPad = {
        {1, 2, 3},
        {4, 5, 6},
        {7, 8, 9},
        {-1, 0, -2}
    };
    int[] currentLeftHandPosition = {3, 0};
    int[] currentRightHandPosition = {3, 2};

    String[] handsRecords = new String[numbers.length];
    for (int i = 0; i < handsRecords.length; i +=1) {
      handsRecords[i] = "";
    }

    int i = 0;
    for(int number : numbers) {
      String usedHand = handType(currentRightHandPosition,currentLeftHandPosition,number,handType);
      if(usedHand == "L") {
        currentLeftHandPosition = positionMover(number);
      }

      if(usedHand == "R") {
        currentRightHandPosition = positionMover(number);
      }

      handsRecords[i] = usedHand;
      i += 1;
    }

    String answer = "";
    for(String h : handsRecords) {
      answer = answer + h;
    }

    return answer;
  }

  public int[] positionMover(int pressedNumber) {

    int[] currentHandPosition = (int[]) keyPadMap().get(pressedNumber);
    return currentHandPosition;
  }

  public String handType(int[] currentRightHandPosition, int[] currentLeftHandPosition, int number,String handType) {
    String hand = "none";
    if (number == 1 || number == 4 || number == 7) {
      hand = "L";
      return hand;
    }
    if (number == 3 || number == 6 || number == 9) {
      hand = "R";
      return hand;
    }

    int[] coordinates = (int[]) keyPadMap().get(number);

    int distanceFromRightHand = getDistanceFromHand(currentRightHandPosition,coordinates);
    int distanceFromLeftHand = getDistanceFromHand(currentLeftHandPosition,coordinates);

    if(distanceFromLeftHand < distanceFromRightHand) {
      hand = "L";
    }

    if(distanceFromRightHand < distanceFromLeftHand) {
      hand = "R";
    }

    if(distanceFromLeftHand == distanceFromRightHand) {
      hand = handType;
    }
    return hand;
  }

  public int getDistanceFromHand(int[] currentHandPosition,int[] coordinates) {

    int x = Math.abs(coordinates[0] - currentHandPosition[0]);
    int y = Math.abs(coordinates[1] - currentHandPosition[1]);
    return x + y;
  }

  public Map keyPadMap() {
    Map keyPadMap = new LinkedHashMap();
    int value = 0;

    for(int i = 0; i < 3; i += 1) {
      for(int j = 0 ; j < 3 ; j += 1) {
        value += 1;
        keyPadMap.put(value,new int[]{i,j});
      }
    }

    keyPadMap.put(-1,new int[]{3,0});
    keyPadMap.put(0,new int[]{3,1});
    keyPadMap.put(-2,new int[]{3,2});
    return keyPadMap;
  }
}
