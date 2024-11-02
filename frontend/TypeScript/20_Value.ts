// 20.1. Type from value crea un tipo mediante las propiedades de un objeto
const address: {
    planet: string,
    city: string,
}

// Crea un tipo a partir del objeto con typeof
type Address = typeof address

// Usa el nuevo tipo para inicializar el objeto
const addressTwitch: Address = {
    planet: 'Mars',
    city: 'Twitch',
}
