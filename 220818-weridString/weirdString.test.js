import { stringTransformer, solution } from './weirdString';

test('transform', () => {
  expect(stringTransformer('try')).toBe('TrY');
  expect(stringTransformer('hello')).toBe('HeLlO');
  expect(stringTransformer('world')).toBe('WoRlD');
});

test('solution', () => {
  expect(solution('try hello world')).toBe('TrY HeLlO WoRlD');
});
