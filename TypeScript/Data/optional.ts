// 13.1. Usando las optional properties
type HeroSummary = {
    name: string,
    /**
     * Puede ser undefined si no la pasas a la función no peta
     * Si se la pasas tiene que ser de tipo númerico
     */
    age?: number,
}

// 13.2. Optional change ?, si la propiedad esta inicializa se ejecuta el código
let heroSummary: HeroSummary = {
    name: 'Spiderman',
    age: 25
}

heroSummary.age?.toString
