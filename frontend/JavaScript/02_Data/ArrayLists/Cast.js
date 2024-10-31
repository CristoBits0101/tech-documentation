let cadena = 'Individualizar'
let array = Array.from(cadena) // ["I", "n", "d", ...]

console.log('Array: ', array)
console.log('Keys: ', array.keys())

/**
 * 1. Keys obtiene las claves
 * 2. Array.from las parsea a un array
 */
const indices = Array.from(array.keys())

console.log('Indices: ', indices)

// Duplicar las letras en los índices pares
let resultado = indices
  .map((index) => {
    return index % 2 === 0 ? array[index].repeat(2) : array[index]
  })
  .join('')

console.log(resultado)
