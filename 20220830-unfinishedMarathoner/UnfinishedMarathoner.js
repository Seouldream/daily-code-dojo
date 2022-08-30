export function solution(participant, completion) {
  const sortedParticipant = stringSort(participant);
  const sortedCompletion = stringSort(completion);

  const answer = compareArray(sortedParticipant, sortedCompletion);
  return answer;
}

export function stringSort(array) {
  array.sort();
  return array;
}

export function compareArray(participantArray, completionArray) {
  for (let i = 0; i < participantArray.length; i += 1) {
    if (participantArray[i] !== completionArray[i]) {
      const answer = participantArray[i];
      return answer;
    }
  }
}
