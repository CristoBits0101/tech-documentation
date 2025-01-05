// 1. Declaración: Crear listas o arrays básicos
const lista = []
const lista2 = [undefined, null, false, 0, '']
const lista3 = [
  { name: 'Cristo', age: 36 },
  { name: 'Toru', age: 6 },
]

// 2. Modificar: Agregar o modificar valores en un array
lista[0] = 0
lista.unshift('Valor al inicio')
lista.push('Valor al final')

// 3. Convertir: Convertir entre arrays y cadenas
const lista = Array.from('data')
const cadena = ahoraSoyUnaLista.join(', ')

// 4. Comparar: Comparar arrays para determinar igualdad
if (arrayA.join('') === lista2.join('')) console.log(true) // Devuelve true o false
if (arrayA.join('') !== lista2.join('')) console.log(true) // Devuelve true o false
if (
  arrayA.length === lista2.length &&
  arrayA.every((element, index) => element === lista2[index]) // Devuelve true o false
)
  console.log(true)

// 5. Concatenar: Combinar o unir arrays
let listaA = [1, 2, 3, 4, 5]
let listaB = [1, 2, 3, 4, 5]
let listaC = [1, 2, 3, 4, 5]

const lista4 = [...listaA, ...listaB, ...listaC] // Crea una lista unica
const arrayI = [arrayA, lista2] // Crea una lista de listas
const arrayJ = arrayA.map((t) => {
  // Crea una lista de listas
  return t.concat(' l')
})

// 6. Filtrar: Seleccionar elementos de un array
const firstElement = array.find((element) => element.nombre === 'Cuenca') // Devuelve un elemento
const newArray = array.filter((property) => property.edad > 32) // Devuelve un array
const partialArray = array.slice(2, 3) // Devuelve un array

// 7. Recorrer: Recorrer arrays con bucles o iteradores
for (let i = 0; i < arrayA.length; i++) console.log(arrayA[i])

const indices = Array.from(arrayA.keys()) // Devuelve un array con los indices

// 8. Reduce: Reducir un array a un único valor
const arrayE = [
  { nombre: 'Juan', edad: 25 },
  { nombre: 'Ana', edad: 30 },
  { nombre: 'Luis', edad: 20 },
  { nombre: 'Maria', edad: 35 },
]

const sumAges = arrayE.reduce(
  (accumulator, element) => accumulator + element.edad,
  0
)

console.log(sumAges) // Salida: 110

// 9. Rest: Trabajar con el operador rest y spread
const arrayK = [1, 2, 3, 4, 5]
function sum(...numbers) {
  // Suma al acumulador el elemento
  // El acumulador empieza en 0
  return numbers.reduce((a, e) => a + e, 0)
}
console.log(sum(...arrayK))

// 10. Replace: Reemplazar elementos en un array
// startIndex, deleteQuantity, (optional) replaceWith a value
arrayA.splice(2, 1, 'Replace')

// 11. Set: Trabajar con conjuntos (Set)
const arrayL = new Set()
arrayL.add('pepa')
arrayL.delete('pepa')
arrayL.clear()
console.log(arrayL.has(3))
console.log(arrayL.size())

// 12. Sort: Ordenar elementos de un array
arrayK.sort((firstElement, secondElement) => firstElement - secondElement)
arrayK.sort((firstElement, secondElement) => secondElement - firstElement)

// 13. Remove: Eliminar elementos de un array
arrayC.shift() // remove first element
arrayC.pop() // remove second element

// 14. Verify: Verificar condiciones en arrays
arrayA.some((element) => element === 'Exists') // Devuelve true o false en la primera coincidencia
array.every((valor) => valor !== null) // True si todos los elementos cumplen la condición

// 15. forEach: Iterar sobre elementos de un array
array.forEach((element) => {})

// 16. Sort: Ordenar una lista de objetos
const objectList = [
  { nombre: 'Crista', edad: 31 },
  { nombre: 'Criste', edad: 32 },
  { nombre: 'Cristi', edad: 33 },
]

objectList.sort((a, b) => a.nombre.localeCompare(b.nombre)) // Ordenar por nombre
objectList.sort((a, b) => a.edad - b.edad) // Ordenar por edad
