import { solution, compareArray, stringSort } from './UnfinishedMarathoner';

test('test', () => {
  expect(stringSort(['leo', 'kiki', 'eden'])).toStrictEqual(['eden', 'kiki', 'leo']);
  expect(stringSort(['eden', 'kiki'])).toStrictEqual(['eden', 'kiki']);

  expect(stringSort(['marina', 'josipa', 'nikola', 'vinko', 'filipa']))
    .toStrictEqual(['filipa', 'josipa', 'marina', 'nikola', 'vinko']);

  expect(stringSort(['josipa', 'filipa', 'marina', 'nikola']))
    .toStrictEqual(['filipa', 'josipa', 'marina', 'nikola']);
});

test('compare', () => {
  expect(compareArray(['eden', 'kiki', 'leo'], ['eden', 'kiki']))
    .toBe('leo');
  expect(compareArray(['filipa', 'josipa', 'marina', 'nikola', 'vinko'], ['filipa', 'josipa', 'marina', 'nikola']))
    .toBe('vinko');
});

test('solution', () => {
  expect(solution(['leo', 'kiki', 'eden'], ['eden', 'kiki']))
    .toBe('leo');
  expect(solution(
    ['marina', 'josipa', 'nikola', 'vinko', 'filipa'],
    ['josipa', 'filipa', 'marina', 'nikola'],
  ))
    .toBe('vinko');
});
