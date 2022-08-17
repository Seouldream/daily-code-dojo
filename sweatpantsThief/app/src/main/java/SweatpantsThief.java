import java.util.*;

//n은 전체 학생 수
// 로스트는 잃어버린 학생 번호
//리저브는 여분 체육복 보유한 학생들 번호
// 리저브는  자기 번호를 기준으로 +1  - 1 번호에게만 줄수 있음.
// 로스트가 받아오는 중복을 피하기 위해서는 리저브에 해당하는 재고 보유수량을 만들어야함.
//로스트가 리저브에게서 가져온다면 그 리저브에 해당하는 재고 표에서 1을 뺀다.
// 1. 로스트가 각 +1 사이즈 에게서 받아온다. + 2. 조건 추가 +1의 재고표가 0이라면 -1 에게서 받아온다.
// 3. -1 의 재고표도 0 이라면  받아오지못한채 0을가지고 온다.

// +1 사이즈 검사 -1 사이즈 검사 / 자기 자신이 체육본 가져온 경우 포함
public class SweatpantsThief {
  public int solution(int n, int[] lost, int[] reserve) {
    //전체학생수 - 체육복 도난당한 학생수 + 리저브갯수 -재고수(전체보다크면 걍전체로 )
    //여벌 체육복을 가져온 학생이 도난 당한 경우 조건 추가
    //로스트 번호와 리저브 번호가 일치한다 재고표를 0으로

    //재고표 만들기
    //중복빌리기 없애기 표
    Arrays.sort(lost);
    Arrays.sort(reserve);
    int[] rentList = new int[lost.length];
    int[] stockList = new int[reserve.length];

    for(int i = 0;i < reserve.length; i +=1) {
      stockList[i] = 1;
    }
// 잃어버린 사람이 여분체육복를 가지고 있고 && 여분체육복이 여분이 있고 && 빌린거 카운트 안했다면
    // 즉 자기 자신에게 빌리는 경우 케이스 포함
    for(int i = 0; i < lost.length; i += 1) {
      for (int z = 0; z < reserve.length; z += 1) {
        if (lost[i] == reserve[z] && stockList[z] == 1 && rentList[i] == 0) {
          stockList[z] -= 1;
          rentList[i] += 1;
        }
      }
    }

 // 케이스 두개로 나워주기
    int[] plusLost = new int[lost.length];
    for(int q= 0; q < lost.length; q += 1 ) {
      plusLost[q] = lost[q];
    }
    int[] plusReserve = new int[reserve.length];
    for(int q= 0; q < reserve.length;q += 1 ) {
      plusReserve[q] = reserve[q];
    }
    int[] plusRent = new int[rentList.length];
    for(int q= 0; q < rentList.length;q += 1 ) {
      plusRent[q] = rentList[q];
    }
    int[] plusStockList = new int[stockList.length];
    for(int q= 0; q < stockList.length;q += 1 ) {
      plusStockList[q] = stockList[q];
    }

    int[] minusLost = new int[lost.length];
    for(int q= 0; q < lost.length;q += 1 ) {
      minusLost[q] = lost[q];
    }
    int[] minusReserve = new int[reserve.length];
    for(int q= 0; q < reserve.length;q += 1 ) {
      minusReserve[q] = reserve[q];
    }
    int[] minusRent = new int[rentList.length];
    for(int q= 0; q < rentList.length;q += 1 ) {
      minusRent[q] = rentList[q];
    }
    int[] minusStockList = new int[stockList.length];
    for(int q= 0; q < stockList.length;q += 1 ) {
      minusStockList[q] = stockList[q];
    }

    int answer = 0;
    int result1 = getMinusAnswer(n, minusLost, minusReserve, minusRent, minusStockList);
    int result2 = getPlusAnswer(n, plusLost, plusReserve, plusRent, plusStockList);

    if(result1>result2) {
      answer = result1;
    }
    if(result2>result1) {
      answer = result2;
    }
    if(result1==result2) {
      answer = result1;
    }
    return answer;
  }

  public int getPlusAnswer(int n, int[] lost, int[] reserve, int[] rentList, int[] stockList) {
    for(int i = 0; i < lost.length; i += 1) {
      for(int z = 0; z < reserve.length; z += 1) {
        if(lost[i]+1 == reserve[z] && stockList[z] == 1 && rentList[i] == 0) {
          stockList[z] -= 1;
          rentList[i] += 1;
        }
      }
    }

    for(int i = 0; i < lost.length; i += 1) {
      for(int z = 0; z < reserve.length; z += 1) {
        if(lost[i]-1 == reserve[z] && stockList[z] == 1 && rentList[i] == 0) {
          stockList[z] -= 1;
          rentList[i] += 1;
        }
      }
    }
    int stockTotal = 0;
    for(int i = 0; i < stockList.length; i += 1) {
      stockTotal += stockList[i];
    }
    int answer2 = 0;

    answer2 = n - lost.length + reserve.length -stockTotal;
    if(answer2 > n) {
      answer2 = n;
    }
    return answer2;
  }

  public int getMinusAnswer(int n, int[] lost, int[] reserve, int[] rentList, int[] stockList) {
    for(int i = 0; i < lost.length; i += 1) {
      for(int z = 0; z < reserve.length; z += 1) {
        if(lost[i]-1 == reserve[z] && stockList[z] == 1 && rentList[i] == 0) {
            stockList[z] -= 1;
            rentList[i] += 1;
        }
      }
    }

    for(int i = 0; i < lost.length; i += 1) {
      for(int z = 0; z < reserve.length; z += 1) {
        if(lost[i]+1 == reserve[z] && stockList[z] == 1 && rentList[i] == 0) {
          stockList[z] -= 1;
          rentList[i] += 1;
        }
      }
    }
    int stockTotal = 0;
    for(int i = 0; i < stockList.length; i += 1) {
      stockTotal += stockList[i];
    }
    int answer1 = 0;

    answer1 = n - lost.length + reserve.length -stockTotal;
    if(answer1 > n) {
      answer1 = n;
    }
    return answer1;
  }
}
