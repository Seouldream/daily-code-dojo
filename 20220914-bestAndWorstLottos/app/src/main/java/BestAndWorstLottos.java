public class BestAndWorstLottos {
  public int[] solution(int[] lottos, int[] win_nums) {

    int[] answer = {};
    int getNumberOfWinNumbers = getRightNumber(lottos,win_nums);
    int numberOfZeros = countZero(lottos);
    int max = getNumberOfWinNumbers + numberOfZeros;
    int min = getNumberOfWinNumbers;

    answer = getRanks(min,max);
    return answer;
  }

  public int getRightNumber(int[] lottos, int[] win_nums) {
    int count = 0;
    for (int i = 0; i < lottos.length; i += 1) {
      for (int j = 0; j < win_nums.length; j += 1) {
        if (lottos[i] == win_nums[j]) {
          lottos[i] = -100;
          win_nums[j] = -1;
          count += 1;
        }
      }
    }
    return count;
  }

  public int countZero(int[] lottos) {
    int zeroCount = 0;
    for(int i : lottos) {
      if(i == 0) {
        zeroCount += 1;
      }
    }
    return zeroCount;
  }

  public int[] getRanks(int min, int max) {
    int[] answer;
    int minRank = 0;
    int rank = 0;
    for(int i = 6; i >= 1; i -= 1) {
      rank += 1;
      if(min == i) {
        minRank = rank;
      }
      if(min == 0) {
        minRank = 6;
      }
    }

    rank = 0;
    int maxRank = 0;
    for(int i = 6; i >= 1; i -= 1) {
      rank += 1;
      if(max == i) {
        maxRank = rank;
      }
      if(max == 0) {
        maxRank = 6;
      }
    }

    answer = new int[] {maxRank, minRank};
    return answer;
  }
}
