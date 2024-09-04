const numbers = [1, 2, 3, 4, 5];

function sum(...numbers) {                   // No hay limite de parámetros.
  return numbers.reduce((a, b) => a + b, 0);
}

console.log(sum(...numbers));                // output: 15
