//// 이해
//// 영어 끝말잇기를 진행
//// 1. 한글자 단어 안됨
//// 2. 끝말잇기기때문에 이전의 마지막 문자로 시작하는 단어로 시작하지 않으면 안됨
//// 3. 참여 인원수 와 차례로 말할 단어들이 주어짐
//// 계획
//// 1. 2차원 배열로 풀 수 없나?
//// 2. 시작단어는 앞의 단어의 뒷글자와 같아야한다.
//// 3. 단어는 이전의 단어에서 사용되어진적이 없어야 한다.
//// ["tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"]
////  1번 사람 : [tank, wheel, mother]
////  2번 사람 : [kick, land, robot]
////  3번 사람 : [know, dream, tank]
//// [ (0,0) , (0,1) , (0,2) ]
//// [ (1,0) , (1,1) , (1,2) ]
//// [ (2,0) , (2,1) , (2,2) ]
//// (0,0) -> (1,0) -> (2,0)  .. -> (0,1)
//// i, j -> i + 1 ,j
//// i 가 n - 1 일때
//// 2, 0 -> 0 , 1
//
//// i == n - 1, j == 0 -> i - (i + 1), j + 1
//
//// i 가 1 씩 늘어날 때
//// i - 1 , j == i ,j ?
//// i 가 0 일 때
//// i, j == i + 2, j - 1
//
//// i 가 0이고 j 가
//
//import java.util.*;
//
//public class WordChain {
//  public int[] solution(int n, String[] words) {
//
//    int[] answer = {0, 0};
//
//    String[][] wordsTable = new String[n][words.length / n];
//
//    for (int i = 0; i < n; i += 1) {
//      for (int j = 0; j < words.length / n; j += 1) {
//        // 0 1 2
//        // 3 4 5
//        // 6 7 8
//        // 0 0 -> tank = words[0]
//        // 0 1 -> wheel
//        if (i == 0) {
//          wordsTable[i][j] = words[i];
//          continue;
//        }
//        wordsTable[i][j] = words[i * n + j];
//        System.out.println("i: " + i);
//        System.out.println("j: " + j);
//      }
//    }
//
//    for (int i = 0; i < wordsTable.length; i += 1) {
//      for (int j = 0; j < wordsTable[i].length; j += 1) {
//        if (i == 0 && j == 0) {
//          continue;
//        }
//        if (i == 0 && j != 0) {
//          System.out.println("???");
//          System.out.println("i:  " + i);
//          System.out.println("j:  " + j);
//          if (!match(wordsTable[i + 2][j - 1], wordsTable[i][j])) {
//            System.out.println("INNNNNNNNN");
//            answer[0] = i + 1;
//            answer[1] = j + 1;
//            continue;
//          }
//        }
//        System.out.println("last");
//        if (i != 0) {
//          System.out.println("here!!!");
//          if (!match(wordsTable[i - 1][j], wordsTable[i][j])) {
//            System.out.println("IN");
//            answer[0] = i + 1;
//            answer[1] = j + 1;
//            continue;
//          }
//        }
//      }
//    }
//
//    return answer;
//  }
//
//  public boolean match(String prevLetter, String currentLetter) {
//
//    return prevLetter.substring(prevLetter.length() - 1).equals(
//        currentLetter.substring(currentLetter.length() - 1));
//
//  }
//}

import java.util.ArrayList;
import java.util.List;

class Solution {
  public int[] solution(int n, String[] words) {
    int[] answer = new int[2];
    List<String> list = new ArrayList<>();
    list.add(words[0]);
    for(int idx=1; idx<words.length; idx++){
      String last = list.get(list.size()-1);
      String now = words[idx];
      if(!list.contains(now) && last.charAt(last.length()-1) == now.charAt(0)){
        list.add(now);
      }else{
        answer[0] = idx % n + 1;
        answer[1] = idx / n + 1;
        break;
      }
    }

    return answer;
  }
}
