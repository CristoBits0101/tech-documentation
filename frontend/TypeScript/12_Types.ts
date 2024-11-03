const personX = {
    name: 'John Doe',
    age: 30
}

// 12.1. Función que devuelve una persona, no sabemos si es del mismo personX
function getHero({ name, age }: { name: string, age: number }) {
    return {
        name: name,
        age: age
    }
}

// 12.2. Solución mediante los type alias en PascalCase
type HeroX = {
    name: string,
    age: number
}

let heroX: HeroX = {
    name: 'Spiderman',
    age: 25
}

function getNewHero({ name, age }: { name: string, age: number }): HeroX {
    return {
        name: name,
        age: age
    }
}
