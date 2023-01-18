// 이모티콘 10 , 20 , 30 ,40 의 할인율을 가질 수 있음
// 일정 할인율이상이면 모두 구매한다는 조건과 일정 구매비용이상이면 플러스에 가입한다는 유저 정보가 주어짐
// 각 이모티콘의 가격을 담은 배열이 주어짐
// 최대의  플러스 가입자를 유치하면서 + 가장 많은 판매금액을 담은 배열을 리턴하라
// 1. 최대한 많은 가입자를 구하기
// 각 유저가 가입하는 조건을 구한다
// 이모티콘을 내림차순으로 정렬
// 이모티콘이 40 40 40 40 부터 시작해서 하나씩 까내리기
// 30 40 40 40
// 해당 조건에 가장 많은가입자를 낸 할인율을 구한다.
export default function solution(users, emoticons) {
  // 1) 최대 값 담을 변수 선언
  const answer = [0, 0];

  // 2) 할인율 변순 선언
  const discount = [10, 20, 30, 40];

  /*
        3) 이모티콘마다 할인율을 적용 가능한 가짓수를 담는다.
        ex) 이모티콘 2개 -> 4 * 4 = 16, 이모티콘 3개 -> 4 * 4 * 4 = 64 가짓수가 나온다.
    */
  const arr = [];

  // 4) 깊이 탐색을 통해 가능한 가짓수를 탐색한다. result : 이모티콘별 할인율 적용 값
  function dfs(emoticons, result) {
    // 5) 이모티콘이 없으면 탐색 종료
    if (emoticons.length < 1) {
      // 6) arr 배열에 탐색한 결괏값을 추가한다.
      arr.push(result);
      return;
    }

    // 7) 할인율 개수만큼 반복한다.
    for (let i = 0; i < discount.length; i += 1) {
      console.log(arr);
      // 8) 이모티콘 개수를 하나씩 줄이고, 줄였던 이모티콘의 할인율과 원가를 result에 담는다.
      dfs(emoticons.slice(1), [...result, [discount[i], emoticons[0]]]);
    }
  }

  // 9) 최초 dfs 함수 실행
  dfs(emoticons, []);

  // 10) 할인가 계산 함수
  const getDiscountedAmout = (dis, price) => ((100 - dis) / 100) * price;
  console.log(arr);
  // 11) 모든 가짓수만큼 실행한다.
  arr.forEach((disArr) => {
    // 12) 가짓수마다 서비스 가입 수와 매출액을 구한다. [가입자 수, 총 매출액]
    const accrue = [0, 0];

    // 13) 사용자 수만큼 반복한다.
    users.forEach(([per, price]) => {
      // 14) 매출액 변수 선언
      let sum = 0;

      // 15) 가짓수에 담긴 이모티콘의 개수만큼 실행한다.
      disArr.forEach(([dis, cost]) => {
        // 16) 사용자의 할인가 이상만 매출액을 구한다.
        if (dis >= per) {
          // 17) 총 매출액을 구한다.
          sum += getDiscountedAmout(dis, cost);
        }
      });

      // 18) 사용자의 마지노선 가격보다 매출액이 높으면, 그냥 서비스를 가입한다.
      if (sum >= price) {
        // 19) 서비스 증가
        accrue[0] += 1;
      } else {
        // 20) 높지 않다면 매출액을 증가시킨다.
        accrue[1] += sum;
      }
    });

    // 21) 최댓값을 비교한다. 우선순위 : 서비스 가입자 수 > 매출액
    if (answer[0] < accrue[0]) {
      // 22) 가입자 수가 더 많으면 accrue 값으로 최댓값 변경
      answer[0] = accrue[0];
      answer[1] = accrue[1];
    } else if (answer[0] === accrue[0]) {
      // 23) 동일할 경우
      if (answer[1] < accrue[1]) {
        // 24) 매출액으로 최댓값을 비교한다.
        answer[1] = accrue[1];
      }
    }
  });

  // 25) 최댓값을 return 한다.
  return answer;
}
