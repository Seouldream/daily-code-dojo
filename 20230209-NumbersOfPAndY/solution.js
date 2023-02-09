// p의 개수 y의 개수 비교
// p, y 하나도 없을 경우 true 리턴

// p의 갯수 파악
// y의 갯수 파악
// 비교
function solution(s){
    var answer = true;

    const stringArray = s.toLowerCase().split('');
    
    let numbersOfP = 0;
    let numbersOfY = 0;
    
    for(let i = 0; i < stringArray.length; i +=1) {
        if(stringArray[i] === "p") {
            numbersOfP += 1
        }
        if(stringArray[i] === "y") {
            numbersOfY += 1
        }
    }
    
    if(numbersOfP === numbersOfY) {
        return true;
    }
    
    return false;

}