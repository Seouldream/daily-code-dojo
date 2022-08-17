//고민이 된다 일단 케이스 1번 부터 해결하자
// 무엇이 무엇보다 크다 -> 값이 있다 -> 값을 비교하게 만들자
// 각자 알파벳에 넘버를 부여하자.


import java.util.*;

public class StringDescending {
  public String solution(String s) {
    String answer = "";
    String[] word = s.split("");
    //번호대로 정리
    for (int i = 0; i < s.length(); i += 1) {
      switch (word[i]) {
        case "A" -> word[i] = "-26";
        case "B" -> word[i] = "-25";
        case "C" -> word[i] = "-24";
        case "D" -> word[i] = "-23";
        case "E" -> word[i] = "-22";
        case "F" -> word[i] = "-21";
        case "G" -> word[i] = "-20";
        case "H" -> word[i] = "-19";
        case "I" -> word[i] = "-18";
        case "J" -> word[i] = "-17";
        case "K" -> word[i] = "-16";
        case "L" -> word[i] = "-15";
        case "M" -> word[i] = "-14";
        case "N" -> word[i] = "-13";
        case "O" -> word[i] = "-12";
        case "P" -> word[i] = "-11";
        case "Q" -> word[i] = "-10";
        case "R" -> word[i] = "-9" ;
        case "S" -> word[i] = "-8" ;
        case "T" -> word[i] = "-7" ;
        case "U" -> word[i] = "-6" ;
        case "V" -> word[i] = "-5" ;
        case "W" -> word[i] = "-4" ;
        case "X" -> word[i] = "-3" ;
        case "Y" -> word[i] = "-2" ;
        case "Z" -> word[i] = "-1" ;

        case "a" -> word[i] = "1";
        case "b" -> word[i] = "2";
        case "c" -> word[i] = "3";
        case "d" -> word[i] = "4";
        case "e" -> word[i] = "5";
        case "f" -> word[i] = "6";
        case "g" -> word[i] = "7";
        case "h" -> word[i] = "8";
        case "i" -> word[i] = "9";
        case "j" -> word[i] = "10";
        case "k" -> word[i] = "11";
        case "l" -> word[i] = "12";
        case "m" -> word[i] = "13";
        case "n" -> word[i] = "14";
        case "o" -> word[i] = "15";
        case "p" -> word[i] = "16";
        case "q" -> word[i] = "17";
        case "r" -> word[i] = "18";
        case "s" -> word[i] = "19";
        case "t" -> word[i] = "20";
        case "u" -> word[i] = "21";
        case "v" -> word[i] = "22";
        case "w" -> word[i] = "23";
        case "x" -> word[i] = "24";
        case "y" -> word[i] = "25";
        case "z" -> word[i] = "26";



      }
    }
    //정수로 변환
    Integer[] integerTypeWord = new Integer[word.length];
    for(int i = 0; i < word.length; i += 1) {
      integerTypeWord[i] = Integer.valueOf(word[i]);
    }

    //정수로 변환한거 역순배열

    Arrays.sort(integerTypeWord,Collections.reverseOrder());

    //역순 배열한 정수를 다시 스트링으로
    String[] resultString = new String[word.length];

    for(int i = 0; i < word.length; i += 1){
      resultString[i] = Integer.toString(integerTypeWord[i]);

    }


    //스트링을 다시 알파벳으로..
    for(int i = 0; i < word.length; i += 1) {
      switch (resultString[i]) {

        case "-26" -> resultString[i] = "A";
        case "-25" -> resultString[i] = "B";
        case "-24" -> resultString[i] = "C";
        case "-23" -> resultString[i] = "D";
        case "-22" -> resultString[i] = "E";
        case "-21" -> resultString[i] = "F";
        case "-20" -> resultString[i] = "G";
        case "-19" -> resultString[i] = "H";
        case "-18" -> resultString[i] = "I";
        case "-17" -> resultString[i] = "J";
        case "-16" -> resultString[i] = "K";
        case "-15" -> resultString[i] = "L";
        case "-14" -> resultString[i] = "M";
        case "-13" -> resultString[i] = "N";
        case "-12" -> resultString[i] = "O";
        case "-11" -> resultString[i] = "P";
        case "-10" -> resultString[i] = "Q";
        case "-9" -> resultString[i] = "R";
        case "-8" -> resultString[i] = "S";
        case "-7" -> resultString[i] = "T";
        case "-6" -> resultString[i] = "U";
        case "-5" -> resultString[i] = "V";
        case "-4" -> resultString[i] = "W";
        case "-3" -> resultString[i] = "X";
        case "-2" -> resultString[i] = "Y";
        case "-1" -> resultString[i] = "Z";

        case "1" -> resultString[i] = "a";
        case "2" -> resultString[i] = "b";
        case "3" -> resultString[i] = "c";
        case "4" -> resultString[i] = "d";
        case "5" -> resultString[i] = "e";
        case "6" -> resultString[i] = "f";
        case "7" -> resultString[i] = "g";
        case "8" -> resultString[i] = "h";
        case "9" -> resultString[i] = "i";
        case "10" -> resultString[i] = "j";
        case "11" -> resultString[i] = "k";
        case "12" -> resultString[i] = "l";
        case "13" -> resultString[i] = "m";
        case "14" -> resultString[i] = "n";
        case "15" -> resultString[i] = "o";
        case "16" -> resultString[i] = "p";
        case "17" -> resultString[i] = "q";
        case "18" -> resultString[i] = "r";
        case "19" -> resultString[i] = "s";
        case "20" -> resultString[i] = "t";
        case "21" -> resultString[i] = "u";
        case "22" -> resultString[i] = "v";
        case "23" -> resultString[i] = "w";
        case "24" -> resultString[i] = "x";
        case "25" -> resultString[i] = "y";
        case "26" -> resultString[i] = "z";
      }
    }
      for(String answer0 : resultString) {
        answer += answer0;
      }
    return answer;
  }
}

