// 1.1. Tipo numérico
const number = 1
let num: number = 2

// 1.2. Tipo string
let textOne = 'Soy un texto infiriendo el tipo'
let textTwo: string = 'Soy un texto declarando el tipo'

// 1.3. Tipo null
let expression = null

// 1.4. Tipo undefined
let time = undefined

// 1.5. Tipo booleano
let isDone: boolean = false

// 1.6. Tipo any
let objeto

// 2. La palabra name es una palabra reservada
const name = 'Cristo'

// 3.1. Tipar los parámetros para evitar el retorno se infiere
function sum({ a, b }: { a: number, b: number }): number {
    return a + b;
}

// 3.2. Tipar el retorno por seguridad
function sumResult({ a, b }: { a: number, b: number }): string {
    return a + b;
}

// 3.3. Tipar las arrow functions
const restar = (a: number, b: number): number => {
    return a - b
}

// 4. Documentar una función
/**
 * Suma dos números.
 * 
 * @param   {number} a
 * @param   {number} b
 * @returns {number} a + b
 */
function sumTwo(a: number, b: number): number {
    return a + b;
}

// 5.1. Inferir el tipo de dato basado en su inicialización
const animal = "Gato"

// 6.2. Error de conversión (casting)
animal = 3

// 7. Declarar un objeto
const person = {
    // String
    name: 'John Doe',
    // Número
    age: 30
}

// 8. Muestra el objeto cuando pasas el ratón sobre él
person

// 9. Te avisa si una propiedad no existe
person.country

// 10. Sugiere métodos de String con el punto
let convertedToUpperCase = 'Conviérteme a mayúsculas'
convertedToUpperCase.toUpperCase

// 11. Ya no sugiere porque es una any
let convertedToLowerCase
convertedToUpperCase.

// 12. Indicar que no sabemos cuál es el tipo con unknown
let convertedToLowerCaseTwo: unknown

// 13. Función que recibe una función que no devuelve nada y si devuelve no importa
const sayHiFromFunction = (fn: (name: string) => void) => {
    fn('Hola!')
}

sayHiFromFunction((name) => { console.log(`Hola ${name}`) })

// 14. Función que recibe una función que devuelve una string
const sayHelloFromFunction = (fn: (name: string) => string) => {
    // Ejecuta la función que recibe
    let hello = fn('Hola!')
    // Devuelve el resultado de la función
    return hello
}

sayHelloFromFunction((name) => { return `hello ${name}` })

// 15. Función que nunca devuelve nada void si podría pero no le importa
const showError = (error: string): never => {
    throw new Error(error)
}

/**
 * 16. Función anónima que reconoce el tipo de dato en el parámetro
 * Sabe que avengers es un array de strings
 */
const avengers = ["A", "B", "C", "D", "E"]

avengers.forEach(avengers => { console.log(avengers.toUpperCase) })

// 17.1. Al crear un objeto no te deja añadir priedades después
const personTwo = {
    name: 'John Doe',
    age: 30
}

personTwo.country = 'USA'

// 17.2. Crear una función que devuelve un hero pero no sabemos si es del mismo tipo
function getHero({ name, age }: { name: string, age: number }) {
    return {
        name: name,
        age: age
    }
}

// 17.3. Solución mediante los type alias en PascalCase
type Hero = {
    name: string,
    age: number
}

let hero: Hero = {
    name: 'Spiderman',
    age: 25
}

function getNewHero({ name, age }: { name: string, age: number }): Hero {
    return {
        name: name,
        age: age
    }
}

function createNewHero(hero: Hero): Hero {
    const { name, age } = hero
    // Retorna un objeto
    return {
        name, age
    }
}

// 18. Usando las optional properties
type HeroSummary = {
    name: string,
    /**
     * Puede ser undefined si no la pasas a la función no peta
     * Si se la pasas tiene que ser de tipo númerico
     */
    age?: number,
}

// 19.1. Optional change ?, aquí el interrogante es para indicar que si la propiedad esta inicializa se ejecuta el código
let heroSummary: HeroSummary = {
    name: 'Spiderman',
    age: 25
}

heroSummary.age?.toString

// 19.2. Si mutas el objeto anterior rompes el código string a number
heroSummary.age = 3333333333345345

// 19.3. readonly permite solo leer propiedades y no generaria el error anterior
type HeroSummaryTwo = {
    name: 'Spiderman',
    readonly age?: 25
}

/**
 * 20. Template union types 
 * Para crear un estandar de tipos parecido a los enumerados
 * Con valor variable 
 * Solo estructural
 */
type HeroId = `${string}-${string}-${string}-${string}-${string}`

type HeroSummaryThree = {
    id: HeroId
    name: 'Spiderman',
    readonly age?: 25
}

// 21. Union types seria como un enum
type HeroPowerScale = 'low' | 'medium' |'high'

// 22. Tambien se puede indicar varios tipos para una variable
let monthly: number | string = 'Enero'
monthly = 1