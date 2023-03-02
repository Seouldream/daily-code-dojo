import solution from './solution';

test('solution', () => {
  expect(solution('abcde')).toBe('c');
  expect(solution('qwer')).toBe('we');
});
