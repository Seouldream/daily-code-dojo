import {
  cutArray, sortArray, pick, cutSortAndPick, solution, solution2,
} from './kNumber';

test('sliceArray', () => {
  expect(cutArray([1, 5, 2, 6, 3, 7, 4], 2, 5)).toStrictEqual([5, 2, 6, 3]);
});

test('sort', () => {
  expect(sortArray([5, 2, 6, 3])).toStrictEqual([2, 3, 5, 6]);
});

test('pick', () => {
  expect(pick([2, 3, 5, 6], 3)).toBe(5);
});

test('wantedNumber', () => {
  expect(cutSortAndPick([1, 5, 2, 6, 3, 7, 4], [2, 5, 3])).toBe(5);
});

test('solution', () => {
  expect(solution([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))
    .toStrictEqual([5, 6, 3]);
});

test('solution2', () => {
  expect(solution2([1, 5, 2, 6, 3, 7, 4], [[2, 5, 3], [4, 4, 1], [1, 7, 3]]))
    .toStrictEqual([5, 6, 3]);
});
