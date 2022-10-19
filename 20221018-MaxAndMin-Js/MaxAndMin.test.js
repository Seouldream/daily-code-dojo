import { getMax, getMin, solution } from './MaxAndMin';

test('getMax', () => {
  expect(getMax([1, 2, 3, 4])).toBe(4);
});

test('getMin', () => {
  expect(getMin([1, 2, 3, 4])).toBe(1);
});

test('getAnswer', () => {
  expect(solution('1 2 3 4')).toBe('1 4');
});
