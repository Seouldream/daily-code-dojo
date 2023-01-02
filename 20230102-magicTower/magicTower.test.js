import solution from './magicTower';

test('case1', () => {
  expect(solution(16)).toBe(6);
  expect(solution(2554)).toBe(16);
  expect(solution(6)).toBe(5);
  expect(solution(25)).toBe(7);
  expect(solution(295)).toBe(8);
  expect(solution(205)).toBe(7);
  expect(solution(155)).toBe(11);
  expect(solution(75)).toBe(8);
});
