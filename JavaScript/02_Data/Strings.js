// 1. Comparison: Comparar cadenas ignorando mayúsculas o minúsculas
console.log(saludo.toLowerCase() === nombre.toLowerCase())
console.log(saludo.toUpperCase() === nombre.toUpperCase())

// 2. Concatenate: Unir cadenas de diferentes maneras
const saludo = 'Hola'
const nombre = 'Cristo'
console.log(saludo.concat(nombre) + '\n')
console.log(saludo.concat(' ', nombre) + '\n')
console.log(saludo + ' ' + nombre + '\n')
console.log(`${saludo} ${nombre} \n`)

// 3. Count: Contar ocurrencias de una palabra o frase
let text = 'Hola soy Cristo. Hola soy Cristo. Hola soy Cristo.'
console.log(text.match(/Hola/g))

// 4. Include: Verificar si una cadena incluye, inicia o termina con un texto
console.log(text.includes('Cristo'))
console.log(text.startsWith('Cristo'))
console.log(text.endsWith('Cristo.'))

// 5. Length: Obtener la longitud de una cadena
console.log(text.length)

// 6. Limit: Extraer una parte de una cadena
console.log(text.slice(2, 3))

// 7. Position: Encontrar la posición o el carácter en una cadena
console.log(text.indexOf('Cristo'))
console.log(text[5])
console.log(text.lastIndexOf('Hello'))
console.log(text.charAt(5))

// 8. Replace: Reemplazar texto en una cadena
console.log(text.replace('Hello', 'Hola'))

// 9. Resize: Cambiar el texto a minúsculas o mayúsculas
console.log(text.toLowerCase())
console.log(text.toUpperCase())

// 10. Spaces: Eliminar espacios al inicio, final o ambos
text.trim()
text.trimStart()
text.trimEnd()

// 11. Types: Diferentes formas de declarar cadenas
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
