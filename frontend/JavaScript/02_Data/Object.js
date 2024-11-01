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

// Copy
const object_name2A = object_name1
const object_name2B = { ...object_name1 }

// Create
const object_name = {
  ojos: 'blues',
  pelo: `short`,
  edad: 17,
}

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

object_name.sort((a, b) => a.nombre - b.nombre);

// Values
const values = object.values()
