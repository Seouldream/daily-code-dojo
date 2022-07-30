import java.util.*;

//n은 전체 학생 수
// 로스트는 잃어버린 학생 번호
//리저브는 여분 체육복 보유한 학생들 번호
// 리저브는  자기 번호를 기준으로 +1  - 1 번호에게만 줄수 있음.
// 로스트가 받아오는 중복을 피하기 위해서는 리저브에 해당하는 재고 보유수량을 만들어야함.
//로스트가 리저브에게서 가져온다면 그 리저브에 해당하는 재고 표에서 1을 뺀다.
// 1. 로스트가 각 +1 에게서 받아온다. + 2. 조건 추가 +1의 재고표가 0이라면 -1 에게서 받아온다.
// 3. -1 의 재고표도 0 이라면  받아오지못한채 0을가지고 온다.
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

    for(int i = 0; i < lost.length; i += 1) {
      for (int z = 0; z < reserve.length; z += 1) {
        if (lost[i] == reserve[z] && stockList[z] == 1 && rentList[i] == 0) {
          stockList[z] -= 1;
          rentList[i] += 1;
        }
      }
    }

// case1
        //-1 사이즈 친구들에게 물어보고 재고표에서 뻬주기

    int answer = 0;
    int result1 = getMinusAnswer(n, lost, reserve, rentList, stockList);
    int result2 = getPlusAnswer(n, lost, reserve, rentList, stockList);

    if(result1>result2) {
      answer = result1;
    }
    if(result2>result1) {
      answer = result2;
    }
    if(result1==result2) {
      answer = result1;
    }
    return result2;
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
