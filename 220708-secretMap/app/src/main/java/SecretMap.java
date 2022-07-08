import static java.lang.Integer.parseInt;

// 받은 각 값을 2진법으로 전환하는 식을 구한다.
// 배열의 각 값을 구한다. ->  스트링으로 완료
// 어느하나라도 벽이면 벽 , 둘다 공백이면 공백
// 벽 1  , 공백 0
// 두 배열값 비교해주기 배열 1번의 캐릭터 1 이 ~와 같다면

 public class SecretMap {
   public String[] solution(int n, int[] arr1, int[] arr2) {

     String[] map1Array = new String[n];

     for (int i = 0; i < 5; i += 1) {

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

     for (int i = 0; i < 5; i += 1) {

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


     for (int i = 0; i < 5; i += 1) {
       while (map1Array[i].length() < 5) {
         map1Array[i] = "0" + map1Array[i];
       }
     }

     for (int i = 0; i < 5; i += 1) {
       while (map2Array[i].length() < 5) {
         map2Array[i] = "0" + map2Array[i];
       }
     }


     String[] mapRealArray = new String[n];
     for (int i = 0; i < n; i += 1) {
       for (int z = 0; z < n; z += 1) {
         String row1StringCharacter = Character.toString(map1Array[i].charAt(z));
         String row2StringCharacter = Character.toString(map2Array[i].charAt(z));
         String rowRealStringCharacter = Character.toString(mapRealArray[i].charAt(z));
         // 서로가 같고 어느하나가 0이다 -> 공백 지도
         if (row1StringCharacter.equals(row2StringCharacter)
             && row1StringCharacter.equals("0")) {
           rowRealStringCharacter = "0";
         }
         //
         if (row1StringCharacter.equals("1")
             || row2StringCharacter.equals("1")) {
           rowRealStringCharacter = "1";
         }
         mapRealArray[i] += rowRealStringCharacter;
       }
     }
     return new String[]{""};
   }
 }

