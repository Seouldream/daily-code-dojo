// 내 것과 당첨 표  일치번호 갯수구하기
// 0번호 갯수에 따른 최대 최소 구기

import { sort } from './LifeBoat';

test('sort', () => {
  expect(sort([70, 50, 80, 50]))
    .toStrictEqual([50, 50, 70, 80]);
});
