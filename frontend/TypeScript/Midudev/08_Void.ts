// 8.1. Función que recibe una función que no devuelve nada y si devuelve no importa
const sayHiFromFunction = (fn: (name: string) => void) => {
    fn('Hola!')
}

sayHiFromFunction((name) => { console.log(`Hola ${name}`) })
