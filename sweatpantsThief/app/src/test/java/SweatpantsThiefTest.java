import org.junit.jupiter.api.*;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class SweatpantsThiefTest {
  @Test
  void stockListCheck() {
    SweatpantsThief sweatpantsThief = new SweatpantsThief();
     int[] reserve = {1,3,5};

    int[] stockList = new int[reserve.length];
    for(int i = 0;i < reserve.length; i +=1) {
      stockList[i] = 1;
    }

    assertArrayEquals(new int[] {1,1,1},stockList);
  }

  @Test
  void plusSizeTest() {
    SweatpantsThief sweatpantsThief = new SweatpantsThief();
    int[] reserve = {1,3,5};
    int[] lost = {2,4};
    int[] rentList = new int[lost.length];
    int[] stockList = new int[reserve.length];
    for(int i = 0;i < reserve.length; i +=1) {
      stockList[i] = 1;
    }

    for(int i = 0; i < lost.length; i += 1) {
      for(int z = 0; z < reserve.length; z += 1) {
        if(lost[i]+1 == reserve[z]) {
          stockList[z] -= 1;
          rentList[i] += 1;
        }
      }
    }
    assertArrayEquals(new int[] {1,0,0},stockList);
    assertArrayEquals(new int[] {1,1},rentList);
  }

  @Test
  void getTotalStockList() {
    int[] reserve = {1,3,5};
    int[] lost = {2,4};
    //재고표 만들기
    int[] stockList = new int[reserve.length];

    for(int i = 0;i < reserve.length; i +=1) {
      stockList[i] = 1;
    }
    //+1 사이즈 친구들에게 물어보고 재고표에서 뻬주기
    for(int i = 0; i < lost.length; i += 1) {
      for(int z = 0; z < reserve.length; z += 1) {
        if(lost[i]+1 == reserve[z]) {
          stockList[z] -= 1;
        }
      }
    }

    for(int i = 0; i < lost.length; i += 1) {
      for(int z = 0; z < reserve.length; z += 1) {
        if(lost[i]-1 == reserve[z] && stockList[z] == 1 && stockList[i] == 0) {
          stockList[z] -= 1;
        }
      }
    }
    int n = 5;
    int stockTotal = 0;
    for(int i = 0 ; i < stockList.length; i += 1) {
      stockTotal += stockList[i];
    }
    int answer = 0;
    answer = n - lost.length + reserve.length -stockTotal;
    assertArrayEquals(new int[] {1,0,0},stockList);
    assertEquals(5,answer);
  }

  @Test
  void moreTestCase() {
    SweatpantsThief sweatpantsThief = new SweatpantsThief();

    assertEquals(4,sweatpantsThief.solution(5,new int[] {2,4},new int[] {3}));
    assertEquals(2,sweatpantsThief.solution(3,new int[] {3},new int[] {1}));
    assertEquals(5,sweatpantsThief.solution(5,new int[] {1,2},new int[] {1,2}));
    assertEquals(4,sweatpantsThief.solution(5,new int[] {2,3,4},new int[] {3,5}));
    assertEquals(2,sweatpantsThief.solution(3,new int[] {1,2},new int[] {2,3}));
    assertEquals(8,sweatpantsThief.solution(9,new int[] {5,6,8,1,2},new int[] {2,3,1,4,8,9}));
    assertEquals(6,sweatpantsThief.solution(6,new int[] {2,4,5},new int[] {1,3,6}));
    assertEquals(5,sweatpantsThief.solution(5,new int[] {2,4,6},new int[] {1,3,5,7}));
  }
// 1,2,5,6,8       1,2,3,4,8,9   ->8
  @Test
  void sort() {
    int[] lost = new int[] {5,6,8,1,2};
    int[] reserve = new int[] {2,3,1,4,8,9};
    Arrays.sort(lost);
    assertArrayEquals(new int[] {1,2,5,6,8},lost);

  }
}