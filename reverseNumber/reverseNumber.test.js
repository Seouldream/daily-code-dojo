import { solution, makeNumbersToArray, makeSortedArray } from './reverseNumber';

test(('reverseNumber'), () => {
   
  expect(solution(118372)).toBe(873211);
});

test(('toArray'), () => {
  expect(makeNumbersToArray('118372')).toStrictEqual(['1', '1', '8', '3', '7', '2']);
});

test(('sortedArray'), () => {
  expect(makeSortedArray(
    ['1', '1', '8', '3', '7', '2'],
  )).toStrictEqual(['8', '7', '3', '2', '1', '1']);
});

// 118372	873211
