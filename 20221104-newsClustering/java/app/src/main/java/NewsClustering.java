import java.util.*;

// 이해
// 두 문자열이 주어짐
// 두 문자열을 두글자씩(주어진 배열 + 배열 + 1 ) 나눈다.
// 합집합과 교집합을 구한다.
// 조건
// 영문자만 유효하고 공백, 숫자 ,특수문자가 들어있는 글자는 해당 글자 요소를 버린다.
// 대문자와 소문자는 같은 것으로 취급한다 -> 모두 소문자화 시켜주면 되겠네
// 주어진 값에 65536을 곱한후 정수부만 출력한다.
// 풀이
// 0. 모두 대문자로 변환한다.
// 1. 문자열을 다음 문자열을 더해서 배열로 만든다.
// 2. 문자열의 길이는 2이상이므로 무조건 하나의 원소를 가진다.
// 영문자만 유효하고 공백, 숫자 ,특수문자가 들어있는 글자는 해당 글자 요소를 버린다. OK
// 3. 교집합을 어떻게 구할 것인가?
// -> 두 배열을 비교하고 공통된 원소가 있으면 배열에서 각각 하나씩 제거허고 제거하는 원소를 새로운 배열에 담는다. 교집합
// 4. -> 각각 두 배열에서 교집합을 제거한 배열을 남긴다. 이 모두를 교집합배열에 담는다 -> 합집합
// 5. -> 교집합의 갯수 / 합집합의 원소 갯수 * 65536
// 6. -> 정수부만 남긴다.
public class NewsClustering {
  public int solution(String str1, String str2) {
    String capitalConvertedString1 = convertToCapital(str1);
    String capitalConvertedString2 = convertToCapital(str2);

    List<String> stringList1ForIntersection = convertToArray(capitalConvertedString1);
    List<String> stringList2ForIntersection = convertToArray(capitalConvertedString2);

    List<String> stringList3ForSum = convertToArray(capitalConvertedString1);
    List<String> stringList4ForSum = convertToArray(capitalConvertedString2);

    List<String> intersection = getIntersectionOfSets(stringList1ForIntersection, stringList2ForIntersection);

    List<String> sum = getSumOfSets(stringList3ForSum, stringList4ForSum, intersection);

    System.out.println(intersection);

    double value = intersection.size() / (sum.size() + 0.0);

    if (intersection.size() == 0 && sum.size() == 0) {
      value = 1;

    }

    int answer = (int) Math.floor(value * 65536);
    return answer;
  }

  public String convertToCapital(String string) {
    return string.toUpperCase();
  }

  public List<String> convertToArray(String string) {
    List<String> stringArray = new ArrayList<>();
    for (int i = 0; i < string.length() - 1; i += 1) {
      if (containsException(string.substring(i, i + 2))) {
        stringArray.add(string.substring(i, i + 2));
      }
    }
    return stringArray;
  }

  public boolean containsException(String string) {
    String pattern = "^[a-zA-Z]*$";
    return string.substring(0, 1).matches(pattern) && string.substring(1, 2).matches(pattern);
  }

  public List<String> getIntersectionOfSets(List<String> stringArray1, List<String> stringArray2) {
    List<String> intersectionOfSets = new ArrayList<>();

    for (int i = 0; i < stringArray1.size(); i += 1) {
      for (int j = 0; j < stringArray2.size(); j += 1) {
        if (stringArray1.get(i).equals(stringArray2.get(j))) {
          intersectionOfSets.add(stringArray2.get(j));
          stringArray2.remove(j);
          break;
        }
      }
    }

    return intersectionOfSets;
  }

  public List<String> getSumOfSets(List<String> stringArray1, List<String> stringArray2, List<String> intersection) {
    List<String> sum = new ArrayList<>(intersection);

    System.out.println(">>>>>>>>>>>>>>>>   " + stringArray1);
    System.out.println(">>>>>>>>>>>>>>>>   " + stringArray2);

    for (int i = 0; i < intersection.size(); i += 1) {
      for (int j = 0; j < stringArray1.size(); j += 1) {
        if (intersection.get(i).equals(stringArray1.get(j))) {
          stringArray1.remove(j);
          break;
        }
      }
    }

    for (int i = 0; i < intersection.size(); i += 1) {
      for (int j = 0; j < stringArray2.size(); j += 1) {
        if (intersection.get(i).equals(stringArray2.get(j))) {
          stringArray2.remove(j);
          break;
        }
      }
    }
    System.out.println("교집합 제거된 배열 1: " + stringArray1);
    System.out.println("교집합 제거된 배열 2: " + stringArray2);

    for (String string : stringArray1) {
      sum.add(string);
    }

    for (String string : stringArray2) {
      System.out.println("input: " + string);
      sum.add(string);
    }

    System.out.println("교집합: " + intersection);
    System.out.println("합집합:  " + sum);
    return sum;
  }
}