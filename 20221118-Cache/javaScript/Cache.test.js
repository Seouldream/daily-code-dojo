import solution, { remove } from './Cache';

test('Cache', () => {
  // expect(solution(
  //   3,
  //   ['Jeju', 'Pangyo', 'Seoul', 'NewYork', 'LA', 'Jeju', 'Pangyo', 'Seoul', 'NewYork', 'LA'],
  // )).toBe(50);

  expect(solution(
    3,
    ['Jeju', 'Pangyo', 'Seoul', 'Jeju', 'Pangyo', 'Seoul', 'Jeju', 'Pangyo', 'Seoul'],
  )).toBe(21);
  expect(solution(
    2,
    ['Jeju', 'Pangyo', 'Seoul', 'NewYork', 'LA', 'SanFrancisco', 'Seoul', 'Rome', 'Paris', 'Jeju', 'NewYork', 'Rome'],
  )).toBe(60);
  expect(solution(
    5,
    ['Jeju', 'Pangyo', 'Seoul', 'NewYork', 'LA', 'SanFrancisco', 'Seoul', 'Rome', 'Paris', 'Jeju', 'NewYork', 'Rome'],
  )).toBe(52);
  expect(solution(
    0,
    ['Jeju', 'Pangyo', 'Seoul', 'NewYork', 'LA'],
  )).toBe(25);
  expect(solution(
    2,
    ['Jeju', 'Pangyo', 'NewYork', 'newyork'],
  )).toBe(16);
});

// test('filtered', () => {
//   expect(remove(['a', 'b', 'c'], 'b')).toStrictEqual(['a', 'c']);
//   expect(remove(['jeju', 'pangyo', 'seoul'], 'jeju')).toStrictEqual(['pangyo', 'seoul']);
// });
