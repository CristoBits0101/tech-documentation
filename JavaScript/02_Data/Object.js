// Associative
Object.entries(object_name).forEach(([key, value]) => {
  console.log(`${key}: ${value}`)
})

for (const [key, value] of Object.entries(object_name)) {
  console.log(`${key}: ${value}`)
}

// Call
console.log(object_name)
console.log(object_name.edad)
console.log(object_name['edad'])

// Console
console.log('Screen message')
console.info('Informative message')
console.debug('Debug message')
console.warn('Warning message')
console.error('Error message')
console.table(TablaUsuarios)

// Copy
const object_name2A = object_name1
const object_name2B = { ...object_name1 }

// Create
const object_name = {
  ojos: 'blues',
  pelo: `short`,
  edad: 17,
}

// Date
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

// Get
console.log(Object.get(object_name, 'name'))
console.log(Object.get(object_name, 'age'))

// Keys
const keys = Object.keys(obj)

// Sortconst objectList = [
const objectList = [
  { nombre: Crista, edad: 31 },
  { nombre: Criste, edad: 32 },
  { nombre: Cristi, edad: 33 },
]

object_name.sort((a, b) => {
  return a.nombre.localeCompare(b.nombre)
})

object_name.sort((a, b) => a.nombre - b.nombre)

// Values
const values = object.values()
