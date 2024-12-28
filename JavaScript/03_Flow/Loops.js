// BreakWhile
i == '0'

while (true) if (i > -1) break

// ContinueWhile
while (i == 0) if (i > -1) continue

// DoWhile
do console.log('I am the do while')
while ((i = 0))

// For
for (let index = 0; index < texto.length; index++)
  console.log(index + '. ' + texto)

// ForEach
const objeto = {
  name: 'Cristo',
  age: 30,
}

Object.entries(objeto).forEach(([property, value], index) => {
  console.log(`Property: ${property}, Value: ${value}, Index: ${index}`)
})

// ForIn
for (const key in objeto) console.log(key)

// ForOf
for (const property of objeto) console.log('Object properties: ', property)

// Map
const array = [1, 2, 3, 4, 5]
const implicitMap = array.map((value) => value * 2)
const explicitMap = array.map((value) => {
  return value.concat(' l')
})

// ObjectKeys
for (const property of Object.keys(object[0]))
  console.log('I am the for of with the keys method: ', property, '\n')
