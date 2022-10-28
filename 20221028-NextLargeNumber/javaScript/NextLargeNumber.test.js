// 내 것과 당첨 표  일치번호 갯수구하기
// 0번호 갯수에 따른 최대 최소 구기
import solution, { hasSameSizeOfOne } from './NextLargeNumber';

test('hasSameSize', () => {
  expect(hasSameSizeOfOne(78, 83)).toBe(true);
  expect(hasSameSizeOfOne(15, 23)).toBe(true);
});

test('answer', () => {
  expect(solution(78, 79)).toBe(83);
  expect(solution(15, 16)).toBe(23);
});
