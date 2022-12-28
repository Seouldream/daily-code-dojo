const { default: solution, getArray } = require('./smallString');

test('getArray', () => {
  expect(getArray('3141592', '271')).toStrictEqual(
    ['314', '141', '415', '159', '592'],
  );
});

test('solution', () => {
  expect(solution('3141592', '271')).toStrictEqual(
    ['141', '159'],
  );
  expect(solution('500220839878', '7')).toStrictEqual(
    ['5', '0', '0', '2', '2', '0', '3', '7'],
  );
});
