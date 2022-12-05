import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


class Solution {

  private Map<String, Car> carMap = new HashMap<>(); // 차량 번호판으로 구분되는 Car Map

  public int[] solution(int[] fees, String[] records) {
    for (String record : records) {
      String[] recordInfo = record.split(" ");
      String time = recordInfo[0];
      String carNumber = recordInfo[1];
      String action = recordInfo[2]; // "IN" or "OUT"

      Car car = carMap.getOrDefault(carNumber, new Car(carNumber, 0, false)); // CarMap에 존재하지 않는 차인 경우 새로 생성
      if (action.equals("IN")) {
        car.parking(time); // 주차 시키기
      } else if (action.equals("OUT")) {
        car.exit(time); // 출차 시키기
      }

      carMap.put(carNumber, car); // 변경된 상태 저장
    }

    List<Car> cars = new ArrayList<>();
    for (String carNumber : carMap.keySet()) {
      cars.add(carMap.get(carNumber)); // 정렬을 위한 리스트로 변환
    }

    Collections.sort(cars); // 정답은 차량 번호판이 작은 순서로 나가야 함

    int[] answer = new int[cars.size()];
    int i = 0;
    for (Car car : cars) {
      car.calculateParkingFee(fees); // 차 마다 주차비 계산
      answer[i++] = car.parkingFee;
    }
    return answer;
  }
}

class Car implements Comparable<Car> {
  String carNumber;
  int parkingAmount;
  LocalTime parkedAt;
  boolean isParking;

  int parkingFee;

  public Car(String carNumber, int parkingAmount, boolean isParking) {
    this.carNumber = carNumber;
    this.parkingAmount = parkingAmount;
    this.isParking = isParking;
  }

  public void parking(String time) {
    isParking = true;
    parkedAt = LocalTime.parse(time); //주차 시간 저장
  }

  public void exit(String time) {
    isParking = false;
    LocalTime exitAt = LocalTime.parse(time);

    int amount = (int)Duration.between(parkedAt, exitAt).toMinutes(); //Duration, LocalTime을 통해 문자열로 주어진 시간의 차(분)를 구함
    parkingAmount += amount;
  }

  public void calculateParkingFee(int[] fees) {
    int basicTime = fees[0];
    int basicPrice = fees[1];
    int unitTime = fees[2];
    int unitPrice = fees[3];

    if (this.isParking) { // 하루가 지났는데, 출차 기록이 없는 경우 "23:59"분에 출차한걸로 간주
      exit("23:59");
    }

    if (parkingAmount > 0) { // 주차를 했다면 기본요금
      parkingFee += basicPrice;
      parkingAmount -= basicTime; // 기본요금 지불 후 기본 시간 차감
    }

    if (parkingAmount > 0) { // 기본 시간 이상으로 주차 한 경우
      int units = parkingAmount / unitTime;
      parkingFee += units * unitPrice; // 단위 시간 만큼 주차비 지불
      if (parkingAmount % unitTime != 0) { // 단위 시간 보다 남는 경우 올림해서 더함
        //ex) unitTime = 10, parkingAmount = 23 => [20 | 3] 으로 총 30분에 대하여 지불해야함
        parkingFee += unitPrice;
      }
    }
  }

  @Override
  public int compareTo(Car o) { // 차량 번호판 오름차순으로 정렬
    return this.carNumber.compareTo(o.carNumber);
  }
}