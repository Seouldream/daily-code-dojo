import {
  rentLowerNumberFirst,
  solution, rentUnder, removeMyNumber,
} from './StolenSchoolTrackSuits';

test('removeMyself', () => {
  expect(removeMyNumber([2, 4], [1, 3, 5])).toStrictEqual([1, 3, 5]);
  expect(removeMyNumber([2, 1, 5], [1, 3, 5])).toStrictEqual([3]);
  expect(removeMyNumber([3], [1])).toStrictEqual([1]);
});

// test('solution', () => {
//   expect(solution(5, [2, 4], [1, 3, 5])).toBe(5);
//   expect(solution(5, [2, 4], [3])).toBe(4);
//   expect(solution(3, [3], [1])).toBe(2);
// });

test('rentLower', () => {
  expect(rentLowerNumberFirst(5, [2, 4], [1, 3, 5])).toBe(5);
  expect(rentLowerNumberFirst(5, [2, 1, 5], [1, 3, 5])).toBe(5);
  expect(rentLowerNumberFirst(3, [3], [1])).toBe(2);
});

// test('removeOneMore', () => {
//   expect(rentOnemore([2, 4], [1, 3, 5])).toStrictEqual([5]);
//   expect(rentOnemore([2, 1, 5], [1, 3, 5])).toStrictEqual([]);
//   expect(rentOnemore([3], [1])).toStrictEqual([1]);
// });
