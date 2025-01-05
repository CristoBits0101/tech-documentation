// 5.1. Infiere el tipo de dato basado en su inicialización
const animal = "Gato" // String

// 5.2. Error de conversión
animal = 3

// 5.3. Infiere el tipo de dato basado en su inicialización
const person = {
    name: 'John Doe', // String
    age: 30           // Number
}

/**
 * 5.4. Función anónima que reconoce el tipo de dato en el parámetro
 * Sabe que avengers es un array de strings
 */
const avengers = ["A", "B", "C", "D", "E"]

avengers.forEach(avengers => { console.log(avengers.toUpperCase) })