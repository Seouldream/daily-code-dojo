public class MaxAndMin {
    public String solution(String s) {
      String[] numbers = s.split(" ");

      int newMaxNumber = Integer.parseInt(numbers[0]);;
      int maxNumber = Integer.parseInt(numbers[0]);
      for(String element : numbers) {
        int firstNumber = Integer.parseInt(numbers[0]);
        maxNumber = Math.max(maxNumber,Integer.parseInt(element));
        newMaxNumber = Math.max(maxNumber,newMaxNumber);
      }

      int newMinNumber = Integer.parseInt(numbers[0]);
      int minNumber = Integer.parseInt(numbers[0]);

      for(String element : numbers) {
        int firstNumber = Integer.parseInt(numbers[0]);
        minNumber = Math.min(minNumber,Integer.parseInt(element));
        newMinNumber = Math.min(minNumber,newMinNumber);
      }
      String answer ="";

      answer = newMinNumber + " " + newMaxNumber;

      return answer;
    }
}

