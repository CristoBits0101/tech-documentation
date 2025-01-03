// **Ejemplo 1: Agrupar elementos restantes en arrays**
const numbers = [10, 20, 30, 40, 50]
const [first, second, ...arrayRest] = numbers // 10, 20, array

console.log(first)  // 10: El primer elemento del array
console.log(second) // 20: El segundo elemento del array
console.log(rest)   // [30, 40, 50]: Los elementos restantes agrupados en un nuevo array

// **Ejemplo 2: Agrupar propiedades restantes de un objeto**
const user = { name: 'Alice', age: 25, country: 'USA', profession: 'Engineer' }
const { name, ...otherDetails } = user

console.log(name)         // 'Alice': La propiedad extraída del objeto
console.log(otherDetails) // { age: 25, country: 'USA', profession: 'Engineer' }: Propiedades restantes

// **Ejemplo 3: Uso en funciones con argumentos variables**
function sumAll(...numbers) {
  // numbers es un array que contiene todos los argumentos pasados a la función
  return numbers.reduce((total, num) => total + num, 0) // Suma todos los números
}

console.log(sumAll(1, 2, 3)) // 6
console.log(sumAll(5, 10, 15, 20)) // 50

// **Ejemplo 4: Combinar Rest con parámetros regulares**
function greet(greeting, ...names) {
  // greeting es un argumento normal, names captura el resto de los argumentos como un array
  return `${greeting} ${names.join(', ')}!`
}

console.log(greet('Hello', 'Alice', 'Bob', 'Charlie')) // "Hello Alice, Bob, Charlie!"

// **Ejemplo 5: Rest en parámetros de desestructuración**
const person = { firstName: 'John', lastName: 'Doe', age: 30, gender: 'Male' }
const { firstName, ...restOfDetails } = person

console.log(firstName) // 'John'
console.log(restOfDetails) // { lastName: 'Doe', age: 30, gender: 'Male' }
