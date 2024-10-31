// Add
arrayA.unshift('Initial value')
arrayB.push('Last value')

// Cast
const arrayD = Array.from('data')
const arrayE = arrayC.join(',')

// Compare
if (arrayA.join('') === arrayB.join('')) console.log(true)
if (arrayA.join('') !== arrayB.join('')) console.log(true)
if (
  arrayA.length === arrayB.length &&
  arrayA.every((element, index) => element === arrayB[index])
)
  console.log(true)

// Concatenate
const arrayF = [...arrayA, ...arrayB, ...arrayC]
const arrayG = [arrayA, arrayB]
const arrayH = arrayA.map((nameVariable) => {
  return nameVariable.concat(' l')
})

// Create
const arrayA = []
const arrayB = [undefined, null, false, 0, '']
const arrayC = new Array(3)
const arrayI = [
  { name: 'Cristo', age: 36 },
  { name: 'Toru', age: 6 },
]

// Exists
arrayA.some((element) => element === 'Exists')
arrayI.some((element) => element.name === 'Cristo')

// Filter
const firstElement = array.find((element) => element.nombre === 'Cuenca')
const newArray = array.filter((property) => property.edad > 32)
const partialArray = array.slice(2, 3)

// Keys
const indices = Array.from(arrayA.keys())

// Remove
arrayC.shift()
arrayC.shift(2, 1)
arrayC.pop()
