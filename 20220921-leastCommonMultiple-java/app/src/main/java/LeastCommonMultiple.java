import java.util.*;

// 최소 공배수 구하는법
// 2 , 6, 8, 14
// 2 * (2 * 3) * (2*2*2) * (2 * 7)
// 2 * 2 * 2 * 3 * 7
// 소수로 만드는 방법 자기자신을 절반을 나누고 1부터 절반까지 나누어서 나누어지는 수가 없으면 소수임
// 주어진 수들을 소수의 배열로 만듬 [ 2 ] [2 , 3 ] , [ 2, 2, 2 ] [2, 7]
public class LeastCommonMultiple {
  public int solution(int[] arr) {
    int answer = arr[0];

    for(int i = 1; i < arr.length; i +=1) {
      int greatestCommonDivisor = getGreatestCommonDivisor(arr[i], answer);

      answer = answer * arr[i] / greatestCommonDivisor;
    }
    return answer;
  }

  public int getGreatestCommonDivisor(int a , int b) {
    int maxNumber = Math.max(a,b);
    int minNumber = Math.min(a,b);

    while( maxNumber % minNumber != 0) {
      int newMinNumber = maxNumber % minNumber;
      maxNumber = minNumber;
      minNumber = newMinNumber;
    }

    return minNumber;
  }

//  public boolean isPrimeNumber(int number) {
//    if (number == 1 || number == 2) {
//      return true;
//    }
//    for (int i = 2; i <= number / 2; i += 1) {
//      if (number % i == 0) {
//        return false;
//      }
//    }
//    return true;
//  }
//
//  public int[] getPrimeNumber(int number) {
//    if (number == 1 || number == 2) {
//      return new int[]{number};
//    }
//    List<Integer> list = new ArrayList();
//
//    for (int i = 2; i <= number / 2; i += 1) {
//      if (number % i == 0 && isPrimeNumber(i)) {
//        list.add(i);
//      }
//      if (number % i == 0 && !isPrimeNumber(i)) {
//        for (int j = 2; j <= i / 2; j += 1) {
//          if (number % j == 0 && isPrimeNumber(j)) {
//            list.add(j);
//          }
//        }
//      }
//    }
//    int[] array = list.stream().mapToInt(n -> n).toArray();
//    return array;
//  }
}

