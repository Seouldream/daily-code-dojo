import solution, { convertTo } from './cantorArray';


test('solution', () => {
  expect(solution(2,4,17)).toBe(8);
});

test('convertToCantor', () => {
  expect(convertTo("1",2)).toBe("1101111011000001101111011")
})
