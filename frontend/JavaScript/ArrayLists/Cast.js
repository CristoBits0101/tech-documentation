let cadena = "Individualizar";
let array = Array.from(cadena);           // ["I", "n", "d", ...]
const indices = Array.from(array.keys()); // [0, 1, 2, ..., 12]

let resultado = indices                   // Duplicar las letras.
  .map((index) => {
    return index % 2 === 0 ? array[index].repeat(2) : array[index];
  })
  .join("");

console.log(resultado);
