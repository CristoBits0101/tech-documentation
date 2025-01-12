// Función que recibe una función que devuelve una string
const sayHelloFromFunction = (fn: (name: string) => string) => {
    // Ejecuta la función que recibe
    let hello = fn('Hola!')
    // Devuelve el resultado de la función
    return hello
}

sayHelloFromFunction((name) => { return `hello ${name}` })
