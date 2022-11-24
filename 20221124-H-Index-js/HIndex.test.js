import solution, { hasMaxH } from './HIndex.js';

test('getMaxH', () => {
  expect(hasMaxH([1, 2, 3], 3)).toBe(false);
});

test('getAnswer', () => {
  expect(solution([3, 0, 6, 1, 5])).toBe(3);
});

test('edgeCase', () => {
  expect(solution([4, 4, 4, 4, 4])).toBe(4);
});
