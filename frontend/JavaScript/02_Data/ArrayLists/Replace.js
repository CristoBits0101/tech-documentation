const array = [1, 2, 3, 4, 3];

/**
 * 2: Posición del array que empieza.
 * 1: Cantidad de elementos que elimina al final del array.
 * "replace": Remplaza el primer elemento desde la posición 2 del array.
 */
array.splice(2, 1, "Replace");

console.log(array);
