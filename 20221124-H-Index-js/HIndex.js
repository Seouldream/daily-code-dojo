// 이해
// 풀이

export function hasMaxH(citations, h) {
  const hCount = [];

  citations.map((citation) => {
    if (citation >= h) {
      hCount.push(1);
    }
    return null;
  });

  if (hCount.length > h) {
    return true;
  }
  return false;
}

export function hasEnoughHCount(citations, h) {
  const count = [];

  citations.map((citation) => {
    if (citation >= h) {
      count.push(1);
    }
    return null;
  });

  return (count.length >= h);
}

export default function solution(citations) {
  let answer = 0;
  let h = 0;

  for (let i = 1; i < citations.length + 1; i += 1) {
    if (!hasMaxH(citations, i)) {
      h = i;
      break;
    }
  }

  for (let j = h; j >= 0; j -= 1) {
    if (hasEnoughHCount(citations, j)) {
      answer = j;

      return answer;
    }
  }
  answer = h;
  return answer;
}
