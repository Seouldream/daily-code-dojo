import { compareDays, solution } from './solution';

test('solution', () => {
  expect(
    solution('2022.05.19', ['A 6', 'B 12', 'C 3'], ['2021.05.02 A', '2021.07.01 B', '2022.02.19 C', '2022.02.20 C']),
  ).toStrictEqual([1, 3]);
  // expect(
  //   solution(
  //     '2020.01.01',
  //     ['Z 3', 'D 5'],
  //     ['2019.01.01 D', '2019.11.15 Z', '2019.08.02 D', '2019.07.01 D', '2018.12.28 Z'],
  //   ),
  // ).toStrictEqual([1, 4, 5]);
});

test('compareDays', () => {
  expect(compareDays('2022.05.19', '2021.05.02', 6)).toBe(185);
});
