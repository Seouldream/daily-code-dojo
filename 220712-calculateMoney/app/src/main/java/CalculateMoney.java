//
public class CalculateMoney {
   private int moneyInNeed = 0;

  public long solution(int price, int money,int count) {
    long answer = 0;
    Long newPrice = Long.valueOf(price);
    Long newMoney = Long.valueOf(money);
    Long newCount = Long.valueOf(count);

    getMoneyInNeed(newPrice,newCount);


    if(money  < moneyInNeed) {
      answer = Math.abs(newMoney - moneyInNeed);
    }


    if(money  > moneyInNeed) {
      answer = 0;
    }


    return answer;
  }


  public long getMoneyInNeed(Long newPrice, Long newCount) {
    moneyInNeed = 0;
    for(int i = 1; i < newCount + 1; i += 1 ) {
      long expression = newPrice * i;
      moneyInNeed += expression;

    }
    return moneyInNeed;
  }
}
