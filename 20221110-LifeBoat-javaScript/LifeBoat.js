// 가장 몸무게 작은사람 + 많은 사람 > 최대 무게 -> 많은 사람만 태운다. , 배열에서 삭제
// 가장 몸무게 작은 사람 + 다음 많은 사람 <= -> 두명 을 태운다. , 배열에서 삭제
//
export function sort(people) {
  people.sort((a, b) => a - b);

  return people;
}

export default function solution(people, limit, count = 0) {
  sort(people);

  if (people.length === 0) {
    return count;
  }

  if (people.length === 1) {
    people.shift();

    return solution(people, limit, count + 1);
  }
  if (people[people.length - 1] + people[0] <= limit) {
    people.shift();
    people.pop();

    return solution(people, limit, count + 1);
  }
  if (people[people.length - 1] + people[0] > limit) {
    people.pop();

    return solution(people, limit, count + 1);
  }

  return count;
}
