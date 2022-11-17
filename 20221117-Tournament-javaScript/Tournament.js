export default function solution(n, a, b, round = 0) {
  if (a === b) { return round; }
  return solution(n, Math.ceil(a / 2), Math.ceil(b / 2), round + 1);
}
