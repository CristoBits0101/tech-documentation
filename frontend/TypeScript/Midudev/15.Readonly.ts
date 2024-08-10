// 15.1. Readonly permite solo leer propiedades y no generaria el error de mutabilidad
type HeroSummaryTwo = {
    name: 'Spiderman',
    readonly age?: 25
}
