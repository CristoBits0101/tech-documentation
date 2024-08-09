// 29.1. Interface estandar, la diferencia con tipos es que se pueden volver a declarar
interface Heroe {
    id: String,
    nombre: String,
    edad: Number,
    habilidades: Array<String>
}

const hero: Heroe = {
    id: '1',
    nombre: 'Spiderman',
    edad: 25,
    habilidades: ['Spider-sense', 'Agilidad', 'Indomitable']
}

// 29.2. Interface anidadas
interface Producto {
    id: String,
    nombre: String,
    precio: Number
}

interface CarritoDeCompras {
    totalPrice: Number
    productores: Array<Producto>
}

const carrito: CarritoDeCompras = {
    totalPrice: 300,
    productores: [
        {
            id: '1',
            nombre: 'Spiderman',
            precio: 20
        }
    ]
}

// 29.3. Interface con funciones
interface CalculadoraUno {
    sumar(a: Number, b: Number): Number
    restar(a: Number, b: Number): Number
    multiplicar(a: Number, b: Number): Number
    dividir(): void
}

interface CarritoOps {
    add: (producto: Producto) => void
    remove: (productId: String) => void
}