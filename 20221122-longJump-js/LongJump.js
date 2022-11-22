function solution(number) {

    const initialCase = [0,1,2]
    
     const allCases = Array(number + 1).fill(0).reduce((cases, element, index) => {
        if (index <= 2) {
          return cases;
        }
    
        const casesAdded = [...cases, (cases[index - 1] + cases[index - 2]) % 1234567];
        return casesAdded;
      }, initialCase);
    
      return allCases[number];
    }
    