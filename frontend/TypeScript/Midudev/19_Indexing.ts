// 19.1. Type indexing
type HeroPropertiesTwo = {
    isActive: boolean
    address: {
        planet: string,
        city: string,
    }
}

// Extrae la propiedad address del type y la almacena
const addressHero: HeroPropertiesTwo['address'] = {
    planet: 'Earth',
    city: 'Madrid'
}
