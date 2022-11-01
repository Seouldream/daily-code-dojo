// 이해
// 1.  노란격자를 브라운이 1줄로 감싸고 있음
// 2. 노란격자 수와 브라운 격자 수가 주어짐
// 3. 노란격자는 항상 가로롤 넓음
// 풀이
// 1. 브라운 갯수 = (노란색의 세로길이 + 2)* 2 + (노란색의 가로길이) * 2
// 2. 노랑이 가로 + 2 + 가로길이 노랑이 세로 + 2

export default function solution(brown, yellow) {
  const yellowArray = Array.from(
    { length: parseInt(Math.sqrt(yellow), 10) }
    , (_, i) => i + 1,
  );

  const yellowLength = yellowArray.filter(
    (length) => (length + 2) * 2 + (yellow / length) * 2 === brown
    && length * (yellow / length) === yellow,
  );

  const answer = [(yellow / yellowLength) + 2, (yellowLength * 1) + 2];

  return answer;
}
