// 주어진 문자열에서 영단어를 찾는다 (
// 해당 그것을 replace로 치환한다.
// 어떻게 효과적으로 ??
// chunking..?

public class NumberStringAndEnglishWord {
  public int solution(String s) {
    int answer = 0;
    String[] words = {"zero","one","two","three","four","five","six","seven","eight","nine"};

    for( int i = 0; i < words.length ; i += 1) {
      s = s.replace(words[i], String.valueOf(i));
    }
      answer = Integer.valueOf(s);
      return answer;
    }
  }

//  public String replace(String s) {
//    String replacedString = s;
//    if(s.contains("zero")) {
//      replacedString = s.replaceAll("zero", "0");
//    }
//    if (s.contains("one")) {
//    replacedString = replacedString.replaceAll("one","1");
//    }
//    if(s.contains("two")) {
//    replacedString = replacedString.replaceAll("two","2");
//    }
//    if(s.contains("three")) {
//    replacedString = replacedString.replaceAll("three","3");
//    }
//    if(s.contains("four")) {
//    replacedString = replacedString.replaceAll("four","4");
//    }
//    if(s.contains("five")) {
//    replacedString = replacedString.replaceAll("five","5");
//    }
//    if(s.contains("six")) {
//    replacedString = replacedString.replaceAll("six","6");
//    }
//    if(s.contains("seven")) {
//     replacedString = replacedString.replaceAll("seven","7");
//    }
//    if(s.contains("eight")) {
//    replacedString = replacedString.replaceAll("eight","8");
//    }
//    if(s.contains("nine")) {
//    replacedString = replacedString.replaceAll("night","9");
//    }
//    return replacedString;
//  }
