// 내 것과 당첨 표  일치번호 갯수구하기
// 0번호 갯수에 따른 최대 최소 구기
import {
  getRightNumbers, getZeroNumbers, getMaxRank, getMinRank, solution,
} from './BestAndWorstLottos';

test('getRightNumbers', () => {
  expect(getRightNumbers([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])).toBe(2);
});

test('getZeroNums', () => {
  expect(getZeroNumbers([44, 1, 0, 0, 31, 25])).toBe(2);
});

test('getMaxRank', () => {
  expect(getMaxRank(2, 2)).toBe(3);
});

test('getMinRank', () => {
  expect(getMinRank(2)).toBe(5);
});

test('finalResult', () => {
  expect(solution([44, 1, 0, 0, 31, 25], [31, 10, 45, 1, 6, 19])).toStrictEqual([3, 5]);
});
