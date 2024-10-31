// Comparison
console.log(saludo.toLowerCase() === nombre.toLowerCase())
console.log(saludo.toUpperCase() === nombre.toUpperCase())

// Concatenate
const saludo = 'Hola'
const nombre = 'Cristo'

console.log(saludo.concat(nombre) + '\n')
console.log(saludo.concat(' ', nombre) + '\n')
console.log(saludo + ' ' + nombre + '\n')
console.log(`${saludo} ${nombre} \n`)

// Count
let text = 'Hola soy Cristo. Hola soy Cristo. Hola soy Cristo.'
console.log(text.match(/Hola/g))

// Include
console.log(text.includes('Cristo'))
console.log(text.startsWith('Cristo'))
console.log(text.endsWith('Cristo.'))

// Length
console.log(texto.length)

// Limit
console.log(texto.slice(2, 3))

// Posisition
console.log(text.indexOf('Cristo'))
console.log(text[5])
console.log(text.lastIndexOf('Hello'))
console.log(text.charAt(5))

// Replace
console.log(text.replace('Hello', 'Hola'))

// Resize
console.log(text.toLowerCase())
console.log(text.toUpperCase())

// Spaces
text.trim()
text.trimStart()
text.trimEnd()

// Types
let a = 'Hola'
let b = '"Hola"'
let c = '`Hola`'
let d = "'Hola'"
let e = 'Hola'
let f = "'Hola'"
let g = '`Hola`'
let h = '"Hola"'
let i = `Hola`
let j = `'Hola'`
let k = `"Hola"`
let l = `\`Hola\``
let m = `Hola, ${variable_name}`
let n = `<html><p>Hola</p></html>`
