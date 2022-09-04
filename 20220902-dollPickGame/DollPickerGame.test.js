import { getADollPick ,checkBoardStatus,GetDollsArray,EdgeCase,getAnswer } from "./DollPickerGame";

test("getADollPick", () => {
    expect(getADollPick([
        [0,0,0,0,0],
        [0,0,1,0,3],
        [0,2,5,0,1],
        [4,2,4,4,2],
        [3,5,1,3,1]
    ],1)).toBe(4);
    expect(getADollPick([
        [0,0,0,0,0],
        [0,0,1,0,3],
        [0,2,5,0,1],
        [4,2,4,4,2],
        [3,5,1,3,1]
    ],5)).toBe(3); 
    expect(getADollPick([
        [0,0,0,0,0],
        [0,0,0,0,3],
        [0,2,0,0,1],
        [4,2,0,4,2],
        [3,5,0,3,1]
    ],3)).toBe(0); 
})

test("CheckBoardStatus", () => {
    expect(checkBoardStatus([
        [0,0,0,0,0],
        [0,0,1,0,3],
        [0,2,5,0,1],
        [4,2,4,4,2],
        [3,5,1,3,1]
    ],5)).toBe(1);
    expect(checkBoardStatus([
        [0,0,0,0,0],
        [0,0,1,0,3],
        [0,2,5,0,1],
        [4,2,4,4,2],
        [3,5,1,3,1]
    ],1)).toBe(3);
})

test('DollsArray', () => {
    expect(GetDollsArray([
        [0,0,0,0,0],
        [0,0,1,0,3],
        [0,2,5,0,1],
        [4,2,4,4,2],
        [3,5,1,3,1]
    ],[1,5,3,5,1,2,1,4])).toStrictEqual([4,3,1,1,3,2,0,4])
    expect(GetDollsArray([
        [0, 0, 1, 0, 0],
        [0, 0, 1, 0, 0],
        [0, 2, 1, 0, 0],
        [0, 2, 1, 0, 0],
        [0, 2, 1, 0, 0]
    ],[1, 2, 3, 3, 2, 3, 1])).toStrictEqual([0,2,1,1,2,1,0]);
}) 

test('EdgeCase', () => {
    expect(EdgeCase([1,5,4,3,3,4,5,1])).toBe(8);
    expect(EdgeCase([4,3,3,4,5,1])).toBe(4);
    expect(EdgeCase([4,3,3,4,4,3,1])).toBe(4);
    expect(EdgeCase([3,1,1,3,1])).toBe(4);
})

test('getAnswer', () => {
    expect(getAnswer([4,3,1,1,3,2,0,4])).toBe(4);
})
