// 내 것과 당첨 표  일치번호 갯수구하기
// 0번호 갯수에 따른 최대 최소 구기
import { getResultArray, solution, turnToBinary } from './RepeatBinary';

test('getResultArray', () => {
  expect(getResultArray('110010101001')).toStrictEqual([6, 6]);
  expect(getResultArray('110')).toStrictEqual([1, 2]);
});

test('solution', () => {
  expect(solution('110010101001')).toStrictEqual([3, 8]);
});
