// 내 것과 당첨 표  일치번호 갯수구하기
// 0번호 갯수에 따른 최대 최소 구기
import { tester } from './WordChain';

test('tester', () => {
  expect(tester(3, ['tank', 'kick', 'know', 'wheel', 'land', 'dream', 'mother', 'robot', 'rank']))
    .toStrictEqual(['rank']);
});
