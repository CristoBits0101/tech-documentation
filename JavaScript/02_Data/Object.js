// 1. Associative: Iterar sobre claves y valores de un objeto
const Persona = {
  name: 'Cristo',
  age: 35,
}

Object.entries(Persona).forEach(([key, value]) => {
  console.log(`${key}: ${value}`)
})

// 2. Call: Acceder a propiedades de un objeto
console.log(object_name)
console.log(object_name.edad)
console.log(object_name['edad'])

// 3. Copy: Copiar un objeto
const object_name2A = object_name1 // Referencia al mismo objeto
const object_name2B = { ...object_name1 } // Copia superficial

// 4. Create: Crear un objeto
const object_name = {
  ojos: 'blues',
  pelo: `short`,
  edad: 17,
}

// 5. Date: Trabajar con fechas y horas
const now1 = new Date()
const now2 = new Date()
const tenMilliseconds = new Date(10)
const specificDate1 = new Date('2021-02-11')
const specificDate2 = new Date(2022, 8, 7)

const seconds = now1.getSeconds()
const minutes = now1.getMinutes()
const hour = now1.getHours()
const dayOfWeek = now1.getDay()
const dayOfMonth = now1.getDate()
const month = now1.getMonth()
const year = now1.getFullYear()

console.log(`Dates are equal: ${now1.getTime() === now2.getTime()}`)
console.log(`Date in English (GB) format: ${now1.toLocaleDateString('en-GB')}`)

// 6. Keys: Obtener todas las claves de un objeto
const keys = Object.keys(object_name)

// 7. Values: Obtener todos los valores de un objeto
const values = Object.values(object_name) // Devuelve un array

// 8. Sort: Ordenar una lista de objetos
const objectList = [
  { nombre: 'Crista', edad: 31 },
  { nombre: 'Criste', edad: 32 },
  { nombre: 'Cristi', edad: 33 },
]

objectList.sort((a, b) => a.nombre.localeCompare(b.nombre)) // Ordenar por nombre
objectList.sort((a, b) => a.edad - b.edad) // Ordenar por edad
