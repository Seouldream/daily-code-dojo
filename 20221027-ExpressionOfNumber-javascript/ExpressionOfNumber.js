// 이해
// 1부터 시작하여 연속되는 자연수를 모두 더한다 -> 합이 n 과 같으면 카운트 +1
// 앞 단계가 조건에 맞지 않으면 앞의 시작 수에 1 을 더해서 계속 반복한다.

// 계획
// 1 부터 연속되는 자연수를 차례로 더하는 방법은? for 문을 통해서 i를 하나씩 늘린다.
// 앞의 시작수에 1씩 더해서 다시 반복하려면? 이중 for 문을 통해서 시작하는 i 에 1 씩 더해준다.

// 1 + 2 + 3
// 2 + 3 + 4 ...
// 3 + 4 + 5+ 6 + ...
// when i === 1
// j = 1
// total = 1
// j = 2
// total = 1 + 2
export default function solution(n) {
  const answer = [];
  for (let i = 1; i < n + 1; i += 1) {
    let total = 0;
    for (let j = i; j < n + 1; j += 1) {
      total += j;
      if (total === n) {
        answer.push(1);
        break;
      }
      if (total > n) {
        break;
      }
    }
  }

  return answer.length;
}

export function solution2(n) {
  const answer = [];

  for (let i = 0; i <= n; i += 1) {
    if (n % i === 0 && i % 2 === 1) {
      answer.push(1);
    }
  }

  return answer.length;
}
