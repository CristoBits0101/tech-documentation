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

objeto.forEach((propiedad, indice) => {
  console.log(propiedad.name, indice)
})

// ForIn
let objeto_a_iterar = {
  name1: 'Cristo',
  name2: 'Rubén',
  apellido1: 'Pérez',
  apellido2: 'Suárez',
}

for (const key in objeto_a_itera) {
  console.log(key)
}

const objetoAIterar = [
  { name1: 'Cristo', name2: 'Rubén', apellido1: 'Pérez', apellido2: 'Suárez' },
  {
    name1: 'Cristo2',
    name2: 'Rubén2',
    apellido1: 'Pérez2',
    apellido2: 'Suárez2',
  },
]

for (const objeto of objetoAIterar) {
  console.log('Propiedades del objeto:', objeto)
}

for (let propiedadDelObjeto of objeto_a_iterar) {
  console.log('Soy el for of')
  console.log(propiedadDelObjeto)
}

// Map
const array = [1, 2, 3, 4, 5]
const implicitMap = array.map((value) => value * 2)
const explicitMap = array.map((value) => {
  return value.concat(' l')
})

// ObjecKeys
const object = [
  { name1: 'Cristo', name2: 'Rubén', apellido1: 'Pérez', apellido2: 'Suárez' },
  {
    name1: 'Cristo2',
    name2: 'Rubén2',
    apellido1: 'Pérez2',
    apellido2: 'Suárez2',
  },
]

for (const propiedad of Object.keys(object[0])) {
  console.log('Soy el for of con el método keys')
  console.log(propiedad, '\n')
}
