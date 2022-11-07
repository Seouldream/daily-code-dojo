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
//
//import org.junit.jupiter.api.*;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class WordChainTest {
//  @Test
//  void matchLetters() {
//    WordChain wordChain = new WordChain();
//
////    assertTrue(wordChain.match("tank","kick"));
////    assertFalse(wordChain.match("know","mother"));
//
//  }
//
//  @Test
//  void answer() {
//    WordChain wordChain = new WordChain();
//
////    assertArrayEquals(new int[]{3, 3}, wordChain.solution(3,
////        new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"}));
//    assertArrayEquals(new int[]{0, 0}, wordChain.solution(5,
//        new String[]{"hello", "observe", "effect", "take", "either", "recognize",
//            "encourage", "ensure", "establish", "hang", "gather", "refer", "reference", "estimate", "executive"}));
//  }
//}
