// 내 것과 당첨 표  일치번호 갯수구하기
// 0번호 갯수에 따른 최대 최소 구기
import solution, { solution2 } from './ExpressionOfNumber';

test('answer', () => {
  expect(solution(15)).toBe(4);
});

test('answer2', () => {
  expect(solution2(15)).toBe(4);
});
