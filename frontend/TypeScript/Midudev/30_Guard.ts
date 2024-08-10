// 30.1. Declaramos una interface de Sonic y otra de Mario
interface Sonic {
    nombre: string,
    correr: () => void
}

interface Mario {
    nombre: string,
    saltar: () => void
}

// 30.2. Indicamos que este type puede ser cualquiera de las 2 interfaces
type Personaje = Mario | Sonic

// 30.3. La función determina si el personaje es Sonic para ver si te permite correr
function checkIsPersonaje(personaje: Personaje): personaje is Sonic {
    return (personaje as Sonic).correr === undefined
}

// 30.3. La devuelve una acción dependiendo del personaje
function jugar (personaje: Personaje) {
    if (checkIsPersonaje(personaje)) {
        console.log(`${personaje.nombre} puede correr`)
        personaje.correr()
    } else {
        console.log(`${personaje.nombre} puede saltar`)
        personaje.saltar()
    }
}