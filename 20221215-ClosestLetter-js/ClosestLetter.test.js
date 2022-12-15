const { default: solution } = require('./ClosestLetter');

test('test', () => {
  expect(solution('banana')).toStrictEqual([-1, -1, -1, 2, 2, 2]);
});
