import solution, { getKindsOfClothes, getNumbersOfSpecificClothesTypes } from './Camouflage';

test('getKindsOfClothes', () => {
  expect(getKindsOfClothes([['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']]))
    .toStrictEqual(['headgear', 'eyewear']);
});

test('getKindsOfClothes', () => {
  expect(getNumbersOfSpecificClothesTypes(
    [['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']],
    ['headgear', 'eyewear'],
  ))
    .toStrictEqual([2, 1]);
});

test('answer', () => {
  expect(solution(
    [['yellow_hat', 'headgear'], ['blue_sunglasses', 'eyewear'], ['green_turban', 'headgear']],
  ))
    .toBe(5);
  expect(solution(
    [['crow_mask', 'face'], ['blue_sunglasses', 'face'], ['smoky_makeup', 'face']],
  ))
    .toBe(3);
});
