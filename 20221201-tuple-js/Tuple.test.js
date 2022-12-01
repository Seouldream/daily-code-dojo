import tupleFrom, { extractElement, getArrays, getElement } from './Tuple';

test('getArrays', () => {
  expect(getArrays('{{1},{1,2}}')).toStrictEqual([[1], [1, 2]]);
});

test('filtered', () => {
  expect(extractElement([1, 2], 1)).toStrictEqual([2]);
  expect(extractElement([1, 2, 4, 3], 1)).toStrictEqual([2, 4, 3]);
});

test('answer', () => {
  // expect(tupleFrom('{{20,111},{111}}')).toBe('ff');
  expect(tupleFrom('{{2,1,3,4},{2},{2,1},{2,1,3}}')).toBe('ff');
});
