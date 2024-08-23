const lista1 = [1, "1", null, undefined, false];
const lista2 = new Array(1, "1", null, undefined, false);
const lista3 = new Array();

lista3 = lista1.concat(lista2);               // Unir con concat.
let lista4 = [...lista1, ...lista2];          // Unir con spread.
let lista5 = [lista1, lista2];                // Unir en una matriz.

const lista6 = [1, 234, "nbdsfxg3"];          // Alterar posiciones.
const lista7 = array1.map((nameVariable) => {
  return nameVariable.concat(" l");
});
