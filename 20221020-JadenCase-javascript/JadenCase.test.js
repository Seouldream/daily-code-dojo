import solution, { split, converter } from './JadenCase';

test('split', () => {
  expect(split('FOR the last week')).toStrictEqual(
    ['f', 'o', 'r', ' ', 't', 'h', 'e', ' ', 'l', 'a', 's', 't', ' ', 'w', 'e', 'e', 'k'],
  );
});

test('converToUpperArray', () => {
  expect(converter(
    ['f', 'o', 'r', ' ', 't', 'h', 'e'],
  )).toStrictEqual(
    ['F', 'o', 'r', ' ', 'T', 'h', 'e'],
  );

  expect(converter(
    ['f', 'o', 'r', ' ', ' ', 't', 'h', 'e'],
  )).toStrictEqual(
    ['F', 'o', 'r', ' ', ' ', 'T', 'h', 'e'],
  );
});

test('getAnswer', () => {
  expect(solution(
    'for the last week',
  )).toBe(
    'For The Last Week',
  );

  expect(solution(
    '3people unFollowed me',
  )).toBe(
    '3people Unfollowed Me',
  );
});
