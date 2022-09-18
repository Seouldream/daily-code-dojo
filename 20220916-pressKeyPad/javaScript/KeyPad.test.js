import solution from './keyPad';

describe('solution', () => {
  it('PullRightHandOneNumber', () => {
    expect(solution([3], 'right')).toBe('R');
  });

  it('PullLeftHandNumber', () => {
    expect(solution([1, 4, 7], 'left')).toBe('LLL');
  });

  it('PullTwoHandNumber', () => {
    expect(solution([1, 3, 4, 6, 7, 9], 'right')).toBe('LRLRLR');
  });

  it('PullCenterNumber', () => {
    expect(solution([7, 8], 'left')).toBe('LL');
    expect(solution([9, 8], 'right')).toBe('RR');
  });

  it('PullZeroNumber', () => {
    expect(solution([0], 'right')).toBe('R');
    expect(solution([0], 'left')).toBe('L');
  });

  it('DistanceEqualRightLeft', () => {
    expect(solution([4, 6, 5], 'right')).toBe('LRR');
    expect(solution([1, 2, 3, 4, 5, 6], 'right')).toBe('LLRLLR');
  });

  it('solution', () => {
    expect(solution([1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5], 'right'))
      .toBe('LRLLLRLLRRL');
  });
});