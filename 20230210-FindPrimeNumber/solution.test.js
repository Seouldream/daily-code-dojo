import { isPrimeNumber, solution } from './solution';

test('solution', () => {
  expect(solution(10)).toBe(4);
  expect(solution(5)).toBe(3);
});

test('isPrimeNumber', () => {
  expect(isPrimeNumber(2, [])).toBe(true);
  expect(isPrimeNumber(3, [2])).toBe(true);
  expect(isPrimeNumber(4, [2, 3])).toBe(false);
  expect(isPrimeNumber(5, [2, 3])).toBe(true);
  expect(isPrimeNumber(6, [2, 3, 5])).toBe(false);
});
