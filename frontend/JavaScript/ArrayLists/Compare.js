const arrayA = [1, "1", null, undefined, false];
const arrayB = [1, "1", null, undefined, false];

const compareArrays = (arrayA, arrayB) => {
  return (
    arrayA.length === arrayB.length 
    &&
    arrayA.every((valor, index) => valor === arrayB[index])
  );
};

console.log(compareArrays(arrayA, arrayB)); // true
