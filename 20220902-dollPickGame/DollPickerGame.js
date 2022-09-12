export function getADollPick(board, move) {
    let value = 0;
for(let i = 0; i < board.length; i += 1 ) {
    if(board[i][move - 1] > 0 ) {
    value = board[i][move - 1];
    board[i][move - 1] = -1;    
    break; 
    }
}
return value;
}

export function checkBoardStatus(board,move) {
    getADollPick(board,move);
    const checkValue = getADollPick(board,move);
    return checkValue;
}

export function GetDollsArray(board,moves) {
    const dollsArray = [];
    let count = 0;
for(let i = 0; i < moves.length; i +=1) {
dollsArray.push(getADollPick(board,moves[i]))
}
 return dollsArray;
} 

export function getAnswer(dollsArray) {
    let count = 0;
    
    for(let i = 0; i < dollsArray.length; i += 1) {
        for(let j = 0; j < dollsArray.length; j +=1) {
            
            if(dollsArray[j] === dollsArray[j + 1] && dollsArray[j] != undefined) {
                console.log("same value: " + dollsArray);
                dollsArray.splice(j);
                
                count += 2;
                console.log("after value: " + dollsArray);
                break;
            }
        }
        }
    
    return count;
}
 

export function EdgeCase(array) {
    const dollsArray = [];
    let count = 0;
    for(let i = 0; i < array.length; i += 1) {
dollsArray.push(array[i])
    for(let j = 0; j < dollsArray.length; j += 1) {
    if(dollsArray[j] === dollsArray[j + 1]) {
        dollsArray.splice(j);
        dollsArray.splice(j);
        count += 2;
    }
}
}
return count;
}
