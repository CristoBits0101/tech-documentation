const arrayA = [1, "1", null, undefined, false];
const arrayB = [1, "1", null, undefined, false];

const compareArrays = (arrayA, arrayB) => {                 // Función que devuelve si son iguales.
  return (
    arrayA.length === arrayB.length                         // Compara las longitudes
    &&
    arrayA.every((valor, index) => valor === arrayB[index]) // Compara los valores mediante la clave
  );
};

console.log(compareArrays(arrayA, arrayB));                 // true
