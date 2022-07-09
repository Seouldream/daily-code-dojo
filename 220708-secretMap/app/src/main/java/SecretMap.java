import static java.lang.Integer.parseInt;

// 받은 각 값을 2진법으로 전환하는 식을 구한다.
// 배열의 각 값을 구한다. ->  스트링으로 완료
// 어느하나라도 벽이면 벽 , 둘다 공백이면 공백
// 벽 1  , 공백 0
// 두 배열값 비교해주기 배열 1번의 캐릭터 1 이 ~와 같다면
//일부 테스트 통과 불가 수정 필요

 public class SecretMap {
   private String temporary = "";
   public String[] solution(int n, int[] arr1, int[] arr2) {
     String[] answer = {};

     String[] map1Array = new String[n];
     for (int i = 0; i < n; i += 1) {

       int quotient = arr1[i];
       int remainder = quotient % 2;

       String result = "";

       while (quotient != 0) {
         remainder = quotient % 2;
         quotient = quotient / 2;

         result = remainder + result;

         map1Array[i] = result;
       }
     }
     String[] map2Array = new String[n];

     for (int i = 0; i < n; i += 1) {

       int quotient = arr1[i];
       int remainder = quotient % 2;

       String result = "";

       while (quotient != 0) {
         remainder = quotient % 2;
         quotient = quotient / 2;

         result = remainder + result;

         map2Array[i] = result;
       }
     }


     for (int i = 0; i < n; i += 1) {
       while (map1Array[i].length() < n) {
         map1Array[i] = "0" + map1Array[i];
       }
     }

     for (int i = 0; i < n; i += 1) {
       while (map2Array[i].length() < n) {
         map2Array[i] = "0" + map2Array[i];
       }
     }


     String[] mapRealArray = new String[n];
     for (int i = 0; i < n; i += 1) {

       for (int z = 0; z < n; z += 1) {

         String row1StringCharacter = Character.toString(map1Array[i].charAt(z));
         String row2StringCharacter = Character.toString(map2Array[i].charAt(z));

         // 서로가 같고 어느하나가 0이다 -> 공백 지도
         String temp = "";
         if (row1StringCharacter.equals(row2StringCharacter)
             && row1StringCharacter.equals("0")) {
           temp = "0";
         }
         //
         if (row1StringCharacter.equals("1")
             || row2StringCharacter.equals("1")) {
           temp = "1";
         }

         temporary += temp;

       }
       mapRealArray[i] = temporary;
       temporary = "";

//   1번 지도  [01001, 10100, 11100, 10010, 01011]
//   2번 지도  [11110, 00001, 10101, 10001, 11100]
//   real map[11111, 10101, 11101, 10011, 11111]
     }
     for(int i = 0; i < n; i += 1) {
       mapRealArray[i] = mapRealArray[i].replace("0"," ");
       mapRealArray[i] = mapRealArray[i].replace("1","#");
     }
     answer = mapRealArray;
     return answer;
   }
 }

