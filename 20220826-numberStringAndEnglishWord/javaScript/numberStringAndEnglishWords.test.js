import solution from './numberStringAndEnglishWords';

test('test', () => {
  expect(solution('12zerozero')).toBe(1200);
  expect(solution('23four5six7')).toBe(234567);
  expect(solution('2three45sixseven')).toBe(234567);
  expect(solution('123')).toBe(123);
});
