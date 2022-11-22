

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
