// Add
arrayA.unshift('Initial value')
arrayB.push('Last value')

// Cast
const arrayF = Array.from('data')
const arrayG = arrayC.join(',')

// Compare
if (arrayA.join('') === arrayB.join('')) console.log(true)
if (arrayA.join('') !== arrayB.join('')) console.log(true)
if (
  arrayA.length === arrayB.length &&
  arrayA.every((element, index) => element === arrayB[index])
)
  console.log(true)

// Concatenate
const arrayH = [...arrayA, ...arrayB, ...arrayC]
const arrayI = [arrayA, arrayB]
const arrayJ = arrayA.map((t) => {
  return t.concat(' l')
})

// Create
const arrayA = []
const arrayB = [undefined, null, false, 0, '']
const arrayC = new Array(undefined, null, false, 0, '')
const arrayD = new Array(3)
const arrayE = [
  { name: 'Cristo', age: 36 },
  { name: 'Toru', age: 6 },
]

// Filter
const firstElement = array.find((element) => element.nombre === 'Cuenca')
const newArray = array.filter((property) => property.edad > 32)
const partialArray = array.slice(2, 3)

// For
for (let i = 0; i < arrayA.length; i++) console.log(arrayA[i])

// Keys
const indices = Array.from(arrayA.keys())

// Modify
lista3[2] = `a`

// Reduce
const sumAges = arrayE.reduce(
  (accumulator, element) => accumulator + element.edad,
  0
)

// Rest
const arrayK = [1, 2, 3, 4, 5]

function sum(...numbers) {
  return numbers.reduce((a, b) => a + b, 0)
}

console.log(sum(...arrayK))

// Replace
arrayA.splice(2, 1, 'Replace')

// Set
const arrayL = new Set()
arrayL.add('pepa')
arrayL.delete('pepa')
arrayL.clear()

console.log(arrayL.has(3))
console.log(arrayL.size())

// Sort
arrayK.sort((firstElement, secondElement) => firstElement - secondElement)
arrayK.sort((firstElement, secondElement) => secondElement - firstElement)

// Remove
arrayC.shift()
arrayC.shift(2, 1)
arrayC.pop()

// Verify
arrayA.some((element) => element === 'Exists')
arrayI.some((element) => element.name === 'Cristo')
array.every((valor) => valor !== null)
array.every((valor) => typeof valor === 'number' && valor > 0)

array.forEach(element => {
  
});
