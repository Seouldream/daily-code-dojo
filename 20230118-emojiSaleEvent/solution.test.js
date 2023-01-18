import solution from './solution';

test('solution', () => {
  expect(solution([[40, 10000], [25, 10000]], [7000, 9000]))
    .toStrictEqual([1, 5400]);
});
